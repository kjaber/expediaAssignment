package com.expedia.expediaHotelsOffers.business.beans;

public class Persona {
	private String personaType;

	public String getPersonaType() {
		return personaType;
	}

	public void setPersonaType(String personaType) {
		this.personaType = personaType;
	}

	@Override
	public String toString() {
		return " { personaType = " + getPersonaType() + "}";
	}
}
