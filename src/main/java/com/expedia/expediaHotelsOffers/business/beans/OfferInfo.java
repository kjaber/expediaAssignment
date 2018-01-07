package com.expedia.expediaHotelsOffers.business.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferInfo {
	private int siteID;
	private String language;
	private String currency;
	
	public int getSiteID(){
		return siteID;
	}
	public String getLanguage (){
		return language;
	}
	public String getCurrency(){
		return currency;
	}
	public void setSiteID(int siteID){
		this.siteID = siteID;
	}
	public void setLanguage(String language){
		this.language = language;
	}
	public void setCurrency(String currency){
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "{"+ getSiteID() + ", Language = " + getLanguage() + ", Currency = " + getCurrency() +"}";
	}
}
