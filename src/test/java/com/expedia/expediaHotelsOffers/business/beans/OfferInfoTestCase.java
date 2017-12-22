package com.expedia.expediaHotelsOffers.business.beans;

import com.expedia.expediaHotelsOffers.business.beans.OfferInfo;

import junit.framework.TestCase;

public class OfferInfoTestCase extends TestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSettersAndGetters() {
		OfferInfo offerInfo = new OfferInfo();
		offerInfo.setCurrency("USD");
		offerInfo.setLanguage("en_US");
		offerInfo.setSiteID(1);
		assertEquals("USD", offerInfo.getCurrency());
		assertEquals("en_US", offerInfo.getLanguage());
		assertEquals(1, offerInfo.getSiteID());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
