<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<style>
		td {
			border : 1px solid blue;
		}
	</style>
<body>
	<table>
		<c:forEach begin="1" end="9" var="i" >
			<tr>
			<c:forEach begin="2" end="9" var="j">
				<td>${j }*${i }=${i*j }</td>
			</c:forEach>
			</tr>
		</c:forEach>
	</table>
</body>
</html>