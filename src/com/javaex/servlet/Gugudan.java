package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Gugudan() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=utf-8");
		
			int dan =Integer.parseInt(request.getParameter("dan"));
			PrintWriter out = response.getWriter();
			for(int i=1;i<=9;i++){		 
				out.println("<table border='1'>");
	     out.println(		"<tr>");
	     out.println(			"<td>"+dan+"</td>");
	     out.println(			"<td>"+i+"</td>");
	     out.println(			"<td>"+dan*i+"</td>");
	 	 out.println(" 		</tr>" );
	
	 	 out.println("</table>");
	}
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
