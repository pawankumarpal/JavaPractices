package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator.RequestorType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginMain extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String credentialsUserName[] = { "pawankumarpal", "pradeepit25", "vinay991", "lalkanhiya" };
		String credentialsPassword[] = { "25@Recommend", "Pradeep@321", "4341560@Vinay", "9354093312" };
		String credentialsName [] = {"Pawan Kumar","Pradeep Kumar","Vinay Kumar","Kanhiya Lal"};
//		List<List<String>> bucketList = new ArrayList<>(List.of(
//		        List.of("Bungee Jumping", "Snow Skeeing", "Para Jump","Trip to Europe with Parents","4 Dham Yatra","Visit Banaras","Party in Goa","Enjoy Snowfall","Do Farming"),
//		        List.of("d", "e", "f")));
		
        List<Map<String, String>> activitiesList = new ArrayList<>() {{
            add(new HashMap<>() {{
                put("Bungee Jumping", "Done");
                put("Snow Skeeing", "Not Done");
                put("Para Jump", "Done");
                put("Trip to Europe with Parents", "Not Done");
                put("4 Dham Yatra", "Not Done");
                put("Visit Banaras", "Not Done");
                put("Party in Goa", "Not Done");
                put("Enjoy Snowfall", "Not Done");
                put("Do Farming", "Not Done");
            }});
        }};
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.println("User Name:" + userName + " Password:" + password);
		PrintWriter out = res.getWriter();
		String name="";
		String access = "";
		int index =0;
		//res.sendRedirect("/Login/Welcome.html");

		for (int i = 0; i < credentialsUserName.length; i++) {
			System.out.println("HAHA INSIDE LOOP");
			System.out.println("UserName:"+credentialsUserName[i]+" Passwordd:"+password);
			if((credentialsUserName[i]).equalsIgnoreCase(userName) && 
					credentialsPassword[i].equals(password)) {
				System.out.println("INSIDE LOOP");

				name = credentialsName[i];
				access = "Yes";
				index =i;
				break;
			}
		}
		System.out.println("ACCESS VALUE:"+access);
		if(access.equalsIgnoreCase("Yes")) {
			String bucket = "<br><ul>";
			Map<String, String> map = activitiesList.get(index);
            for (String key : map.keySet()) {
                String value = map.get(key); // Get the value for each key
                bucket=bucket.concat("<li>"+key+":"+value+"</li>");
            }
            bucket = bucket.concat("</ul>");
			out.println("Welocme:"+ name+bucket);
		}
	}

}
