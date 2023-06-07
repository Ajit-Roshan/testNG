package testNG_Prac;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Before_After  {
	
	public static void main(String[] args) {
		
		ExtentReports er= new ExtentReports();
		ExtentSparkReporter sr= new ExtentSparkReporter("/home/rnc/newSpace/NG_Test/htmlReport/report.html");
		
		er.attachReporter(sr);		
		
		ExtentTest et= er.createTest("basic testing with 5.0.9 version ").assignAuthor("ajit").assignCategory("system");
		
		et.log(Status.PASS, "pass one");
		et.log(Status.PASS, "pass two");
		et.log(Status.FAIL, "fail three");
		et.log(Status.PASS, "pass four");
		et.log(Status.FAIL, "fail five");
		et.log(Status.FAIL, "fail six");
		et.log(Status.PASS, "pass seven");
		
		er.flush();		
		
		
		System.out.println("runnable test");
		
	}
	
}