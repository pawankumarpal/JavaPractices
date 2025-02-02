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
import google.Constants;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RunAqiData {
	Constents consts = new Constents();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your pincode: ");
        String pincode = scanner.nextLine().trim();
        
        System.out.print("Enter your country: ");
        String country = scanner.nextLine().trim();
        
        scanner.close();
        
        double[] latLong = getLatLongFromPincode(pincode, country);
        if (latLong != null) {
            checkWeather(latLong[0], latLong[1]);
        } else {
            System.out.println("Error: Unable to fetch latitude and longitude.");
        }
    }
    
    private static double[] getLatLongFromPincode(String pincode, String country) {
        try {
            String apiUrl = "https://api.positionstack.com/v1/forward?access_key=" + Constents.PINCODE_KEY + "&query=" + pincode + "," + country;
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            if (conn.getResponseCode() == 200) {
                InputStreamReader reader = new InputStreamReader(conn.getInputStream());
                JSONParser parser = new JSONParser();
                JSONObject responseJson = (JSONObject) parser.parse(reader);
                
                JSONObject data = (JSONObject) ((org.json.simple.JSONArray) responseJson.get("data")).get(0);
                double latitude = (double) data.get("latitude");
                double longitude = (double) data.get("longitude");
                
                return new double[]{latitude, longitude};
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private static void checkWeather(double latitude, double longitude) {
        try {
            String apiUrl = "https://api.airvisual.com/v2/nearest_city?lat=" + latitude + "&lon=" + longitude + "&key=" + Constents.AIRVISUAL_KEY;
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            if (conn.getResponseCode() == 200) {
                InputStreamReader reader = new InputStreamReader(conn.getInputStream());
                JSONParser parser = new JSONParser();
                JSONObject responseJson = (JSONObject) parser.parse(reader);
                
                JSONObject data = (JSONObject) responseJson.get("data");
                JSONObject current = (JSONObject) data.get("current");
                JSONObject weather = (JSONObject) current.get("weather");
                JSONObject pollution = (JSONObject) current.get("pollution");
                
                long temperature = (long) weather.get("tp"); // Temperature in Celsius
                long humidity = (long) weather.get("hu"); // Humidity percentage
                long aqi = (long) pollution.get("aqius"); // Air Quality Index (US standard)
                
                System.out.println("Temperature: " + temperature + "°C");
                System.out.println("Humidity: " + humidity + "%");
                System.out.println("Air Quality Index: " + aqi);
                
                if (isSuitableForRunning(temperature, humidity, aqi)) {
                    System.out.println("Conditions are suitable for outdoor running.");
                } else {
                    System.out.println("Conditions are NOT suitable for outdoor running.");
                }
            } else {
                System.out.println("Error: Unable to fetch weather data.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static boolean isSuitableForRunning(long temperature, long humidity, long aqi) {
        return (temperature >= 10 && temperature <= 30) && (humidity >= 30 && humidity <= 70) && (aqi <= 100);
    }
}
