import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.util.calendar.LocalGregorianCalendar;

public class HTTP_PUT_Test_IT {

    @Given("^a plane (.*) which is stored at (.*) comming from (.*) and going to (.*)$")
    @When("^is requeted to MODIFY the info$")
    @Then("^info is modified$")
    public void modifyInfo(String plane, String originAirport, String destinationAirport, String info) throws Throwable {

    }
}
