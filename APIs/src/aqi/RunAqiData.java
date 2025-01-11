package aqi;

import request.AqiRequest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.InputStreamReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import constants.Constents;

public class RunAqiData {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		AqiRequest a = new AqiRequest();
		Constents c = new Constents();

		String baseUrl = a.AIR_VISUAL;
		String key = c.AIRVISUAL_KEY;
		String lat = "28.60";
		String longt = "77.04";
		baseUrl = baseUrl.replace("##LATITUDE##", lat);
		baseUrl = baseUrl.replace("##LONGITUDE##", longt);
		baseUrl = baseUrl.replace("{{##APIKEY##}}", key);
		System.out.println(baseUrl);
		try {
			URL url = new URL(baseUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();

			int responseCode = conn.getResponseCode();
			System.out.println(responseCode);
			if (responseCode != 200) {
				throw new RuntimeException("HttpResponseCode: " + responseCode);
			} else {
				JSONParser parser = new JSONParser();
				JSONObject jsonResponse = (JSONObject) parser.parse(new InputStreamReader(conn.getInputStream()));
				System.out.println(jsonResponse);

				//JSONArray data = (JSONArray) jsonResponse.get("data");
				JSONArray jsonArray = (JSONArray) parser.parse(jsonResponse.toString());
				for (Object obj : jsonArray) {
					JSONObject jsonObject = (JSONObject) obj;
					JSONObject dataObject = (JSONObject) jsonObject.get("data");

					String city = (String) dataObject.get("city");
					String state = (String) dataObject.get("state");

					System.out.println("City: " + city);
					System.out.println("State: " + state);
				}

			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
