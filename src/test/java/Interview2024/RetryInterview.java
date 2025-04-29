package Interview2024;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryInterview implements IRetryAnalyzer {
    int maxCount = 3;
    int retryAttemp = 0;
    @Override
    public boolean retry(ITestResult result) {
       if(retryAttemp<maxCount){
           retryAttemp++;
           return true;
       }
       return false;
    }
}
