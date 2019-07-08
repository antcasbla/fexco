import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.util.calendar.LocalGregorianCalendar;

public class HTTP_POST_Test_IT {

    @Given("^a plane (.*) which come from (.*) and go to (.*)$")
    @When("^is requered to CREATE its info to (.*)$")
    @Then("^info is created$")
    public void createInfo(String plane, String originAirport, String destinationAirport, String info) throws Throwable {

    }
}
