import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.util.calendar.LocalGregorianCalendar;

public class AMQP_INFO_Test_IT {

    @Given("^a plane (.*) which has a non remarkable incident (on time) come from (.*) and go to (.*)$")
    @When("^is stored$")
    @Then("^the info is sent to a queue$")
    public void sendInfo(String plane, String originAirport, String destinationAirport, LocalGregorianCalendar travelDate) throws Throwable {

    }
}
