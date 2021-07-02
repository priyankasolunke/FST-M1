package CucumberTest;


	/*import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinations"}
	    //tags = "@Activity1_1"
	)

	public class ActivitiesRunner {
	    //empty
	}
	
	*/
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinations"}
    //tags = "@activity1_2"
)

public class ActivitiesRunner {
    //empty
}


