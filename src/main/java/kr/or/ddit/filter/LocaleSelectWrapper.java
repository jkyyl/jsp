package kr.or.ddit.filter;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class LocaleSelectWrapper extends HttpServletRequestWrapper {
	
	private Map<String, String[]> map;

	public LocaleSelectWrapper(HttpServletRequest request) {
		super(request);
		
//		request.getParameter(name);
//		request.getParameterValues(name);
//		request.getParameterMap();
//		request.getParameterNames();
		
		map = new HashMap<String, String[]>(request.getParameterMap());
		
		String[] selectedLocale = map.get("locale");
		
		if (selectedLocale == null || selectedLocale[0].equals("")) {
			map.put("locale", new String[]{"ko"});
		}
	}

	@Override
	public String getParameter(String name) {
		String[] values = getParameterValues(name);
		if (values != null) {
			return values[0];
		} else {
			return null;
		}
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		return map;
	}

	@Override
	public Enumeration<String> getParameterNames() {
		return Collections.enumeration(map.keySet());
	}

	@Override
	public String[] getParameterValues(String name) {
		return map.get(name);
	}

}
