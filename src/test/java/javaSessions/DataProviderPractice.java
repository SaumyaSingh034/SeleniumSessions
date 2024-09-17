package javaSessions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

    @DataProvider(name="TestMyData")
    public Object[][] setUpData(){
        return new Object[][] {
                {"Saumya","Singh",8},
                {"Rahul","Singh",9},
                {"Tryaksh", "Singh",10}

        };
    }


    @Test(dataProvider = "TestMyData")
    public void runnWithBelowSetOfData(String fName, String lName, int number){
        System.out.println(fName +" "+lName+" "+number);
    }
}
