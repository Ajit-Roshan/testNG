package utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Sort_screen extends sub.Basetest {	
		
	
	public void getShot() throws Throwable {
		
		File f= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("./Listener/one.png") );
		
	}
}
