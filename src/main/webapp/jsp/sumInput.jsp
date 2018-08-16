<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="form-signin" action="/sumCalculation" method="post">
		<label for="start" class="sr-only">start</label>
		<input type="text" id="start" name="start">
		<label for="end" class="sr-only">end</label>
		<input type="text" id="end" name="end">
		
		<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
	</form>
	
</body>
</html>