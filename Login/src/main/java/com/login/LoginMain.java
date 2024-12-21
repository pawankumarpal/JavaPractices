package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator.RequestorType;

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
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.println("User Name:" + userName + " Password:" + password);
		PrintWriter out = res.getWriter();
		String name="";
		String access = "";
		//res.sendRedirect("/Login/Welcome.html");

		for (int i = 0; i < credentialsUserName.length; i++) {
			System.out.println("HAHA INSIDE LOOP");
			System.out.println("UserName:"+credentialsUserName[i]+" Passwordd:"+password);
			if((credentialsUserName[i]).equalsIgnoreCase(userName) && 
					credentialsPassword[i].equals(password)) {
				System.out.println("INSIDE LOOP");

				name = credentialsName[i];
				access = "Yes";
				break;
			}
		}
		System.out.println("ACCESS VALUE:"+access);
		if(access.equalsIgnoreCase("Yes")) {
			out.println("Welocme:"+ name);
		}
	}

}
