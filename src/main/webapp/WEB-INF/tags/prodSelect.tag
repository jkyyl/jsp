<%@ tag import="java.sql.SQLException"%>
<%@ tag import="java.sql.DriverManager"%>
<%@ tag import="java.sql.ResultSet"%>
<%@ tag import="java.sql.Connection"%>
<%@ tag import="java.sql.Statement"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="lgu" type="java.lang.String" required="true" %>

<!-- <select> -->
<%--   <option lgu="${lgu }">${lgu }</option> --%>
<!-- </select> -->

<br>

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
	
	String sql = "select * from prod where prod_lgu = '" + lgu + "'";
	rs = stmt.executeQuery(sql);
	
	out.write("<select>");
	while (rs.next()) {
		out.write("<option value=\"prod_id\">");
		out.print(rs.getString("PROD_NAME")+"<br>");
		out.write("</option>");
	}
	out.write("</select>");
} catch (Exception e) {
	e.printStackTrace();
} finally {
	if (rs != null) try { rs.close(); } catch (SQLException e2) {}
	if (stmt != null) try { stmt.close(); } catch (SQLException e2) {}
	if (conn != null) try { conn.close(); } catch (SQLException e2) {}
}

%>

