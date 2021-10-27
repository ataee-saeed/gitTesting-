package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class TestNGDataProviderConcept {
	
	
	@Test(dataProvider ="dataProvider")
	@Ignore
	public void test(String value) {
		System.out.println(value);
		
	}
	
	@DataProvider(name = "dataProvider")
	public Object[][] data(){
		
		return new Object[][] {{"firstName"},{"lastName"},{"email"}};
	}
	
	@Test(dataProvider = "dataFromExcel")
	public void readDatafromExcel(String userName, String password) {
		System.out.println("userName from Excel is " + userName);
		System.out.println("password from Excel is " + password);
		//System.out.println("phone from Excel is " + phone);
	}
	
	@DataProvider(name ="dataFromExcel")
	public Object[][] getDataFromExcel(){
		Object data [][]=ExcelUtility.getExcelData("info");
		return data;
	}

	
	
}
