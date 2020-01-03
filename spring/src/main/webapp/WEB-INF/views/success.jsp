<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body>
	 <form:form action="saveUser"  method="post" modelAttribute="userForm" >
        <table>
            <tr>
                <td>Name : <form:input path="name" /></td>
            </tr>
            <tr>
                <td> Party : <form:input path="party" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add Cotastant"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>