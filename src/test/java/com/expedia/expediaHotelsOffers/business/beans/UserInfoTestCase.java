package com.expedia.expediaHotelsOffers.business.beans;

import com.expedia.expediaHotelsOffers.business.beans.Persona;
import com.expedia.expediaHotelsOffers.business.beans.UserInfo;

import junit.framework.TestCase;

public class UserInfoTestCase extends TestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSettersAndGetters() {
		Persona persona = new Persona();
		persona.setPersonaType("Others");
		UserInfo userInfo = new UserInfo();
		userInfo.setPersona(persona);
		userInfo.setUserId("TestID");
		assertNotNull( userInfo.getPersona().getPersonaType());
		assertEquals("TestID", userInfo.getUserId());

	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
