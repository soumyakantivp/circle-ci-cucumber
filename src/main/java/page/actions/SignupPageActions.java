package page.actions;

import org.openqa.selenium.support.PageFactory;

import page.locators.SignupPageLocators;
import utils.SeleniumDriver;

public class SignupPageActions {
	SignupPageLocators signupPageLocators = null;

	public SignupPageActions() {
		this.signupPageLocators = new SignupPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), signupPageLocators);
	}
	
	public void enterName(String name) {
		signupPageLocators.fullName.sendKeys(name);
	}
	
	public void enterOrgName(String org) {
		signupPageLocators.org.sendKeys(org);
	}
	
	public void enterEmail(String email) {
		
		signupPageLocators.email.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		signupPageLocators.password.sendKeys(password);
	}
	
	public void submit() {
		signupPageLocators.submit.click();
	}
	
	public void clickSignUpWithGoogle() {
		signupPageLocators.signupWithGoogle.click();
	}
	
	public void clickSignUpWithGithub() {
		signupPageLocators.signupWithGithub.click();
	}
}
