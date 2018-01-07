package com.expedia.expediaHotelsOffers.business.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Destination {

	private int regionID;
	private int associatedMultiCityRegioId;
	private String longName;
	private String shortName;
	private String country;
	private String province;
	private String city;
	private String tla;
	private String nonLocalizedCity;

	public int getRegionID() {
		return regionID;
	}

	public int getAssociatedMultiCityRegionId() {
		return associatedMultiCityRegioId;
	}

	public String getLongName() {
		return longName;
	}

	public String getShortName() {
		return shortName;
	}

	public String getCountry() {
		return country;
	}

	public String getProvince() {
		return province;
	}

	public String getCity() {
		return city;
	}

	public String getTla() {
		return tla;
	}

	public String getNonLocalizedCity() {
		return nonLocalizedCity;
	}

	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}

	public void setAssociatedMultiCityRegionId(int associatedMultiCityRegioId) {
		this.associatedMultiCityRegioId = associatedMultiCityRegioId;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setTla(String tla) {
		this.tla = tla;
	}

	public void setNonLocalizedCity(String nonLocalizedCity) {
		this.nonLocalizedCity = nonLocalizedCity;
	}

	@Override
	public String toString() {
		return " {regionID = " + getRegionID() + ", associated MultiCity RegioId = "
				+ getAssociatedMultiCityRegionId() + ", long Name= " + getLongName() + ", short name= " + getShortName()
				+ ", country= " + getCountry() + ", province= " + getProvince() + ", city= " + getCity() + ", tla = "
				+ getTla() + ", non localized city= " + getNonLocalizedCity() + "}";
	}
}
