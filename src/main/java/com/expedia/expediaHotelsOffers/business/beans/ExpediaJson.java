package com.expedia.expediaHotelsOffers.business.beans;
/**
 * This is the main object where we can get everything
 */
public class ExpediaJson {
	private OfferInfo offerInfo;
	private UserInfo userInfo;
	private Offers offers;

	public OfferInfo getOfferInfo() {
		return offerInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public Offers getOffers() {
		return offers;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	@Override
	public String toString() {
		return "{ " + "Offer Info=" + getOfferInfo() + ", User Info=" + getUserInfo() + ", Offers = " + getOffers()
				+ "}";
	}
}
