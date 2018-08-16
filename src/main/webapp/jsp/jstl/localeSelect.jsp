<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/common/jquery.jsp" %>
<script>
//select box 변경시 요청이 되도록 수정
$(function(){
	//페이지 로딩시 select box 설정
	$("select[name=locale]").val("${locale}").prop("selected", true);
	
	//select box 변경 이벤트
	$("select[name=locale]").change(function(){
		$("form").submit();
	});
});

</script>
</head>
<body>
	<c:set var="userId" value="brown" scope="request"/>
	
	<form action="/localeSelect" method="get">
		<select name="locale">
			<option value="ko">한국어</option>
			<option value="ja">日本語</option>
			<option value="en">English</option>
			<option value="ar">العربية</option>
			<option value="gu">ગુજરાતી</option>
			<option value="la">Latine</option>
		</select>
	</form>
	
	<fmt:setLocale value="${param.locale }"/>
<%-- 	<fmt:setLocale value="${locale }"/> --%>
	<fmt:bundle basename="kr.or.ddit.msg.msg">
		<fmt:message key="hello"/><br>
		<fmt:message key="visitor">
			<fmt:param value="${userId }"/>
		</fmt:message>
	</fmt:bundle>
	
<!-- 	<form name="sendForm" action="/localeSelect" method="get"> -->
<!-- 		<select name="locale" id="locale" onchange="locale_change();"> -->
<%-- 			<option value="ko" ${locale eq 'ko'  ? "selected" : ''}>한국어</option> --%>
<%-- 			<option value="ja" ${locale eq 'ja'  ? "selected" : ''}>日本語</option> --%>
<%-- 			<option value="en" ${locale eq 'en'  ? "selected" : ''}>English</option> --%>
<!-- 		</select> -->
<!-- 	</form> -->

</body>

<!-- <script type="text/javascript"> -->
<!-- 	function locale_change() { -->
<!-- 		document.sendForm.submit(); -->
<!-- 	} -->
<!-- </script> -->

</html>