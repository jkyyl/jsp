package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SumCalculation
 */
@WebServlet("/sumCalculation")
public class SumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SumCalculation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		int result = 0;
		
		if (!isStringDouble(start) && !isStringDouble(end)) {
			response.sendRedirect("/jsp/sumInput.jsp");
		} else {
			int tempStart = Integer.parseInt(start);
			int tempEnd = Integer.parseInt(end);
			int temp = 0;
			if (tempStart < tempEnd) {
				temp = tempEnd - tempStart;
				for (int i = tempStart+1; i < tempEnd; i++) {
					result += i;
				}
			} else if(tempStart > tempEnd) {
				temp = tempStart - tempEnd;
				for (int i = tempEnd+1; i < tempStart; i++) {
					result += i;
				}
			} else {
				response.sendRedirect("/jsp/sumInput.jsp");
			}
		}
		
//		System.out.println("start : "+start);
//		System.out.println("end : "+end);
//		System.out.println("result : "+result);
		
		
		//System.out.println(result);
		//request.getParameter 사용자가 보낸 파라미터를 받아오는 작업
		//request객체에 일시적으로  값을 저장하는 방법
		request.setAttribute("sumResult", result);
		
		//session에 sumResult를 저장한다
		HttpSession session = request.getSession();
		session.setAttribute("sumResult", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/sumResult.jsp");
		rd.forward(request, response);
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
