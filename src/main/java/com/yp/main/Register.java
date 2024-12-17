package com.yp.main;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Fname = req.getParameter("fname");
		String Lname = req.getParameter("lname");
		String Gender = req.getParameter("gender");
		String Age = req.getParameter("age");
		String DOB = req.getParameter("dob");
		String Address = req.getParameter("address");
		String City = req.getParameter("city");
		String State = req.getParameter("state");
		String Country = req.getParameter("country");
		String Mobile_Number = req.getParameter("mnumber");
		String Degree = req.getParameter("degree");
		String Passing_Year = req.getParameter("pyear");
		String Email = req.getParameter("email");
		String Password = req.getParameter("password");
		
		System.out.println(Fname);
		System.out.println(Lname);
		System.out.println(Gender);
		System.out.println(Age);
		System.out.println(DOB);
		System.out.println(Address);
		System.out.println(City);
		System.out.println(State);
		System.out.println(Country);
		System.out.println(Mobile_Number);
		System.out.println(Degree);
		System.out.println(Passing_Year);
		System.out.println(Email);
		System.out.println(Password);
	}
}
