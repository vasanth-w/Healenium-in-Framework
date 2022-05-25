package Image;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer {
 int minimum=0,maximum=1;
	@Override
	public boolean retry(ITestResult result) {
		if (minimum<maximum) {
			minimum++;
			return true;
		}
		return false;
	}

}
