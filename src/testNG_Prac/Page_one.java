package testNG_Prac;

import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Page_one {

	@Parameters({"browser"})
	@Test
	public void testParameters(String browser) {
		System.err.println("browser is ::  "+browser);
	}
	
	@Test ( priority = 1 ,groups = "login")
	public void testOne() {
		System.out.println("testOne -    login");			/////
	}

	@Test ( priority = 2 ,groups = "login")
	public void testTwo() {
		System.out.println("testTwo -    login");			/////
	}
	
	@Test ( priority = 3 ,groups = "login")
	public void testThree() {
		System.out.println("testThree -  login");
		throw new SkipException("skipping test");			/////
	}
	
	@Test ( priority = 4 ,groups = "data")
	public void testFour() {
		System.out.println("testfour - data");			/////
	}
	
	@Test ( priority = 5 ,groups = "data")
	public void testFive() {
		System.out.println("testFive - data");			/////
	}
	
	
}
