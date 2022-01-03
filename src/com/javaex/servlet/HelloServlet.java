package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	//필드
    //생성자 -기본생성자 사용  
    //메소드 g/s
    //메소드일반
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//코드작성
	      response.setContentType("text/html;charset=utf-8");
	      
	      PrintWriter out = response.getWriter();
	     
	  	for(int i=1;i<=9;i++){
	      out.println("<!DOCTYPE html>");
	      out.println("<html>");
	      out.println("   <head>");
	      out.println("      <meta charset='UTF-8'>");
	      out.println("      <title>Insert title here</title>");
	      out.println("   </head>");	      out.println("   <body>");
	      out.println("      <h1>servlet: helloworld!!!! 안녕 servlet!!!!!</h1>");
	      out.println("   </body>");
	      out.println("</html>");
	  	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
