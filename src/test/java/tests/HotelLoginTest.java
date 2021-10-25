package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.Base;
import utilities.DriverUtility;

public class HotelLoginTest extends Base {

	@BeforeMethod
	public void beforeMethod() {
		initializeDriver();
		logger.info("User lunched Hotel website");

	}

	@AfterMethod
	public void afterMethod() {
		tearDown();

	}

	/**
	 * @param email
	 * @param pass
	 */
	@Test
	@Parameters({ "email", "pass" })
	public void loginTest(String email, String pass) {
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign in']"));
		Assert.assertTrue(signIn.isDisplayed());
		signIn.click();
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys(email);
		WebElement passField = driver.findElement(By.id("passwd"));
		passField.sendKeys(pass);
		DriverUtility.wait(3000);
		WebElement signInButton = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		Assert.assertTrue(signInButton.isDisplayed());
		DriverUtility.wait(3000);
		signInButton.click();
		DriverUtility.wait(3000);
		String message = driver.findElement(By.xpath("//p[@class ='info-account']")).getText();
		String expectedMessage = "Welcome to your account. Here you can manage all of your personal information and orders.";
		Assert.assertEquals(message, expectedMessage);
		DriverUtility.screenShot();

	}

}
