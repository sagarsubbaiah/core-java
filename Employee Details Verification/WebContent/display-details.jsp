<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="editform" action="DisplayEmployeeServlet"
        method=post>

    <h1>Employee Details</h1>
    </br>
    <p>
        Id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :
        <c:out value="${emp.getEmployeeId()}" />
    </p>

    Name &nbsp;&nbsp;&nbsp;&nbsp;:
    <input type="text" name="employeeName" value="<c:out value="${emp.getEmployeeName()}"/>" />
    </br>
    <p>
        Gender &nbsp;&nbsp;&nbsp;&nbsp;: <input type="radio" name="gender"
            value="male"
            <c:if test="${emp.getGender() eq 'Male'}"> checked  </c:if> />Male
        <input type="radio" name="gender" value="female"
            <c:if test="${emp.getGender() eq 'Female'}"> checked  </c:if> />Female
    </p>
    <p>
        Date of Birth &nbsp;&nbsp;&nbsp;&nbsp; :<input type="date" name="dateOfbirth"
            value="<fmt:formatDate type="date" pattern='dd/MM/yyyy' dateStyle="medium" value = '${emp.getDateOfbirth()}'/>" />
    </p>
    <p>
        Fulltime Employee &nbsp;&nbsp;&nbsp;&nbsp; :<input type="checkbox" name="active"
            <c:if test="${emp.isEmployee() eq 'true'}"> checked  </c:if> />
    </p>
    <p>
         Department &nbsp;&nbsp;&nbsp;&nbsp; :<select name="department">
                    <c:forEach items="${list}" var="data">
                    <option value = "${data}"
                    <c:if test="${emp.getDepartment() eq data}"> selected </c:if>>${data}</option>
                    </c:forEach>
                </select>
    </p>
    <p>
         Salary  &nbsp;&nbsp;&nbsp;&nbsp;:
    <input type="text" value="<c:out value="${emp.getSalary()}"/>" />     
    </p>        
    <input type="hidden" name="employeeId" value="${employee.id}">
    <input type="submit" value="submit">     
</form>
</body>

</body>
</html>