package com.yp.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String Email = req.getParameter("email");
		String Password = req.getParameter("pass");
		
		System.out.println(Email);
		System.out.println(Password);
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement ps = conn.prepareStatement("select fname,lname from StuRegister where email=? AND pass=?");
			ps.setString(1, Email);
			ps.setString(2, Password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				req.setAttribute("message","Welcome " +rs.getString("fname")+" "+rs.getString("lname"));
				RequestDispatcher rd = req.getRequestDispatcher("LoginPage.jsp");
				rd.include(req, resp);
			}
			else
			{
				req.setAttribute("message","User Not Found!!!!");
				RequestDispatcher rd = req.getRequestDispatcher("LoginPage.jsp");
				rd.include(req, resp);
			}
		} catch (Exception ex) {
			req.setAttribute("message",ex.getMessage());
			RequestDispatcher rd = req.getRequestDispatcher("LoginPage.jsp");
			rd.include(req, resp);
		}
	}
}
