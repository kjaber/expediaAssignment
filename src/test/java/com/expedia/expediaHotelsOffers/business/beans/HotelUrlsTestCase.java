package com.expedia.expediaHotelsOffers.business.beans;

import com.expedia.expediaHotelsOffers.business.beans.HotelUrls;

import junit.framework.TestCase;

public class HotelUrlsTestCase extends TestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSettersAndGetters() {
		HotelUrls hotelUrls = new HotelUrls();
		hotelUrls.setHotelInfositeUrl("https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Finfo%2F10980182%2F2018-01-25%2F2018-01-29");
		hotelUrls.setHotelSearchResultUrl("https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Fsearch%2FDestination%2F2018-01-25%2F2018-01-29%3FSearchType%3DDestination%26CityName%3DSunny+Isles+Beach%26RegionId%3D178286%26Selected%3D10980182");
		assertEquals("https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Finfo%2F10980182%2F2018-01-25%2F2018-01-29",
				hotelUrls.getHotelInfositeUrl());
		assertEquals(
				"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Fsearch%2FDestination%2F2018-01-25%2F2018-01-29%3FSearchType%3DDestination%26CityName%3DSunny+Isles+Beach%26RegionId%3D178286%26Selected%3D10980182",
				hotelUrls.getHotelSearchResultUrl());

	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
