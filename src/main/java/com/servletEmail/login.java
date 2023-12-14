package com.servletEmail;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class login extends GenericServlet  {

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			PrintWriter pw=res.getWriter();	
		//	super.service(req, res);
			String myemail=(String)req.getParameter("email");
			String mypass=(String)req.getParameter("password");
			if(myemail.equals("raj123@gmail.com")&& mypass.equals("raj1234")){
				System.out.println("login sucessfull");
				pw.println(myemail);
				pw.println(mypass);
			}
			else
			{
				System.out.println("login failed");
			}
		}

}
