import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;


public class Calculator_StepDefinition {
	double result;
	
	@Given("^user enters an \"([^\"]*)\"$")
	public void user_enters_an(String arg1) throws Throwable {
	       RPN_calc calc = new RPN_calc();
	       result = calc.calculate(arg1);
	}

	@Then("^result should be \"([^\"]*)\"$")
	public void result_should_be(String arg1) throws Throwable {
	     assertEquals(result, Double.valueOf(arg1),2);

	}

}
