package com.expedia.expediaHotelsOffers.business.helpers;

import java.net.MalformedURLException;
import java.net.URL;

public class URLManager {

	private static URLManager instance = null;
	private String URLPath = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel"; // default
																																			// path

	private URLManager() {

	}

	public static URLManager getInstance() {
		if (instance == null) {
			instance = new URLManager();
		}
		return instance;
	}

	public URL getURL() {
		URL url = null;
		try {
			url = new URL(URLPath);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return url;
	}
	
	/*TODO: URL path can be changed if we added a property file, or from any where else
	 */
	public void setURL(String URLPath){
		this.URLPath = URLPath;
	}

}
