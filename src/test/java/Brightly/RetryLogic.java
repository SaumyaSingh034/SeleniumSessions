package Brightly;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
    int initalRetry = 0;
    int maxRetry = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(initalRetry<maxRetry){
            initalRetry++;
            return true;
        }
        return false;
    }
}
