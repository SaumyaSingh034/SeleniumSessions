package Interview2024;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    TestListener testListener = new TestListener();

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
    }
}
