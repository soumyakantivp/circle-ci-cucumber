package SignupStepDefinitions2;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActions {

    @After
    public static void tearDown(Scenario scenario) {
    	
    	System.out.println("After");
        SeleniumDriver.tearDown();
    }
}
