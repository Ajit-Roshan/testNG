package retryListner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private static int retryCount= 0;
	private static final int maxTry = 2;
	
	@Override
	public boolean retry(ITestResult result) {

		if(retryCount < maxTry) {
			retryCount++;
			return true;
		}
		
		return false;
	}	
}
