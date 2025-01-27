package Interview2024;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "testData")
    public void testIng(String name, int age, String des){
        System.out.println(name+" --> "+age+"--> "+des);

    }


    @DataProvider(name="testData")
    public Object[][] data(){
        return new Object[][]{
            {"Saumya", 29, "Test Automation Engineer"},
            {"Rahul", 32, "Cloud Engineer"}
        };

    }
}
