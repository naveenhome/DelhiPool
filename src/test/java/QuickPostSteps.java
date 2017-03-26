package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import main.java.Ride;
import main.java.RideBLL;

public class QuickPostSteps extends TestCase{
	
	Ride ride = new Ride();
	String button;
	
	@Given("^Employee \"([^\"]*)\" has entered \"([^\"]*)\" as source, \"([^\"]*)\" as destination and time to travel is \"([^\"]*)\"$")
	public void UserDataEntry(String empName, String source, String destination, String travelTime) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setDestination(destination);
		ride.setEmpName(empName);
		ride.setSource(source);
		ride.setTravelTime(travelTime);
	}

	@Given("^His email is \"([^\"]*)\" and phone is \"([^\"]*)\"$")
	public void His_email_is_and_phone_is(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@When("^Click on \"([^\"]*)\"$")
	public void Click_on(String button) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		this.button = button;
	}

	@Then("^System display message \"([^\"]*)\" with \"([^\"]*)\" button$")
	public void System_display_message_with_button(String message, String popupButton) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(button.equals("Share"))
		{
			RideBLL rideBLL = new RideBLL();
			assertEquals(message, rideBLL.Validate(ride));
		}
	}

	@Then("^System takes to \"([^\"]*)\" page on clicking on \"([^\"]*)\"$")
	public void System_takes_to_page_on_clicking_on(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^\"([^\"]*)\" can see his post on \"([^\"]*)\" page$")
	public void can_see_his_post_on_page(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^System takes to incorrect field on clicking on \"([^\"]*)\"$")
	public void System_takes_to_incorrect_field_on_clicking_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^\"([^\"]*)\" can change value for incorrect field$")
	public void can_change_value_for_incorrect_field(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^He will save it again$")
	public void He_will_save_it_again() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^System takes to first field on clicking on \"([^\"]*)\"$")
	public void System_takes_to_first_field_on_clicking_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" can enter new value again$")
	public void can_enter_new_value_again(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}


}
