package testNG_Prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Data_Provider_Practice {

	static WebDriver dr;
	
	ExtentReports er; 
	ExtentSparkReporter sr;
	ExtentTest et;


	
	@BeforeTest
	public void before() {
		System.out.println("before is started");	
		
		er= new ExtentReports();
		sr= new ExtentSparkReporter("/home/rnc/newSpace/NG_Test/htmlReport/new.html");
		
		er.attachReporter(sr);
		
		et = er.createTest("loginTest").assignAuthor("Ajit");
		
	}
	
	@AfterTest
	public void after() {
		System.out.println("after is closing");
		er.flush();
	}
	
	@Test(dataProvider = "data")	
	public void test(String user, String pass) throws Throwable {
//		System.out.println("user is :: "+user+"  "+"pass is :: "+pass);
		
		ChromeOptions co= new ChromeOptions();
		co.setHeadless(true);
		
		dr= new ChromeDriver(co);		
		
		dr.manage().window().maximize();
		dr.get("https://www.saucedemo.com/");
		
		
		WebElement fillUser=  dr.findElement(By.id("user-name"));
		WebElement fillPass=  dr.findElement(By.id("password"));
		
		fillUser.sendKeys(user);
		fillPass.sendKeys(pass);
		
		Thread.sleep(500);
		
		dr.findElement(By.id("login-button")).click();
				
		if(dr.getCurrentUrl().contains("inventory")) {
			Reporter.log("PASS");
			et.log(Status.PASS, "Login is pass with >> "+user+"  "+pass);
		}
		else {
			Reporter.log("FAIL");
			et.log(Status.FAIL, "Login is fail with >> "+user+"  "+pass);
		}
		
		dr.close();
	}
	
	@DataProvider(name = "data")
	public Object[][] dataStorage(){
		
		return new Object[][] {
			{"standard_user" , "secret_sauce"},{"standard_user" , "pass2"},{"user3" , "pass3"},{"standard_user" , "secret_sauce"},
			{"user5" , "secret_sauce"},{"problem_user" , "pass6"},{"problem_user" , "secret_sauce"},{"user8" , "pass8"},
			
		};		
	}	
}
