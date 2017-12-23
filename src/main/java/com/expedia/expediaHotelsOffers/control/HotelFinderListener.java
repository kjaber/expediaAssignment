package com.expedia.expediaHotelsOffers.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expedia.expediaHotelsOffers.business.beans.ExpediaJson;
import com.expedia.expediaHotelsOffers.business.beans.Hotel;
import com.expedia.expediaHotelsOffers.business.filters.Filter;
import com.expedia.expediaHotelsOffers.business.helpers.ExpediaJSONConverter;
import com.expedia.expediaHotelsOffers.business.helpers.HotelsManager;
import com.expedia.expediaHotelsOffers.business.helpers.URLManager;
import com.expedia.expediaHotelsOffers.business.searchEngine.Search;
import com.expedia.expediaHotelsOffers.presentation.SearchPageViewer;



public class HotelFinderListener extends HttpServlet {
	private URL jsonURL = null;
	ExpediaJson expediaJson = null;
	Map<String, String[]> filters = null;
	public static String HOTELS_OFFERS= "hotelsOffers";
	
	public void init(ServletConfig config) throws ServletException {
		initJsonURL(config);	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		initExpediaJson(); // if we want to cash the json, jut move this line from doGet to init
		
		Filter filter = new Filter(request);
		filters = filter.doFilter();	
		
		Search search = new Search(expediaJson);
		List<Hotel> filteredHotelsToView = search.doSearch(filters);
		
		request.setAttribute(HOTELS_OFFERS, HotelsManager.prepareHotelsListToView(filteredHotelsToView));

		SearchPageViewer searchPage = new SearchPageViewer();
		searchPage.view(request,response);
	}

	private void initJsonURL(ServletConfig config){
		URLManager urlManager = URLManager.getInstance();
		jsonURL = urlManager.getURL();
	}
	
	private void initExpediaJson(){
		ExpediaJSONConverter jsonConverter = ExpediaJSONConverter.getInstance();
		jsonConverter.setURL(jsonURL);
		expediaJson = jsonConverter.getExpediaJSON();
	}


}
