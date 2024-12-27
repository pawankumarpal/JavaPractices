package main;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

	class DownloadFile {

	    public void downloadFile(String imageUrl, String saveDir) throws IOException {
	    	 // Ensure the target directory exists
	        File directory = new File(saveDir);
	        if (!directory.exists()) {
	            if (directory.mkdirs()) {
	                System.out.println("Created the directory: " + saveDir);
	            } else {
	                System.out.println("Failed to create directory: " + saveDir);
	                return;  // Exit if the directory creation fails
	            }
	        } 
	    	
	    	// If the URL is from Google Drive, we need to adjust it for direct downloading
	        if (imageUrl.contains("drive.google.com")) {
	            imageUrl = convertGoogleDriveUrlToDirectDownload(imageUrl);
	        }

	        System.out.println("Starting download from: " + imageUrl);

	        URL url = new URL(imageUrl);
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");  // Use GET to download the content
	        connection.setConnectTimeout(5000);  // Set a timeout (5 seconds)
	        connection.setReadTimeout(5000);     // Set a read timeout (5 seconds)

	        int responseCode = connection.getResponseCode();
	        if (responseCode != HttpURLConnection.HTTP_OK) {
	            System.err.println("Failed to download file. HTTP response code: " + responseCode);
	            return;
	        }

	        // Get the MIME type (Content-Type) from the HTTP response header
	        String contentType = connection.getContentType();
	        String fileExtension = getFileExtension(contentType);

	        // Generate the file name by sanitizing the URL and adding the file extension if not already present
	        String fileName = sanitizeFileName(imageUrl.substring(imageUrl.lastIndexOf("/") + 1));

	        // Check if file name already contains the extension
	        if (!fileName.endsWith(fileExtension)) {
	            fileName = fileName + fileExtension; // Append extension only if it's not already present
	        }

	        // Download the image content
	        try (InputStream in = connection.getInputStream();
	             BufferedInputStream bis = new BufferedInputStream(in);
	             FileOutputStream fileOutputStream = new FileOutputStream(saveDir + fileName)) {

	            byte[] dataBuffer = new byte[1024];
	            int bytesRead;

	            while ((bytesRead = bis.read(dataBuffer, 0, 1024)) != -1) {
	                fileOutputStream.write(dataBuffer, 0, bytesRead);
	            }

	            System.out.println("Downloaded: " + fileName);
	        } finally {
	            connection.disconnect(); // Close the connection
	        }
	    }

	    public static String sanitizeFileName(String urlFileName) {
	        // Replace invalid characters with an underscore or remove them
	        String sanitized = urlFileName.replaceAll("[<>:\"/\\|?*]", "_");

	        // Optionally, truncate if the file name is too long for the file system
	        if (sanitized.length() > 255) {
	            sanitized = sanitized.substring(0, 255);
	        }

	        return sanitized;
	    }

	    public static String getFileExtension(String contentType) {
	        // Determine the file extension based on MIME type
	        if (contentType != null) {
	            if (contentType.startsWith("image/jpeg")) {
	                return ".jpg";
	            } else if (contentType.startsWith("image/png")) {
	                return ".png";
	            } else if (contentType.startsWith("image/gif")) {
	                return ".gif";
	            } else if (contentType.startsWith("image/bmp")) {
	                return ".bmp";
	            } else if (contentType.startsWith("image/webp")) {
	                return ".webp";
	            } else {
	                return ".jpg"; // Default to .jpg if MIME type is unknown or unsupported
	            }
	        }
	        return ".jpg"; // Default to .jpg if content type is not available
	    }

	    // Method to convert Google Drive URL to direct download link
	    public static String convertGoogleDriveUrlToDirectDownload(String driveUrl) {
	        // Extract the file ID from the Google Drive URL
	        String fileId = null;
	        String[] urlParts = driveUrl.split("/");

	        // Look for the file ID part of the URL
	        for (String part : urlParts) {
	            if (part.startsWith("d")) {
	                fileId = part.split("=")[1];
	                break;
	            }
	        }

	        if (fileId != null) {
	            // Construct the direct download URL using the file ID
	            return "https://drive.google.com/uc?export=download&id=" + fileId;
	        } else {
	            throw new IllegalArgumentException("Invalid Google Drive URL: " + driveUrl);
	        }
	    }

}
