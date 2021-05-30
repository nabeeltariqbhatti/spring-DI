package demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		PrintWriter pw = response.getWriter();
	int s =Integer.parseInt(request.getParameter("k"));
		pw.println("Square of addition ="  + s );
				
		
		
		

		
	}

}
