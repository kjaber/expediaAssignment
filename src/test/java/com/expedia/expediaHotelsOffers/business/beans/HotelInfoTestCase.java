package com.expedia.expediaHotelsOffers.business.beans;

import com.expedia.expediaHotelsOffers.business.beans.HotelInfo;

import junit.framework.TestCase;

public class HotelInfoTestCase extends TestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testGettersAndSetters() {
		// Test hotelInfo
		HotelInfo hotelInfo = new HotelInfo();
		hotelInfo.setHotelCity("Sunny Isles Beach");
		hotelInfo.setHotelCountryCode("USA");
		hotelInfo.setHotelDestination("Sunny Isles Beach");
		hotelInfo.setHotelDestinationRegionID(10405);
		hotelInfo.setHotelGuestReviewRating(2.73);
		hotelInfo.setHotelId(10980182);
		hotelInfo.setHotelImageUrl(
				"https://images.trvl-media.com/hotels/11000000/10990000/10980200/10980182/10980182_143_t.jpg");
		hotelInfo.setHotelLatitude(25.954881);
		hotelInfo.setHotelLongDestination("Sunny Isles Beach,FL,USA");
		hotelInfo.setHotelLongitude(-80.120417);
		hotelInfo.setHotelName("Ocean Reserve OceanView Sunny Isles Luxury Condos");
		hotelInfo.setHotelProvince("FL");
		hotelInfo.setHotelReviewTotal(26);
		hotelInfo.setHotelStarRating("4.0");
		hotelInfo.setHotelStreetAddress("19370-19390 Collins Avenue");
		hotelInfo.setIsOfficialRating(false);
		hotelInfo.setLocalizedHotelName("Ocean Reserve OceanView Sunny Isles Luxury Condos");
		assertEquals("Sunny Isles Beach", hotelInfo.getHotelCity());
		assertEquals("USA", hotelInfo.getHotelCountryCode());
		assertEquals("Sunny Isles Beach", hotelInfo.getHotelDestination());
		assertEquals(10405, hotelInfo.getHotelDestinationRegionID());
		assertEquals(2.73, hotelInfo.getHotelGuestReviewRating());
		assertEquals(10980182, hotelInfo.getHotelId());
		assertEquals("https://images.trvl-media.com/hotels/11000000/10990000/10980200/10980182/10980182_143_t.jpg",
				hotelInfo.getHotelImageUrl());
		assertEquals(25.954881, hotelInfo.getHotelLatitude());
		assertEquals("Sunny Isles Beach,FL,USA", hotelInfo.getHotelLongDestination());
		assertEquals(-80.120417, hotelInfo.getHotelLongitude());
		assertEquals("Ocean Reserve OceanView Sunny Isles Luxury Condos", hotelInfo.getHotelName());
		assertEquals("FL", hotelInfo.getHotelProvince());
		assertEquals(26, hotelInfo.getHotelReviewTotal());
		assertEquals("4.0", hotelInfo.getHotelStarRating());
		assertEquals("19370-19390 Collins Avenue", hotelInfo.getHotelStreetAddress());
		assertFalse(hotelInfo.isOfficialRating());
		assertEquals("Ocean Reserve OceanView Sunny Isles Luxury Condos", hotelInfo.getLocalizedHotelName());

	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
