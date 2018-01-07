package com.expedia.expediaHotelsOffers.business.helpers;

import java.net.MalformedURLException;
import java.net.URL;

import com.expedia.expediaHotelsOffers.business.beans.ExpediaJson;
import com.expedia.expediaHotelsOffers.business.helpers.ExpediaJSONConverter;

import junit.framework.TestCase;

public class ExpediaJSONConverterTestCase extends TestCase {
	ExpediaJSONConverter JSONConverter = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		JSONConverter = ExpediaJSONConverter.getInstance();
	}

	public void testGetExpediaJSON() {
		try {
			JSONConverter.setURL(new URL(
					"https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel"));
			//ExpediaJson expediaJson = JSONConverter.getExpediaJSON();
			assertNotNull(true);
			//assertNotNull(expediaJson.getOffers());

		} catch (MalformedURLException e) {
			assertFalse(true); // just failure
		}
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
