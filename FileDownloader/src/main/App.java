package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.net.URL;
import java.nio.file.*;
import java.util.concurrent.*;
import java.io.*;

public class App {
	private static final int THREAD_POOL_SIZE = 2; // Adjust thread pool size as necessary

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

		String[] fileUrls = { "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png",
								"https://drive.google.com/file/d/1kk7YGMmOZBtPiGCoe5OHcsHUF66J4O7x/view?usp=sharing"};
		String saveDir = "C:/Users/pawan/Downloads/downloaded/"; // Ensure this directory exists

		DownloadFile dw = new DownloadFile();

		for (String url : fileUrls) {
			executorService.submit(() -> {
				try {
					dw.downloadFile(url, saveDir);
				} catch (IOException e) {
					System.err.println("Error downloading file from URL: " + url);
					e.printStackTrace();
				}
			});
		}

		executorService.shutdown();
	}

}
