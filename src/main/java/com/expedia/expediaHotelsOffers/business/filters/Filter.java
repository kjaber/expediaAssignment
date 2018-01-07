package com.expedia.expediaHotelsOffers.business.filters;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;


public class Filter {
	private HttpServletRequest request = null;

	public Filter(HttpServletRequest request) {
		this.request = request;
	}

	/* Get All request parameters
	 */
	public Map<String, String[]> doFilter() {
		return request.getParameterMap();
	}
}
