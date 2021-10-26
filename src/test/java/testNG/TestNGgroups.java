package testNG;

import org.testng.annotations.Test;

public class TestNGgroups {

	@Test (groups = {"smoke"})

	public void testOne() {
		System.out.println("This is Smoke Test");
	}

	@Test (groups = {"smoke"})
	public void testTwo() {
		System.out.println("This is Smoke Test");
	}

	@Test(groups = {"regression"})
	public void testThree() {
		System.out.println("This is Regression Test");
	}

	@Test(groups = {"regression"})
	public void testFour() {
		System.out.println("This is Regression Test");
	}

	@Test(groups = {"regression"})
	public void testFive() {
		System.out.println("This is Regression Test");
	}

	@Test(groups = {"regression"})
	public void testSix() {
		System.out.println("This is Regression Test");
	}

}
