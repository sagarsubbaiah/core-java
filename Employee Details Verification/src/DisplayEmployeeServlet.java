

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayEmployeeServlet")
public class DisplayEmployeeServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		long id = Long.parseLong(request.getParameter("id"));
		String gender = request.getParameter("gender");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		boolean fte;
		Date dob = null;
		try {
			dob = sdf.parse(request.getParameter("dob"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(request.getParameter("fte").equalsIgnoreCase("yes")) {
			fte = true;
		}
		else
			fte = false;
		String department = request.getParameter("department");
		long salary = Long.parseLong(request.getParameter("salary"));
		Employee obj = new Employee(id,name,gender,dob,fte,department,salary);
		RequestDispatcher rd = request.getRequestDispatcher("display-details.jsp");
		
		
	}

}
