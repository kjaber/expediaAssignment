package com.expedia.expediaHotelsOffers.business.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Offers {
	private Hotel [] Hotel;

	public Hotel[] getHotel() {
		return Hotel;
	}
	// This annotation was added because this property starts with capital letter .
	@JsonProperty("Hotel")
	public void setHotel(Hotel[] hotel) {
		this.Hotel = hotel;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder ();
		for(Hotel hotelItem : Hotel){
			sb.append(hotelItem);
		}
		return "Hotel:{"+ sb+"}";
	}
}
