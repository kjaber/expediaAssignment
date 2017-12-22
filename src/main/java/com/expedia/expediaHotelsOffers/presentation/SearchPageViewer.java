package com.expedia.expediaHotelsOffers.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchPageViewer {
	public static String Page = "default.jsp";

	public void view(HttpServletRequest request, HttpServletResponse response) {
		try {
			RequestDispatcher view = request.getRequestDispatcher(Page);
			view.forward(request, response);
		} catch (ServletException e) {
			System.out.println("Falied to render the JSP Page");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Falied to render the JSP Page");
			e.printStackTrace();
		}
	}
}
