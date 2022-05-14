<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello</h1>
	<form action='/postForm' method='POST'>
	<p>Pick any number from 5 to 25</p>
	<input type="number" name="num" />
	<p>Enter the name of any city.</p>
	<input type="text" name="city"/>
	<p>Enter the name of any real person</p>
	<input type="text" name="person"/>
	<p>Enter professional endeavor or hobby:</p>
	<input type="text" name="hobby"/>
	<p>Enter any type of living thing</p>
	<input type="text" name="thing"/>
	<p>Say something nice to someone:</p>
	<textarea name="field" id="" cols="30" rows="10"></textarea>
	<p>Send and show a friend</p>
	<button>send</button>
	</form>
</body>
</html>