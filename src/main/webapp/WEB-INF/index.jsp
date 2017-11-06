<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Index</title>
		<!-- <link rel="stylesheet" type="text/css" href="/css/style.css"> -->
	</head>

	<body>
		<div>
			<form action="/create" method="post">
			Your Name:<input type="text" name="name">
			Dojo Location: <select name="location" id="">
				<option value="Washington DC">Washington DC</option>
				<option value="New York">New York</option>
				<option value="Boston">Boston</option>
				<option value="Denver">Denver</option>
			</select>
			Favorate Language: <select name="favLang" id="">
				<option value="Python">Python</option>
				<option value="Java">Java</option>
				<option value="JavaScript">JavaScript</option>
				<option value="Ruby">Ruby</option>
			</select>
			Comment (optional): <textarea name="comment" id="" cols="30" rows="10"></textarea>
			<button type="submit">Submit</button>
			</form>
		</div>
			<p>${student.name}</p>
			<p>${student.location}</p>
			<p>${student.favLang}</p>
			<p>${student.comment}</p>
		<div>
			
		</div>
	</body>
</html>