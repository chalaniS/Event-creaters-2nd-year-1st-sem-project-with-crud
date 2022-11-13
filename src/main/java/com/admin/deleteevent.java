package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteevent")
public class deleteevent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.print("dopost eke ekat awa");		
		String eid = request.getParameter("eid");    
	
		boolean isTrue;
	
		isTrue = adminDButil.deleteEvent(eid);	   	
	
		if(isTrue == true) { 
		
		System.out.print("data delete una");
		
		RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		dis.forward(request, response);

		
		} else {
			System.out.print("data delete un nh");
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}
