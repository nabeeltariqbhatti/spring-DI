package demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i +j;
		k *= k;
		res.sendRedirect("sq?k="+k);
//		
//		request.setAttribute("k", k);
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		rd.forward(request, res);
		
	
		
		
		
	}

}
