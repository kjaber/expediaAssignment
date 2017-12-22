package com.expedia.expediaHotelsOffers.business.beans;

public class UserInfo {
	private String userId;
	private Persona persona;

	public String getUserId() {
		return userId;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "{ UserId= " + getUserId() + ", " + getPersona() + "}";
	}
}
