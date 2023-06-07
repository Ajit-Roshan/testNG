package baseClass;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class CrossBrowser2 {

	WebDriver dr;

	@Test
	public void browserSetup() {
		
		String browserType= "firefox";
		
		if(browserType.equalsIgnoreCase("chrome")) {
			dr= new ChromeDriver();
			dr.manage().window().maximize();
		}
		else if(browserType.equalsIgnoreCase("firefox")) {
			dr= new FirefoxDriver();
			dr.manage().window().maximize();			
		}		
	}
	
	@Test
	public void  pageSetup() throws Throwable {
		dr.get("https://www.google.com");
		
		dr.findElement(By.name("q")).sendKeys("firefox");
		File screen= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		Files.copy(screen, new File("/home/rnc/newSpace/NG_Test/htmlReport/fire.png")  );
		
		Thread.sleep(5000);
		
		dr.close();
	}
}








