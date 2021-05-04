<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String[] firstCategory = request.getParameterValues("firstCategory");

	for (int i = 0; i < firstCategory.length; i++) {
		out.println(firstCategory[i]);
		%> <br/>
		
<% 		String[] secondCategory = request.getParameterValues("secondCategory");

		for (int i = 0; i < secondCategory.length; i++) {
			out.println(secondCategory[i]);
		} %> <br/>
		
<%		String[] thirdCategory = request.getParameterValues("thirdCategory");

		for (int i = 0; i < thirdCategory.length; i++) {
			out.println(thirdCategory[i]);
		}
	%> <br/> <%	
		String[] material = request.getParameterValues("material");

		for (int i = 0; i < material.length; i++) {
			out.println(material[i]);
		}
		%> <br/> <%
		String[] brand = request.getParameterValues("brand");

		for (int i = 0; i <brand.length; i++) {
			out.println(brand[i]);
		}
		%> <br/> 
		
		<% String[] price = request.getParameterValues("price");

		for (int i = 0; i < price.length; i++) {
			out.println(price[i]);
		}
		
	%>

	<h>ㅎㅇ
	</h2>
</body>
</html>