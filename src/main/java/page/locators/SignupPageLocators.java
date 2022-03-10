package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignupPageLocators {

	@FindBy(how = How.XPATH, using="//input[@id='full_name']")
	public WebElement fullName;
	
	@FindBy(how = How.XPATH, using="//input[@id='signupPassword']")
	public WebElement password;
	
	@FindBy(how = How.XPATH, using="//input[@id='signupEmail']")
	public WebElement email;
	
	@FindBy(how = How.XPATH, using="//input[@id='organisation']")
	public WebElement org;
	
	@FindBy(how = How.XPATH, using="//button[@id='submitButton']")
	public WebElement submit;
	
	@FindBy(how = How.XPATH, using="//span[normalize-space()='Google']")
	public WebElement signupWithGoogle;
	
	@FindBy(how = How.XPATH, using="//img[@src='assets/github.svg']")
	public WebElement signupWithGithub;
}
