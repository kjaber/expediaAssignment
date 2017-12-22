package com.expedia.expediaHotelsOffers.business.beans;

public class HotelInfo {
	private int hotelId;
	private String hotelName;
	private String localizedHotelName;
	private String hotelDestination;
	private int hotelDestinationRegionID;
	private String hotelLongDestination;
	private String hotelStreetAddress;
	private String hotelCity;
	private String hotelProvince;
	private String hotelCountryCode;
	private double hotelLatitude;
	private double hotelLongitude;
	private String hotelStarRating;
	private double hotelGuestReviewRating;
	private int hotelReviewTotal;
	private String hotelImageUrl;
	private boolean isOfficialRating;

	public int getHotelId() {
		return hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getLocalizedHotelName() {
		return localizedHotelName;
	}

	public String getHotelDestination() {
		return hotelDestination;
	}

	public int getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public String getHotelProvince() {
		return hotelProvince;
	}

	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	public double getHotelLatitude() {
		return hotelLatitude;
	}

	public double getHotelLongitude() {
		return hotelLongitude;
	}

	public String getHotelStarRating() {
		return hotelStarRating;
	}

	public double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	public int getHotelReviewTotal() {
		return hotelReviewTotal;
	}

	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	public boolean isOfficialRating() {
		return isOfficialRating;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public void setLocalizedHotelName(String localizedHotelName) {
		this.localizedHotelName = localizedHotelName;
	}

	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	public void setHotelDestinationRegionID(int hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	public void setHotelLatitude(double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	public void setHotelLongitude(double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	public void setHotelGuestReviewRating(double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	public void setHotelReviewTotal(int hotelReviewTotal) {
		this.hotelReviewTotal = hotelReviewTotal;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	public void setIsOfficialRating(boolean isOfficialRatting) {
		this.isOfficialRating = isOfficialRatting;
	}

	@Override
	public String toString() {
		return " {" + "Hotel Id = " + getHotelId() + ", Hotel Name = " + getHotelName()
				+ ", Localized Hotel Name = " + getLocalizedHotelName() + ", Hotel Destination = "
				+ getHotelDestination() + ", Hotel Destination Region ID = " + getHotelDestinationRegionID()
				+ ", Hotel Long Destination = " + getHotelLongDestination() + ", Hotel Street Address = "
				+ getHotelStreetAddress() + ", Hotel City = " + getHotelCity() + ", Hotel Province = "
				+ getHotelProvince() + ", Hotel Country Code = " + getHotelCountryCode() + ", Hotel Latitude = "
				+ getHotelLatitude() + ", Hotel Longitude = " + getHotelLongitude() + ", Hotel Star Rating = "
				+ getHotelStarRating() + ", Hotel Guest Review Rating = " + getHotelGuestReviewRating()
				+ ", Hotel Review Total = " + getHotelReviewTotal() + ", Hotel Image Url = " + getHotelImageUrl()
				+ ", Is Official rating = " + isOfficialRating()

				+ "}";
	}

}
