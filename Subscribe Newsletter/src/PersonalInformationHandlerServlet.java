

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonalInformationHandlerServlet
 */
@WebServlet("/PersonalInformationHandlerServlet")
public class PersonalInformationHandlerServlet extends HttpServlet {
	
	

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setName((String)request.getAttribute("name"));
		user.setEmailId((String)request.getAttribute("email"));
		request.setAttribute("user", user);
		RequestDispatcher rd = request.getRequestDispatcher("preference.jsp");
		rd.forward(request, response);
		
		
		
	}

}
