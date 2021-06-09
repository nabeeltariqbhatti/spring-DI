package demoapp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {

        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i + j;
        k *= k;
        Cookie cookie = new Cookie("k", k + "");
        res.addCookie(cookie);
        res.sendRedirect("sq");
//		
//		request.setAttribute("k", k);
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		rd.forward(request, res);


    }

}
