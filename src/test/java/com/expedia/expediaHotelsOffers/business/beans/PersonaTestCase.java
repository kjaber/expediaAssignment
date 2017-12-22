package com.expedia.expediaHotelsOffers.business.beans;

import com.expedia.expediaHotelsOffers.business.beans.Persona;

import junit.framework.TestCase;

public class PersonaTestCase extends TestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSettersAndGetters() {
		Persona persona = new Persona();
		persona.setPersonaType("Others");
		assertEquals("Others", persona.getPersonaType());

	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
