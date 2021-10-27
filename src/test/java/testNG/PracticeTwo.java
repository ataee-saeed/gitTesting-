package testNG;

import org.testng.annotations.*;

public class PracticeTwo {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before Test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after Test");
	}

	@Test(groups = { "green" })
	public void testOne() {

	}

	@Test(groups = { "blue" })
	public void testTwo() {

	}

	@Test(groups = { "blue" })
	public void testThree() {

	}

	@Test(groups = { "blue" })
	public void testFour() {

	}

	@Test(groups = { "blue" })
	public void testFive() {

	}

	@Test
	@Parameters({ "valueOne", "valueTwo", "valueThree", "valueFour" })
	public void values(String vOne,String vtwo,String vthree,String vFour) {
		
		System.out.println(vOne);
		System.out.println(vtwo);
		System.out.println(vthree);
		System.out.println(vFour);

	}
}
