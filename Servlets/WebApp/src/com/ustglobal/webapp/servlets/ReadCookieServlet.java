package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadCookieServlet extends  HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] cookies = req.getCookies();
		PrintWriter out = resp.getWriter();

		if(cookies==null) {
			out.println("<h1>no cookie found</h1>");
		}else {
			for(Cookie cookie:cookies) {
				String name = cookie.getName();
				if(name.equals("Emp-name")) {
					out.println("<h1> for emp-name cookie value is:");
					out.println(cookie.getValue());
					out.println("</h1>");
				}
			}
		}

	}//end of doGet()
}//end of ReadCookieServlet
