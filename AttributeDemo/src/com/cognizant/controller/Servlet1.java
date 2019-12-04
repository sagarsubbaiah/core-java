package com.cognizant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String name = request.getParameter("uname");
		//Student stud = new Student("Tom",23,"B.Tech");
		session.setAttribute("uname", name);
		//session.setAttribute("age", stud.age);
		PrintWriter pw = response.getWriter();
		pw.println("welcome: "+name);
		pw.println("<a href='Servlet2'>visit</a>");
		//session.setAttribute("degree", stud.degree);
	}

}
