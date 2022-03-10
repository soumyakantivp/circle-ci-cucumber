package SignupStepDefinitions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.actions.SignupPageActions;
import utils.SeleniumDriver;

public class SignupSteps2 {
	SignupPageActions action = new SignupPageActions();
	
	@Given("the user navigates to EBL Signup")
	public void the_user_navigates_to_ebl_signup() {
		System.out.println("in");
		// Write code here that turns the phrase above into concrete actions
		SeleniumDriver.openPage("https://auth.viasocket.com/signup");
	}

	@Then("the user enters {string} as full name")
	public void the_user_enters_as_full_name(String string) {
		// Write code here that turns the phrase above into concrete actions
		action.enterName(string);
	}

	@Then("the user enters {string} as org name")
	public void the_user_enters_as_org_name(String string) {
		// Write code here that turns the phrase above into concrete actions
		if(!string.equals("org"))
			string+=(int)Math.round(Math.random()*10000);
		action.enterOrgName(string);
	}

	@Then("the user enters {string} as email")
	public void the_user_enters_as_email(String string) {
		// Write code here that turns the phrase above into concrete actions
		action.enterEmail((int)Math.round(Math.random()*10000)+string);
	}

	@Then("the user enters {string} as password")
	public void the_user_enters_as_password(String string) {
		// Write code here that turns the phrase above into concrete actions
		action.enterPassword(string);
	}
	
	@Then("the user clicks submit")
	public void the_user_clicks_submit() {
	    // Write code here that turns the phrase above into concrete actions
		action.submit();
	}
	
	@Then("the user is {string}")
	public void the_user_is(String string) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		Thread.sleep(5000);
		WebDriver driver = SeleniumDriver.getDriver();
		System.out.println(driver.getTitle());
		if(string.equalsIgnoreCase("logged in")) {
			if(!driver.getTitle().contains("Socket"))
				throw new InterruptedException();
		}
		else if(string.equalsIgnoreCase("not logged in")){
			if(driver.getTitle().contains("Socket"))
				throw new InterruptedException();
		}
	}
}
