package base;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.Sort_screen;

public class Base_Listner extends Sort_screen implements ITestListener {

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped --"+result.getName());			
		
		try {
//			getScreen_capture();
			getShot();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("start "+result.getName());	
	}
	
}
