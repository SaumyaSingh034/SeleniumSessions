package javaSessions;

import analyzer.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetrySession {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test1(){
        Assert.assertEquals(false, true);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test2(){
        Assert.assertEquals(false, true);
    }
}
