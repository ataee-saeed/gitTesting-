package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	// There are two ways to pass data in TestNG to Test cases
	// 1. is Parameters 
	//2. Data provider 
	
	
	@Test
	@Parameters({"firstName","lastName"})
	public void test(String fName,String lName) {
		System.out.println("First name is " +fName);
		System.out.println("Last name is " +lName);
	}

}
