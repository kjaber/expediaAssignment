package com.expedia.expediaHotelsOffers.business.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.expedia.expediaHotelsOffers.business.beans.Hotel;

public class HotelsManager {

	/**
	 * Get a map of <record ID, List[Data of primitive type]  > that can be rendered directly in jsp
	 * @param filteredHotelsToView list of hotels 
	 */
	public static Map<Integer, List> prepareHotelsListToView(List<Hotel> filteredHotelsToView) {
		Map<Integer, List> map = new HashMap<Integer, List>();

		for (Hotel hotel : filteredHotelsToView) {
			List hotelData = new ArrayList();
			
			hotelData.add(hotel.getDestination().getCountry());
			hotelData.add(hotel.getDestination().getCity());
			hotelData.add(hotel.getDestination().getRegionID());
			hotelData.add(hotel.getHotelInfo().getHotelName());
			hotelData.add(convertDateListToString(hotel.getOfferDateRange().getTravelStartDate()));
			hotelData.add(convertDateListToString(hotel.getOfferDateRange().getTravelEndDate()));
			hotelData.add(hotel.getHotelInfo().getHotelStarRating());
			hotelData.add(hotel.getHotelInfo().getHotelGuestReviewRating());
			hotelData.add(hotel.getHotelInfo().getHotelReviewTotal());
			hotelData.add(hotel.getHotelInfo().getHotelImageUrl());
			
			map.put(map.size() + 1, hotelData);
		}

		return map;
	}

	/**
	 * Get formated Date as (yyyy-mm-dd)
	 * @param dateList list of size 3, 0==> year, 1==> month , 2 ==> date
	 * @return
	 */
	public static String convertDateListToString(int[] dateList) {
		return dateList[0] + "-" + dateList[1] + "-" + dateList[2];
	}

}
