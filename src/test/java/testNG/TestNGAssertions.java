package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {

	@Test(enabled= false)
	public void hardAssertion() {

		System.out.println("This is before assertion");
		boolean a = true;
		Assert.assertTrue(a);
		System.out.println("This is after assertion");
		Assert.assertEquals(10, 12);

	}
	
	@Test
	public void softAssertion() {
	// TestNG provides a class named SoftAssert and we can create object of this class
	// and we can use soft assert methods to verify the actual vs expected result
	//once we write all assertions then we have to write assertall method at the end of verification
		SoftAssert softAssert = new SoftAssert();
		boolean a = false;
		int x = 10;
		int y = 12; 
		softAssert.assertTrue(a);
		System.out.println("this is after first verification");
		softAssert.assertEquals(x, y);
		System.out.println("this is after second verification");
		softAssert.assertEquals("TEKSchool", "Retail");
		System.out.println("this is after Third verification");
		softAssert.assertEquals("100KSalary", "NotStudying");
		
		softAssert.assertAll();
	}
	

}



