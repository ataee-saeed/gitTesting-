package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	/* Every Test cases in TestNG will have @Test annotation
	 * @BeforeMethod : This annotation will run before each Test case it is similar to 
	 * BeforeHooks of Cucumber 
	 * @AfterMethod: This annotation will run after each Test case it is similar to 
	 * AfterHooks of Cucumber 
	 * @BeforeTest: This will run before first test in a single java class 
	 * @AfterTest: This will run After last test in a single java class
	 * @BeforeClass: This will run before Java class if we have multiple java classes 
	 * to store our Test cases
	 * @AfterClass: This will run after Java class if we have multiple java classes 
	 * to store our Test cases
	 * @BeforeGroup: this will run before a certain group of test cases
	 * @AfterGroup: this will run after a certain group of test cases
	 * @BeforeSuite: this will run before a suite of Test cases
	 * @AfterSuite: this will run after a suite of Test cases. 
	 * 
	 * The most used one in real work are @Test, @BeforeMethod @AfterMethod  @BeforeTest @After Test
	 * 
	 * In TestNG we can prioritize the test cases 
	 * 
	 */
	
	
	
	@Test (enabled = false) // this will skip the the execution for this testcase
	public void testA() {
		System.out.println("testA");
		
	}
	@Test(priority = 2)
	@Ignore // this will skip the execution for this testcase
	public void testB() {
		System.out.println("testB");
	}
	@Test(priority = 1, invocationCount = 10)
	public void testC() {
		System.out.println("testC");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod: This prints before each @Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod: This prints after each @Test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest: This prints before First @Test");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest: This prints after last @Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass: This prints before the class runs from test suite");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass: This prints after the class runs from test suite");
	}
	

}
