package kr.or.ddit.cookie.util;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

public class CookieUtil {

	/**
	 * Method : getCookie
	 * 최초작성일 : 2018. 7. 6.
	 * 작성자 : PC02
	 * 변경이력 :
	 * @param cookie
	 * @param name
	 * @return
	 * Method 설명 : 쿠키 조회
	 */
	public String getCookie(String cookie, String name) {
		//cookie = userId=brown; rememeberMe=y; checkYn=n
		String[] cookies = cookie.split("; ");
		String cookieResult = "";
		
		//cookieStr : userId=brown, remember=y, checkYn=n
		for (String cookieStr : cookies) {
			String[] cookieNameValue = cookieStr.split("=");
			
			String cookieName = cookieNameValue[0];
			String cookieValue = cookieNameValue[1];
			
			if (name.equals(cookieName)) {
				cookieResult = cookieValue;
				break;
			}
		}
		
		return cookieResult;
		
//		for (int i = 0; i < cookies.length; i++) {
//			result = cookies[i].split("=");
//			if (result[0].equals(name)) {
//				return result[1];
//			}
//		}
//		return "NULL";
		
//		HashMap<String, String> cookieKey = new HashMap<String, String>();
//		String[] temp = null;
//		for (int i = 0; i < cookies.length; i++) {
//			temp = cookies[i].split("=");
//			cookieKey.put(temp[0], temp[1]);
//		}
//		return cookieKey.get(name);
	}
	
}
