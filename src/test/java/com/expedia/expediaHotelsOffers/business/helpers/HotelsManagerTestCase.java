package com.expedia.expediaHotelsOffers.business.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.expedia.expediaHotelsOffers.business.beans.Destination;
import com.expedia.expediaHotelsOffers.business.beans.Hotel;
import com.expedia.expediaHotelsOffers.business.beans.HotelInfo;
import com.expedia.expediaHotelsOffers.business.beans.HotelPricingInfo;
import com.expedia.expediaHotelsOffers.business.beans.HotelUrgencyInfo;
import com.expedia.expediaHotelsOffers.business.beans.HotelUrls;
import com.expedia.expediaHotelsOffers.business.beans.OfferDateRange;
import com.expedia.expediaHotelsOffers.business.helpers.HotelsManager;

import junit.framework.TestCase;

public class HotelsManagerTestCase extends TestCase {
	HotelsManager hotelsManager = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		hotelsManager = new HotelsManager();
	}

	public void testPrepareHotelsListToView() {

		List<Hotel> hotels = new ArrayList<>();
		Hotel hotel = createHotel();
		hotels.add(hotel);

		Map<Integer, List> hotelsToView = hotelsManager.prepareHotelsListToView(hotels);

		assertNotNull(hotelsToView);
		assertTrue(hotelsToView.size() > 0);
		
		List hotelToView = hotelsToView.get(1); 
		
		assertNotNull(hotelToView);
		assertTrue(hotelToView.size() == 10); // In JSP we have 10 columns to view, so we have to get 10 values and should be ordered

		assertEquals(hotel.getDestination().getCountry(), hotelToView.get(0));
		assertEquals(hotel.getDestination().getCity(), hotelToView.get(1));
		assertEquals(hotel.getDestination().getRegionID(), hotelToView.get(2));
		assertEquals(hotel.getHotelInfo().getHotelName(), hotelToView.get(3));
		assertEquals("2018-1-25" , hotelToView.get(4));
		assertEquals("2018-1-29", hotelToView.get(5));
		assertEquals(hotel.getHotelInfo().getHotelStarRating(), hotelToView.get(6));
		assertEquals(hotel.getHotelInfo().getHotelGuestReviewRating(), hotelToView.get(7));
		assertEquals(hotel.getHotelInfo().getHotelReviewTotal(), hotelToView.get(8));
		assertEquals(hotel.getHotelInfo().getHotelImageUrl(), hotelToView.get(9));


	}

	private Hotel createHotel() {

		Destination destination = new Destination();
		destination.setAssociatedMultiCityRegionId(251512);
		destination.setCity("Miami");
		destination.setCountry("United States of America");
		destination.setLongName("Miami (and vicinity), Florida, United States of America");
		destination.setNonLocalizedCity("Miami");
		destination.setProvince("Florida");
		destination.setRegionID(1203232);
		destination.setShortName("Miami");
		destination.setTla("FLL");

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

		HotelPricingInfo hotelPricingInfo = new HotelPricingInfo();
		hotelPricingInfo.setAveragePriceValue(180.12);
		hotelPricingInfo.setCrossOutPriceValue(776.37);
		hotelPricingInfo.setCurrency("USD");
		hotelPricingInfo.setDrr(false);
		hotelPricingInfo.setOriginalPricePerNight(776.37);
		hotelPricingInfo.setPercentSavings(76.8);
		hotelPricingInfo.setTotalPriceValue(720.48);

		HotelUrgencyInfo hotelUrgencyInfo = new HotelUrgencyInfo();

		hotelUrgencyInfo.setAirAttachEnabled(false);
		hotelUrgencyInfo.setAirAttachRemainingTime(0);
		hotelUrgencyInfo.setAlmostSoldStatus("ALMOST_SOLD");
		hotelUrgencyInfo.setLastBookedTime(1511986530541L);
		hotelUrgencyInfo.setLink("/Hotel-Search#selected=10980182");
		hotelUrgencyInfo.setNumberOfPeopleBooked(0);
		hotelUrgencyInfo.setNumberOfPeopleViewing(7);
		hotelUrgencyInfo.setNumberOfRoomsLeft(11);

		HotelUrls hotelUrls = new HotelUrls();
		hotelUrls.setHotelInfositeUrl(
				"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Finfo%2F10980182%2F2018-01-25%2F2018-01-29");
		hotelUrls.setHotelSearchResultUrl(
				"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Fsearch%2FDestination%2F2018-01-25%2F2018-01-29%3FSearchType%3DDestination%26CityName%3DSunny+Isles+Beach%26RegionId%3D178286%26Selected%3D10980182");

		int[] startDate = { 2018, 1, 25 };
		int[] endDate = { 2018, 1, 29 };
		OfferDateRange offerDateRange = new OfferDateRange();
		offerDateRange.setLengthOfStay(4);
		offerDateRange.setTravelEndDate(endDate);
		offerDateRange.setTravelStartDate(startDate);

		Hotel hotel = new Hotel();
		hotel.setDestination(destination);
		hotel.setHotelInfo(hotelInfo);
		hotel.setHotelPricingInfo(hotelPricingInfo);
		hotel.setHotelUrgencyInfo(hotelUrgencyInfo);
		hotel.setHotelUrls(hotelUrls);
		hotel.setOfferDateRange(offerDateRange);
		return hotel;

	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
