package Interview2024;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryMechanism implements IRetryAnalyzer {
    int maxTry = 3;
    int count=0;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<maxTry){
            count++;
            return true;
        }
        return false;
    }
}
