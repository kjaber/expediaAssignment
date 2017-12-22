package com.expedia.expediaHotelsOffers.business.beans;

import com.expedia.expediaHotelsOffers.business.beans.OfferDateRange;

import junit.framework.TestCase;

public class OfferDateRangeTestCase extends TestCase{
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSettersAndGetters(){
		int [] startDate = {2018,1,25};
		int [] endDate = {2018,1,29};
		OfferDateRange offerDateRange = new OfferDateRange();
		offerDateRange.setLengthOfStay(4);
		offerDateRange.setTravelEndDate(endDate);
		offerDateRange.setTravelStartDate(startDate);
		
		assertEquals(4, offerDateRange.getLengthOfStay());
		assertEquals(29, offerDateRange.getTravelEndDate()[2]);
		assertEquals(25, offerDateRange.getTravelStartDate()[2]);
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
}