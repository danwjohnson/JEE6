package hello.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
					  HttpServletResponse response)
		throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setBufferSize(8192);
		PrintWriter out = response.getWriter();
		
		// write the data of the response
		out.println("<html>" 
				+ "<head><title>Servlet Hello</title></head>");
		
		out.println("<body bgcolor=\"#ffffff\">"
				+ "<img src=\"/JEE6/duke.waving.gif\" alt=\"Duke waving\">"
				+ "<h2>Hello, my name is Duke. What's yours?</h2>"
				+ "<form method=\"get\">"
				+ "<input type=\"text\" name=\"username\" size=\"25\">"
				+ "<p></p>"
				+ "<input type=\"submit\" value=\"Submit\">" 
				+ "<input type=\"reset\" value=\"Reset\">"
				+ "</form>");
		
		String username = request.getParameter("username");
		if (username != null && username.length() > 0) {
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/response");
			
			if (dispatcher != null) {
				
				dispatcher.include(request, response);
				
			}
			
		}
		
		out.println("</body></html>");
		out.close();
		
	} // end doGet()
	
} // end of GreetingsServlet class
