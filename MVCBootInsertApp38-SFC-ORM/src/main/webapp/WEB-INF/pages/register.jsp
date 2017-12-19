<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="post" commandName="stCmd">
 name :: <form:input path="sname"/><br>
 address :: <form:input path="sadd"/><br>
 <input type="submit"  value="register"/>
</form:form>

${result}