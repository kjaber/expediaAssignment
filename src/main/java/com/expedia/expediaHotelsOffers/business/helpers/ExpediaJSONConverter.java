package com.expedia.expediaHotelsOffers.business.helpers;

import java.io.IOException;
import java.net.URL;

import com.expedia.expediaHotelsOffers.business.beans.ExpediaJson;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExpediaJSONConverter {
	private static ExpediaJSONConverter instance = null;
	private ExpediaJson expediaJson = null;
	private URL expediaJSONURL = null;

	private ExpediaJSONConverter() {
	}

	public static ExpediaJSONConverter getInstance() {
		if (instance == null) {
			instance = new ExpediaJSONConverter();
		}
		return instance;
	}

	public void setURL(URL jsonURL) {
		this.expediaJSONURL = jsonURL;
		expediaJson = null;
	}

	public ExpediaJson getExpediaJSON() {
		if (expediaJSONURL == null) {
			System.out.println("Expedia Json URL path is empty!");
			return null;
		}
		initExpediaJSON();

		return expediaJson;
	}

	private void initExpediaJSON() {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			expediaJson = objectMapper.readValue(expediaJSONURL, ExpediaJson.class);
			System.out.println("offers\n" + expediaJson);

		} catch (JsonParseException e) {
			System.out.println("Failed to read JSON file from the given URL!");
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("Failed to read JSON file from the given URL!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Failed to read JSON file from the given URL!");
			e.printStackTrace();
		}

	}
}
