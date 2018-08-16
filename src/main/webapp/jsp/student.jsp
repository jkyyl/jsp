<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- oracle db의  student 테이블을 조회하여 화면에 출력 -->
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc02";
		String pass = "java";
		conn = DriverManager.getConnection(url, user, pass);
		
		stmt = conn.createStatement();
		
		String sql = "select * from student";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			out.print("Student Number : " + rs.getInt("STD_NUM")+"<br>");
			out.print("Student Name : " + rs.getString("STD_NAME")+"<br>");
			out.print("Student Kor : " + rs.getInt("STD_KOR")+"<br>");
			out.print("Student Eng : " + rs.getInt("STD_ENG")+"<br>");
			out.print("Student Mat : " + rs.getInt("STD_MAT")+"<br><br>");
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (rs != null) try { rs.close(); } catch (SQLException e2) {}
		if (stmt != null) try { stmt.close(); } catch (SQLException e2) {}
		if (conn != null) try { conn.close(); } catch (SQLException e2) {}
	}
	
%>


</body>
</html>