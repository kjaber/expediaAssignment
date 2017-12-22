package com.expedia.expediaHotelsOffers.business.beans;

public class HotelUrgencyInfo {
	private int airAttachRemainingTime;
	private int numberOfPeopleViewing;
	private int numberOfPeopleBooked;
	private int numberOfRoomsLeft;
	private long lastBookedTime;
	private String almostSoldStatus;
	private String link;
	private boolean airAttachEnabled;

	public int getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	public int getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	public int getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	public int getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	public long getLastBookedTime() {
		return lastBookedTime;
	}

	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	public String getLink() {
		return link;
	}

	public boolean isAirAttachEnabled() {
		return airAttachEnabled;
	}

	public void setAirAttachRemainingTime(int airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	public void setNumberOfPeopleViewing(int numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	public void setNumberOfPeopleBooked(int numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	public void setNumberOfRoomsLeft(int numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	public void setLastBookedTime(long lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setAirAttachEnabled(boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

	@Override
	public String toString() {
		return " {" + "Air Attach Remaining Time= " + getAirAttachRemainingTime() + ", Number Of People Viewing= "
				+ getNumberOfPeopleViewing() + ", Number Of People Booked= " + getNumberOfPeopleBooked()
				+ ", Number Of Rooms Left= " + getNumberOfRoomsLeft() + ", Last Booked Time = " + getLastBookedTime()
				+ ", Almost Sold Status= " + getAlmostSoldStatus() + ", Link = " + getLink() + ", Air Attach Enabled= "
				+ isAirAttachEnabled() + "}";

	}

}
