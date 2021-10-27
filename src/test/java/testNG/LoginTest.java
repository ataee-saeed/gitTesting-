package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import pageObj.HotelPageObject;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	
	@BeforeMethod
	public void beforeMethod() {
		initializeDriver();
		logger.info("browser opened");
	}
	
	@AfterMethod
	public void afterMethod() {
		tearDown();
		logger.info("browser closed");
	}
	
	@Test(dataProvider = "dataprovider")
	public void testLogin(String userName, String password) {
		HotelPageObject  hotelPage = new HotelPageObject();
		hotelPage.clickOnSignIn();
		logger.info("user clicked on signIn");
		hotelPage.enterEmail(userName);
		hotelPage.enterPassword(password);
		hotelPage.clickOnSignINButton();
		
		
	}
	
	@DataProvider(name= "dataprovider")
	public Object[][]getData(){
		Object data[][] = ExcelUtility.getExcelData("info");
		return data;
	}
	
	

}
