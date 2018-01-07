package com.expedia.expediaHotelsOffers.business.searchEngine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.expedia.expediaHotelsOffers.business.beans.ExpediaJson;
import com.expedia.expediaHotelsOffers.business.beans.Hotel;

public class Search {
	ExpediaJson expediaJson = null;
	public static String DESTINATION_COUNTRY = "destinationCountry";
	public static String DESTINATION_CITY = "destinationCity";
	public static String REGION_ID = "regionID";
	public static String HOTEL_NAME = "hotelName";
	public static String MIN_START_DATE = "minStartDate";
	public static String MAX_START_DATE = "maxStartDate";
	public static String MIN_END_DATE = "minEndDate";
	public static String MAX_END_DATE = "maxEndDate";
	public static String LENGTH_OF_STAY = "lengthOfStay";
	public static String MIN_STAR_RATE = "minStarRate";
	public static String MAX_STAR_RATE = "maxStarRate";
	public static String MIN_GUEST_RATE = "minGuestRate";
	public static String MAX_GUEST_RATE = "maxGuestRate";
	public static String MIN_TOTAL_RATE = "minTotalRate";
	public static String MAX_TOTAL_RATE = "maxTotalRate";
	
	public Search(ExpediaJson originalJSON) {
		expediaJson = originalJSON;
	}
	
	

	public List<Hotel> doSearch(Map<String, String[]> filters) {
		Hotel[] hotels = expediaJson.getOffers().getHotel();
		Stream<Hotel> allHotelsStream = Arrays.stream(hotels);

		Stream<Hotel> filteredStream = getFilteredStream(allHotelsStream, filters);

		return filteredStream.collect(Collectors.toList());
	}

	private Stream<Hotel> getFilteredStream(Stream<Hotel> allHotelsStream,Map<String, String[]> filters) {
		
		if (filters.size() < 1) {
			return allHotelsStream;
		}
		
		for (Map.Entry<String, String[]> entry : filters.entrySet()) {
			if (entry.getValue()[0].isEmpty()) {
				continue;
			}

			String key = entry.getKey();

			if (key.equalsIgnoreCase(DESTINATION_COUNTRY)) {
				allHotelsStream = allHotelsStream.filter((x) -> x.getDestination().getCountry().equalsIgnoreCase(entry.getValue()[0]));
			} else if (key.equals(DESTINATION_CITY)) {
				allHotelsStream = allHotelsStream.filter((x) -> x.getDestination().getCity().equalsIgnoreCase(entry.getValue()[0]));
			} else if (key.equals(REGION_ID)) {
				allHotelsStream = allHotelsStream.filter((x) -> x.getDestination().getRegionID() == Integer.parseInt(entry.getValue()[0]));
			} else if (key.equals(HOTEL_NAME)) {
				allHotelsStream = allHotelsStream.filter((x) -> x.getHotelInfo().getHotelName().equalsIgnoreCase(entry.getValue()[0]));
			
			} else if (key.equals(MIN_START_DATE)) {
				allHotelsStream = allHotelsStream.filter((x) -> isMinDate(x.getOfferDateRange().getTravelStartDate(), entry.getValue()));
			} else if (key.equals(MAX_START_DATE)) {
				allHotelsStream = allHotelsStream.filter((x) -> isMaxDate(x.getOfferDateRange().getTravelStartDate(), entry.getValue()));
			
			} else if (key.equals(MIN_END_DATE)) {
				allHotelsStream = allHotelsStream.filter((x) -> isMinDate(x.getOfferDateRange().getTravelEndDate(), entry.getValue()));
			} else if (key.equals(MAX_END_DATE)) {
				allHotelsStream = allHotelsStream.filter((x) -> isMaxDate(x.getOfferDateRange().getTravelEndDate(), entry.getValue()));
			
			} else if (key.equals(LENGTH_OF_STAY)) {
				allHotelsStream = allHotelsStream.filter((x) -> x.getOfferDateRange().getLengthOfStay() == Integer.parseInt(entry.getValue()[0]));
			
			} else if (key.equals(MIN_STAR_RATE) && Double.parseDouble(entry.getValue()[0]) >= 0) {
				allHotelsStream = allHotelsStream.filter((x) -> Double.parseDouble(x.getHotelInfo().getHotelStarRating()) >= Double.parseDouble(entry.getValue()[0]));
			} else if (key.equals(MAX_STAR_RATE) && Double.parseDouble(entry.getValue()[0]) >= 0) {
				allHotelsStream = allHotelsStream.filter((x) -> Double.parseDouble(x.getHotelInfo().getHotelStarRating()) <= Double.parseDouble(entry.getValue()[0]));
			
			} else if (key.equals(MIN_GUEST_RATE) && Double.parseDouble(entry.getValue()[0]) >= 0) {
				allHotelsStream = allHotelsStream.filter((x) -> x.getHotelInfo().getHotelGuestReviewRating() >= Double.parseDouble(entry.getValue()[0]));
			} else if (key.equals(MAX_GUEST_RATE) && Double.parseDouble(entry.getValue()[0]) >= 0) {
				allHotelsStream = allHotelsStream.filter((x) -> x.getHotelInfo().getHotelGuestReviewRating() <= Double.parseDouble(entry.getValue()[0]));
			
			} else if (key.equals(MIN_TOTAL_RATE)) {
				allHotelsStream = allHotelsStream.filter((x) -> x.getHotelInfo().getHotelReviewTotal() >= Integer.parseInt(entry.getValue()[0]));
			} else if (key.equals(MAX_TOTAL_RATE)) {
				allHotelsStream = allHotelsStream.filter((x) -> x.getHotelInfo().getHotelReviewTotal() <= Integer.parseInt(entry.getValue()[0]));
			}
		}

		return allHotelsStream;
	}

	/*
	 * return true if the first parameter is greater than to the second
	 * parameter
	 */
	private boolean isMinDate(int[] date, String[] filteredDate) {
		try {
			if (isOlderDate(date, filteredDate)) {
				return true;
			}
		} catch (ParseException e) {
			System.out.println("Faild to compare dates");
			e.printStackTrace();
		}
		return false;
	}

	private boolean isMaxDate(int[] date, String[] filteredDate) {
		try {
			if (isOlderDate(date, filteredDate)) {
				return false;
			}
		} catch (ParseException e) {
			System.out.println("Faild to compare dates");
			e.printStackTrace();
		}
		return true;
	}

	boolean isOlderDate(int[] date, String[] filteredDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = date[0] + "-" + date[1] + "-" + date[2];
		Date date1Formated = sdf.parse(date1);
		Date date2Formated = sdf.parse(filteredDate[0]);

		if (date1Formated.compareTo(date2Formated) > 0) {
			return true;
		}
		return false;
	}


}
