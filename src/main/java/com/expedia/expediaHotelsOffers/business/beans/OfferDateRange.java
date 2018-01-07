package com.expedia.expediaHotelsOffers.business.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferDateRange {
	private int[] travelStartDate;
	private int[] travelEndDate;
	private int lengthOfStay;

	public int[] getTravelStartDate() {
		return travelStartDate;
	}

	public int[] getTravelEndDate() {
		return travelEndDate;
	}

	public int getLengthOfStay() {
		return lengthOfStay;
	}

	public void setTravelStartDate(int[] travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public void setTravelEndDate(int[] travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	@Override
	public String toString() {
		return "{Travel Start Date=" + getTravelStartDate()[0] + "-"+ getTravelStartDate()[1] + "-"+ getTravelStartDate()[2] + ", Travel End Date= "
				+ getTravelEndDate()[0] + "-"+getTravelEndDate()[1]+ "-"+getTravelEndDate()[2]+ ", Length of stay =" + getLengthOfStay() + "}";
	}

}
