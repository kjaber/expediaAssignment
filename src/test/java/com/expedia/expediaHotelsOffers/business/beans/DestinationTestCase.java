package  com.expedia.expediaHotelsOffers.business.beans;

import com.expedia.expediaHotelsOffers.business.beans.Destination;

import junit.framework.TestCase;

public class DestinationTestCase extends TestCase{
	Destination destination =null;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		destination = new Destination();
	}
	
	public void testGettersAndSetters(){
	
		destination.setAssociatedMultiCityRegionId(251512);
		destination.setCity("Miami");
		destination.setCountry("United States of America");
		destination.setLongName("Miami (and vicinity), Florida, United States of America");
		destination.setNonLocalizedCity("Miami");
		destination.setProvince("Florida");
		destination.setRegionID(1203232);
		destination.setShortName("Miami");
		destination.setTla("FLL");
		assertEquals(251512, destination.getAssociatedMultiCityRegionId());
		assertEquals("Miami", destination.getCity());
		assertEquals("United States of America", destination.getCountry());
		assertEquals("Miami (and vicinity), Florida, United States of America", destination.getLongName());
		assertEquals("Miami", destination.getNonLocalizedCity());
		assertEquals("Florida", destination.getProvince());
		assertEquals(1203232, destination.getRegionID());
		assertEquals("Miami", destination.getShortName());
		assertEquals("FLL", destination.getTla());

	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
