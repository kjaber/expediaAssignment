package com.expedia.expediaHotelsOffers;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.expedia.expediaHotelsOffers.business.beans.DestinationTestCase;
import com.expedia.expediaHotelsOffers.business.beans.ExpediaJsonTestCase;
import com.expedia.expediaHotelsOffers.business.beans.HotelInfoTestCase;
import com.expedia.expediaHotelsOffers.business.beans.HotelPricingInfoTestCase;
import com.expedia.expediaHotelsOffers.business.beans.HotelTestCase;
import com.expedia.expediaHotelsOffers.business.beans.HotelUrgencyInfoTestCase;
import com.expedia.expediaHotelsOffers.business.beans.HotelUrlsTestCase;
import com.expedia.expediaHotelsOffers.business.beans.OfferDateRangeTestCase;
import com.expedia.expediaHotelsOffers.business.beans.OfferInfoTestCase;
import com.expedia.expediaHotelsOffers.business.beans.OffersTestCase;
import com.expedia.expediaHotelsOffers.business.beans.PersonaTestCase;
import com.expedia.expediaHotelsOffers.business.beans.UserInfoTestCase;
import com.expedia.expediaHotelsOffers.business.helpers.ExpediaJSONConverterTestCase;
import com.expedia.expediaHotelsOffers.business.helpers.HotelsManagerTestCase;
import com.expedia.expediaHotelsOffers.business.helpers.URLManagerTestCase;
import com.expedia.expediaHotelsOffers.business.searchEngine.SearchTestCase;


public class TestCases extends TestCase{

	public static TestSuite suite(){
		TestSuite testSuite = new TestSuite("Expedia Hetels Offers Project");
		testSuite.addTestSuite(DestinationTestCase.class);
		testSuite.addTestSuite(HotelInfoTestCase.class);
		testSuite.addTestSuite(HotelPricingInfoTestCase.class);
		testSuite.addTestSuite(PersonaTestCase.class);
		testSuite.addTestSuite(UserInfoTestCase.class);
		testSuite.addTestSuite(HotelUrgencyInfoTestCase.class);
		testSuite.addTestSuite(HotelUrlsTestCase.class);
		testSuite.addTestSuite(OfferDateRangeTestCase.class);
		testSuite.addTestSuite(OfferInfoTestCase.class);
		testSuite.addTestSuite(OffersTestCase.class);
		testSuite.addTestSuite(HotelTestCase.class);
		testSuite.addTestSuite(ExpediaJsonTestCase.class);
		testSuite.addTestSuite(ExpediaJSONConverterTestCase.class);
		testSuite.addTestSuite(URLManagerTestCase.class);
		testSuite.addTestSuite(HotelsManagerTestCase.class);
		testSuite.addTestSuite(SearchTestCase.class);

		return testSuite;
	}
}
