package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PracticeOne {
	@Test (priority = 2,enabled =false)
	public void JamesBond() {
	}

	@Test(priority = 3)
	public void troy() {
	}

	@Test(priority = 1)
	@Ignore
	public void godFather() {
	}

	@Test(priority = 5)
	public void Terminator() {
	}

	@Test(priority = 4)
	public void titanic() {
	}

	@Test(priority = 6)
	public void starsWar() {
	}

	@Test(priority = 7)
	public void harryPotter() {
	}

	@Test(priority = 8)
	public void forrestGump() {
	}

	@Test(priority = 9)
	public void narnia() {
	}

	@Test(priority = 10)
	public void avengers() {
	}

}
