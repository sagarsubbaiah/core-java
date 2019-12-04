

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

@WebServlet("/EmployeeDetailsServlet")
public class EmployeeDetailsServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Department[] = {"HealthCare","Information Technology","Maintenance","Human Resource"};
        Employee emp = new Employee(0, null, null, null, false, null, 0);
        emp.setEmployeeId(799765);
        emp.setEmployeeName("John");
        emp.setGender("Male");
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try {
                        date = form.parse("08/07/1987");
        } catch (ParseException e) {
        
                        e.printStackTrace();
        }
        emp.setDateOfbirth(date);
        emp.setEmployee(true);
        request.setAttribute("emp", emp);
        request.setAttribute("list", Department);
        emp.setDepartment("Information Technology");
        emp.setSalary(120000);
        RequestDispatcher rd = request.getRequestDispatcher("edit-employee.jsp");
        rd.forward(request,response);

	}

}
