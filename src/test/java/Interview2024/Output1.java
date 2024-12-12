package Interview2024;

import org.testng.annotations.Test;

public class Output1 {
    @Test(priority=90)
    void airplane(){
        System.out.println("airplane");}
    @Test
    void distance()
    {System.out.println("distance");}
    @Test (priority=-10)
    void landing(){System.out.println("landing");}
    @Test
    void miles()
    {System.out.println("miles");}

    @Test
    void apple()
    {System.out.println("apple");}
}
