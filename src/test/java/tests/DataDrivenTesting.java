package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import pageObj.HotelPageObject;
import utilities.DriverUtility;
import utilities.ExcelUtility;

public class DataDrivenTesting extends Base {

	HotelPageObject hotelPageObject;

	@BeforeMethod
	public void beforeMethod() {
		initializeDriver();
		logger.info("User lunched Hotel website");

	}

	@AfterMethod
	public void afterMethod() {
		tearDown();

	}

	@Test(dataProvider = "inputData")
	public void test(String email, String password) {
		System.out.println(email + " " + password);
		hotelPageObject = new HotelPageObject();
		Assert.assertTrue(hotelPageObject.isSignINDisplayed());
		hotelPageObject.clickOnSignIn();
		hotelPageObject.enterEmail(email);
		hotelPageObject.enterPassword(password);
		DriverUtility.screenShot();
		hotelPageObject.clickOnSignINButton();

	}

	@DataProvider(name="inputData")
	public Object[][] getDataSource() throws Exception {

		Object data[][] = ExcelUtility.getExcelData("info");
		return data;

	}
	
	

}
