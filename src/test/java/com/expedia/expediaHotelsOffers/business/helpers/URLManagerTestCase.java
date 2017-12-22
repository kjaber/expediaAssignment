package com.expedia.expediaHotelsOffers.business.helpers;

import java.net.URL;
import com.expedia.expediaHotelsOffers.business.helpers.URLManager;
import junit.framework.TestCase;

public class URLManagerTestCase extends TestCase {
	URLManager manager = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		manager = URLManager.getInstance();
	}

	public void testGetExpediaJSON() {
		URL defaultURL = manager.getURL();
		assertNotNull(defaultURL);
		//assertEquals(				"https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel",				defaultURL.getProtocol() + "://" + defaultURL.getAuthority() + defaultURL.getFile());

		manager.setURL("https://www.expedia.com/");

		URL expediaURL = manager.getURL();
		assertNotNull(expediaURL);
		//assertEquals("https://www.expedia.com/",				expediaURL.getProtocol() + "://" + expediaURL.getAuthority() + expediaURL.getFile());

	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
