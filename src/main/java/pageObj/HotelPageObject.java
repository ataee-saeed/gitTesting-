package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HotelPageObject extends Base {

	// for each POM we need to create a constructor and then
	// create Pagefactory.InitElement method to initialize UI elements in this class

	public HotelPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Sign in']")
	private WebElement signIN;

	@FindBy(id = "email")
	private WebElement emailField;

	@FindBy(id = "passwd")
	private WebElement passwordField;

	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement signInButton;

	@FindBy(xpath = "//p[@class ='info-account']")
	private WebElement accountMessage;

	public void clickOnSignIn() {
		signIN.click();
	}

	/**
	 * This method will return true if SignIn is displayed
	 * and it will return false if SignIn is not displayed
	 * @return
	 */
	public boolean isSignINDisplayed() {
		if (signIN.isDisplayed())
			return true;
		else
			return false;

	}
	/**
	 * This method will enter email address to email field
	 * @param emailAddress
	 */
	public void enterEmail(String emailAddress) {
		emailField.sendKeys(emailAddress);
	}
	
	public void enterPassword(String passwordValue) {
		passwordField.sendKeys(passwordValue);
	}
	
	public void clickOnSignINButton() {
		signInButton.click();
	}
	
	public String successMessage() {
		return accountMessage.getText();
	}

}
