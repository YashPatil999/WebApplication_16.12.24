package com.yp.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			PreparedStatement ps = conn.prepareStatement("select * from StuRegister where email=? AND pass=?");
			ps.setString(1, Email);
			ps.setString(2, Password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				out.print("<h3 style='color:green;'>Login Success</h3>");
			}
			else
			{
				out.print("<h3 style='color:red;'>Login Faild Because User Not Found Or Password was wrong</h3>");
			}
		} catch (Exception ex) {
			out.print("<h3 style='color:red;'>"+ex.getMessage()+"</h3>");
		}
	}
}
