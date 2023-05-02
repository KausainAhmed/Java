package com.servlet.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/kausain",initParams = {
//@WebInitParam (name = "driver", value="com.mysql.jdbc.Driver"),
//})


public class ConfigDemo extends HttpServlet{
	private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	
	/*
	 * ServletContext sc = getServletContext(); String in =
	 * sc.getInitParameter("driver"); out.println(n1);
	 */
	
ServletConfig sc = getServletConfig();
String driver = sc.getInitParameter("driver");
out.println("Driver is"+driver);
out.close();
}
}
