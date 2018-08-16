package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimesTable
 */
//localhost:8180/TimesTable
@WebServlet("/TimesTable")
public class TimesTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TimesTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<!DOCTYPE html>");
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<meta charset=\"UTF-8\">");
		pw.write("<title>Insert title here</title>");
		pw.write("<style>");
		pw.write("td {border : 1px solid blue;}");
		pw.write("</style>");
		pw.write("<body>");
		
		pw.write("<table>");
		for (int i = 1; i < 10; i++) {
			pw.write("<tr>");
			for (int j = 2; j < 10; j++) {
				pw.write("<td>" + j + " * " + i + " = " + i*j + "</td>");
			}
			pw.write("</tr>");
			pw.write("\n");
		}
		
		pw.write("</table>");
		pw.write("</body>");
		pw.write("</html>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
