<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="form-signin" action="/mulCalculation" method="post">
		<label for="param1" class="sr-only">param1</label>
		<input type="text" id="param1" name="param1">
		<label for="param2" class="sr-only">param2</label>
		<input type="text" id="param2" name="param2">
		
		<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
	</form>
</body>
</html>