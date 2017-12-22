package com.expedia.expediaHotelsOffers.business.beans;

public class HotelPricingInfo {
	private double averagePriceValue;
	private double totalPriceValue;
	private double crossOutPriceValue;
	private double originalPricePerNight;
	private String currency;
	private double percentSavings;
	private boolean drr;

	public double getAveragePriceValue() {
		return averagePriceValue;
	}

	public double getTotalPriceValue() {
		return totalPriceValue;
	}

	public double getCrossOutPriceValue() {
		return crossOutPriceValue;
	}

	public double getOriginalPricePerNight() {
		return originalPricePerNight;
	}
	
	public String getCurrency(){
		return currency;
	}

	public double getPercentSavings() {
		return percentSavings;
	}

	public boolean isDrr() {
		return drr;
	}

	public void setAveragePriceValue(double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	public void setTotalPriceValue(double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	public void setCrossOutPriceValue(double crossOutPriceValue) {
		this.crossOutPriceValue = crossOutPriceValue;
	}

	public void setOriginalPricePerNight(double originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	

	public void setPercentSavings(double percentSavings) {
		this.percentSavings = percentSavings;
	}

	public void setDrr(boolean drr) {
		this.drr = drr;
	}

	@Override
	public String toString() {
		return " {" + ", Average Price Value= " + getAveragePriceValue() +
				", Total Price Value= " + getTotalPriceValue() +
				", Cross Out Price Value= " + getCrossOutPriceValue() + ", Original Price PerNight = "
				+ getOriginalPricePerNight() +", currency = " +getCurrency() + ", Percent Savings = " + 
				 getPercentSavings() + ", Is Drr=" + isDrr() +
				"}";
	}
}
