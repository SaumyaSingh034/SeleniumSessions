package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTable {

    public WebDriver driver;
    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/frames");
    }

    @Test
    public void getWebTable() throws ParseException {
        String max;
        double m=0,r=0;
        //No. of column
        List<WebElement> column = driver.
                findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th[1]"));
        System.out.println(column.size());


        //No. of rows
        List<WebElement> rows = driver.
                findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println(rows.size());

        for(int i=1;i< rows.size();i++){
            max= driver.
                    findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).
                    getText();
            NumberFormat format = NumberFormat.getInstance();
            Number num = format.parse(max);
            max = num.toString();
            m = Double.parseDouble(max);
            if(m>r)
                r = m;
            System.out.println("Maximum Current Price :"+r);


        }


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
