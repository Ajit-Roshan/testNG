package sub;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClass extends Basetest {
	
	
	@Test
	public void b() {
		dr.get("https://www.google.com");
	}
	
	@Test
	public void c() {
		throw new SkipException("deleberately skipping");
	}
	
	@Test
	public void d() {
		dr.findElement(By.name("q")).sendKeys("alice");
	}
	
	@Test
	public void e() {
		dr.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	
	
}
