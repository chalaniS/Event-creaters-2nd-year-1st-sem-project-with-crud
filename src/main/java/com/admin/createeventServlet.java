package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createeventServlet")
public class createeventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {			
		
		System.out.print("dopost eke ekat awa");
		String ename = request.getParameter("ename");
		String edate = request.getParameter("edate");
		String etype = request.getParameter("etype");
		String elocation = request.getParameter("elocation");
		String etime = request.getParameter("etime");    
	
		boolean isTrue;
	
		isTrue = adminDButil.createEvent( ename, edate, etype, elocation, etime);	   	
	
		if(isTrue == true) { 
		
		System.out.print("data insert una");
		
		RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		dis.forward(request, response);

		
		} else {
			System.out.print("data giy nh");
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}

	}
}
