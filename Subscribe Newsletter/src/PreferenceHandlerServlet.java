

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PreferenceHandlerServlet
 */
@WebServlet("/PreferenceHandlerServlet")
public class PreferenceHandlerServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setPreference(Boolean.parseBoolean((String)request.getAttribute("preference")));
		request.setAttribute("user", user);
		RequestDispatcher rd = request.getRequestDispatcher("personal-info.jsp");
		rd.forward(request, response);
	}

}
