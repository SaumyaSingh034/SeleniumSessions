package Interview2024;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingRetry {

    @Test(retryAnalyzer = RetryListner.class)
    public void retyring(){
        Assert.assertTrue(false, "Failing");
    }
}
