package demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int s = 0;
        PrintWriter pw = response.getWriter();
        Cookie[] cookies = request.getCookies();

        for (Cookie c : cookies) {

            if (c.getName().equals("k")) {
                s = Integer.parseInt(c.getValue());
            }
        }


        pw.println("<html><body 'bgcolor=cyan'>");
        pw.println("Square of addition =" + s);
        pw.println("</body></html>");

//		Thread thread = new Thread();
//		try {
//			thread.sleep(20000);
//			
//			ServletContext context = getServletContext();
//			String name = context.getInitParameter("Name");
//			String mobile = context.getInitParameter("Mobile");
//			pw.println(name + " " + mobile );
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


    }

}
