package google;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class RunnersApi {

	public static void main(String[] args) {
		Constants consts = new Constants(); 
		// TODO Auto-generated method stub
		/**final String baseUrl = "https://airquality.googleapis.com/v1/currentConditions:lookup?key=API_KEY";
		final String API_KEY = consts.aqiKey;
		
		String finalUrl = baseUrl.replace("API_KEY", API_KEY);
		
		try {
			URL url = new URL(finalUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			
			int responseCode = conn.getResponseCode();
			if(responseCode !=200) {
				System.out.println("Connection Failed, Response Code:"+responseCode);
			}else {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		String apiKey = consts.aqiKey;
        String lat = "37.7749"; // Latitude for San Francisco (example)
        String lon = "-122.4194"; // Longitude for San Francisco (example)
        String endpoint = String.format(
                "https://www.googleapis.com/airquality/v1/latest?lat=%s&lon=%s&key=%s",
                lat, lon, apiKey
        );
        System.out.println(endpoint);

        HttpURLConnection connection = null;

        try {
            // Create the URL object
            URL url = new URL(endpoint);

            // Open connection
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");

            // Check the response code
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse JSON response
                JSONParser parser = new JSONParser();
                JSONObject jsonResponse = (JSONObject) parser.parse(response.toString());

                // Print the JSON response
                //System.out.println("Air Quality Data: " + jsonResponse.toJSONString());
            } else {
            	System.out.println(connection.getContent());
                System.out.println("Error: " + responseCode + " - " + connection.getResponseMessage());
            }

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
	}

}
