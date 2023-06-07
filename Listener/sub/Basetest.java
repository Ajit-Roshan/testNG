package sub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basetest {

	public static WebDriver dr= null;

	@BeforeTest
	public void setup() {
		dr = new ChromeDriver();
		dr.manage().window().maximize();
	}

	@AfterTest
	public void tear() {
		dr.close();
	}

}
