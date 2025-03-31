package TestNGTesting;

import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 implements ITestListener {

    @BeforeTest
    public void beforeTest1(){
        System.out.println("Before Test 1");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("Before Class 1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method 1");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(groups = "smoke")
    public void test2(){
        System.out.println("Test 2");
    }

    @Test(dependsOnMethods = "test1")
    public void test3(){
        System.out.println("Test 3");
    }

}
