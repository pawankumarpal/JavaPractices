package rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ResponseCache;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TvSeries {

	public static void main(String[] args) throws MalformedURLException, IOException {

	final String API_URL = "https://jsonmock.hackerrank.com/api/tvseries";
	// Replace with actual API endpoint
	final String API_KEY = "your_api_key"; // Replace with your API key
	try
	{ // Create URL object
		URL url = new URL(API_URL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//conn.setRequestMethod("GET");
		//conn.setRequestProperty("Authorization", "Bearer " + API_KEY);
		conn.connect();
		// Check if the request was successful
		int responseCode = conn.getResponseCode();
		if (responseCode != 200) {
			throw new RuntimeException("HttpResponseCode: " + responseCode);
		} else {
			// Parse JSON response
			JSONParser parser = new JSONParser();
			JSONObject jsonResponse = (JSONObject) parser.parse(new InputStreamReader(conn.getInputStream()));
			//System.out.println(jsonResponse);
			JSONArray data = (JSONArray)  jsonResponse.get("data");
			//System.out.println(data);

			//System.out.println(data.size());
			
			for(int i=1;i<data.size();i++) {
				JSONObject movieData = (JSONObject) (data.get(i));
				String genre = (String) movieData.get("name");
				double imdbRating = (double)movieData.get("imdb_rating");
				// Print results
				System.out.println("Genre: " + genre);
				System.out.println("IMDb Rating: " + imdbRating);
			}

		}
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}
}
// TODO Auto-generated method stub
//		String baseUrl = "https://jsonmock.hackerrank.com/api/tvseries";
//		
//		HttpURLConnection connection = (HttpURLConnection) new URL (baseUrl).openConnection();
//		connection.setRequestMethod("GET");
//		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//		StringBuilder resposne = new StringBuilder();
//		String line;
//		while((line= reader.readLine())!=null) {
//			resposne.append(line);
//		}
//		reader.close();
//		System.out.println(reader.toString());
//		
//		JSONObject jsonResponse = new JSONObject();
//		jsonResponse = ;
//
//		

}
