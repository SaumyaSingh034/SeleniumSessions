package Interview2024;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListner implements IRetryAnalyzer {
    int maxRetry = 3;
    int attempt = 0;
    @Override
    public boolean retry(ITestResult result) {
        if(attempt<maxRetry){
            attempt++;
            return true;
        }
        return false;
    }
}
