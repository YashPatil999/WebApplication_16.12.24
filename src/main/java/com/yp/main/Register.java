package com.yp.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
		int Age = Integer.parseInt(req.getParameter("age"));
		String DOB = req.getParameter("dob");
		String Address = req.getParameter("address");
		String City = req.getParameter("city");
		String State = req.getParameter("state");
		String Country = req.getParameter("country");
		String Mobile_Number = req.getParameter("mnumber");
		String Degree = req.getParameter("degree");
		int Passing_Year = Integer.parseInt(req.getParameter("pyear"));
		String Email = req.getParameter("email");
		String Password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
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
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			PreparedStatement ps = conn.prepareStatement("insert into StuRegister values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, Fname);
			ps.setString(2, Lname);
			ps.setString(3, Gender);
			ps.setInt(4, Age);
			ps.setString(5, DOB);
			ps.setString(6, Address);
			ps.setString(7, City);
			ps.setString(8, State);
			ps.setString(9, Country);
			ps.setString(10, Mobile_Number);
			ps.setString(11, Degree);
			ps.setInt(12, Passing_Year);
			ps.setString(13, Email);
			ps.setString(14, Password);
			int count = ps.executeUpdate();
			if(count==0)
			{
				
				out.print("<h3 style='color:red;'>Data Not Added</h3>");
			}
			else {
				out.print("<h3 style='color:green;'>Data Added</h3>");
			}
		}
		catch(Exception ex)
		{
			out.print("<h3 style='color:red;'>"+ex.getMessage()+"</h3>");
		}
	}
}
