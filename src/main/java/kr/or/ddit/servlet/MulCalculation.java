package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MulCalculation
 */
@WebServlet("/mulCalculation")
public class MulCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		int result = 0;
		
		if (isStringDouble(param1) && isStringDouble(param2)) {
			int temp1 = Integer.parseInt(param1);
			int temp2 = Integer.parseInt(param2);
			result = temp1 * temp2;
			pw.write("param1 : "+param1+"\n");
			pw.write("param2 : "+param2+"\n");
			pw.write("result : "+result);
		} else {
			response.sendRedirect("/jsp/mulInput.jsp");
		}
		pw.close();
		

	}

	public static boolean isStringDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
