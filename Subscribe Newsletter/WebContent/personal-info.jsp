<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Personal Information</h2>
<br>
<form action="PersonalInformationHandlerServlet" method="post">
Name: <input type="text" name="name" value="<c:out value="${user.name}" />"/><br>
Email Address: <input type="text" name="email" value="<c:out value="${user.emailId}" />" /><br>
<input type="submit" />
</form>
</body>
</html>