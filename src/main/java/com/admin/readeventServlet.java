package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readeventServlet")
public class readeventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("etype");	
	
		try {
			List<event> eveDetails = adminDButil.getevent(type);	
			System.out.println(eveDetails + "me details");
   			request.setAttribute("eveDetails", eveDetails);
   			
   			RequestDispatcher dis = request.getRequestDispatcher("eventRead.jsp");
   			dis.forward(request, response);
   			System.out.println("read pass kara");
   			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
