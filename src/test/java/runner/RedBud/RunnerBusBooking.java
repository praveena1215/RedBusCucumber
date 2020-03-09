package runner.RedBud;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith (Cucumber.class)
	@CucumberOptions (
			
			features = "./Features",
			glue = "BusBookingStepDef",
			format = {"pretty", "html:target/cucumber-html-report"}
			)
	
	public class RunnerBusBooking {

}
