package testScenarios;

import org.testng.annotations.Test;

import pageObject.FlightBookingModel;

public class FlightBookingPage extends TestBase {
	
	@Test
	public void bookFlight() throws InterruptedException
	{
		FlightBookingModel flightBooking=new FlightBookingModel(driver);
		flightBooking.enterFromCity();
		flightBooking.enterToCity();
		flightBooking.clickOnSubmitButton();
	}
}
