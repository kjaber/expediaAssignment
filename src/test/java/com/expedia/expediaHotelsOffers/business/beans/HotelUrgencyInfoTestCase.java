package com.expedia.expediaHotelsOffers.business.beans;

import com.expedia.expediaHotelsOffers.business.beans.HotelUrgencyInfo;

import junit.framework.TestCase;

public class HotelUrgencyInfoTestCase extends TestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSettersAndGetters() {
		// Test HotelUrgencyInfo
		HotelUrgencyInfo hotelUrgencyInfo = new HotelUrgencyInfo();

		hotelUrgencyInfo.setAirAttachEnabled(false);
		hotelUrgencyInfo.setAirAttachRemainingTime(0);
		hotelUrgencyInfo.setAlmostSoldStatus("ALMOST_SOLD");
		hotelUrgencyInfo.setLastBookedTime(1511986530541L);
		hotelUrgencyInfo.setLink("/Hotel-Search#selected=10980182");
		hotelUrgencyInfo.setNumberOfPeopleBooked(0);
		hotelUrgencyInfo.setNumberOfPeopleViewing(7);
		hotelUrgencyInfo.setNumberOfRoomsLeft(11);
		assertFalse(hotelUrgencyInfo.isAirAttachEnabled());
		assertEquals(0, hotelUrgencyInfo.getAirAttachRemainingTime());
		assertEquals("ALMOST_SOLD", hotelUrgencyInfo.getAlmostSoldStatus());
		assertEquals(1511986530541L, hotelUrgencyInfo.getLastBookedTime());
		assertEquals("/Hotel-Search#selected=10980182", hotelUrgencyInfo.getLink());
		assertEquals(0, hotelUrgencyInfo.getNumberOfPeopleBooked());
		assertEquals(7, hotelUrgencyInfo.getNumberOfPeopleViewing());
		assertEquals(11, hotelUrgencyInfo.getNumberOfRoomsLeft());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
