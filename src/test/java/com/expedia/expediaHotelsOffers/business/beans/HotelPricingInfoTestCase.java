package com.expedia.expediaHotelsOffers.business.beans;

import com.expedia.expediaHotelsOffers.business.beans.HotelPricingInfo;

import junit.framework.TestCase;

public class HotelPricingInfoTestCase extends TestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSettersAndGetters() {
		HotelPricingInfo hotelPricingInfo = new HotelPricingInfo();
		hotelPricingInfo.setAveragePriceValue(180.12);
		hotelPricingInfo.setCrossOutPriceValue(776.37);
		hotelPricingInfo.setCurrency("USD");
		hotelPricingInfo.setDrr(false);
		hotelPricingInfo.setOriginalPricePerNight(776.37);
		hotelPricingInfo.setPercentSavings(76.8);
		hotelPricingInfo.setTotalPriceValue(720.48);
		assertEquals(180.12, hotelPricingInfo.getAveragePriceValue());
		assertEquals(776.37, hotelPricingInfo.getCrossOutPriceValue());
		assertEquals("USD", hotelPricingInfo.getCurrency());
		assertFalse(hotelPricingInfo.isDrr());
		assertEquals(776.37, hotelPricingInfo.getOriginalPricePerNight());
		assertEquals(76.8, hotelPricingInfo.getPercentSavings());
		assertEquals(720.48, hotelPricingInfo.getTotalPriceValue());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
