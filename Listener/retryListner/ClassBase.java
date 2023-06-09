package retryListner;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassBase {

	WebDriver dr;
	WebElement search;


	@BeforeMethod
	@Parameters("browser")
	public void Setup(String browse) {
		String browser = browse.toLowerCase();

		switch (browser) {
		case "chrome": {
			dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.navigate().to("https://www.google.com");
			
			search= dr.findElement(By.name("q"));
			break;
		}

		case "firefox": {
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
			dr.navigate().to("https://www.google.com");
			
			search= dr.findElement(By.name("q"));
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + browser);
		}
		
	}
	
	@AfterMethod
	public void teatDown() {
		dr.close();
	}
	
	
//	@Test(retryAnalyzer = Retry.class)
//	public void t1() {
//		search.sendKeys("Noamundi" , Keys.RETURN);
//		
//		System.out.println(dr.getTitle());
//		System.out.println(dr.getTitle().toLowerCase());
//		assertEquals(dr.getTitle().toLowerCase(), "naomundi");
//	}
	

	@Test
	public void t1() {
		search.sendKeys("Naomundi" , Keys.RETURN);
		
		System.out.println(dr.getTitle());
		System.out.println(dr.getTitle().toLowerCase());
		assertEquals(dr.getTitle().toLowerCase() ,"naomundi");
		System.out.println("pass");
	}
	
	
	@Test
	public void t2() {
		search.sendKeys("Chaibasa" , Keys.RETURN);
		
		System.out.println(dr.getTitle());
		assertEquals(dr.getTitle() , "Chaibasa");
		System.err.println("pass");
	}
}
