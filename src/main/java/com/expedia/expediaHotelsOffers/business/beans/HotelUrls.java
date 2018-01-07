package com.expedia.expediaHotelsOffers.business.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelUrls {
	private String hotelInfositeUrl;
	private String hotelSearchResultUrl;

	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}

	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}

	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}

	@Override
	public String toString() {
		return "{" + ", Hotel InfositeUrl=" + getHotelInfositeUrl() + ", Hotel Search Result Url="
				+ getHotelSearchResultUrl() + "}";
	}
}
