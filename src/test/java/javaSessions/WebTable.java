package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
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

    }

    @Test
    public void getWebTable() throws ParseException {
        driver.get("https://demo.guru99.com/test/web-table-element.php");
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

    @Test
    public void simpleWebTable(){
        driver.get("https://demo.guru99.com/test/table.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement table = driver.findElement(By.xpath("//table[@cellspacing='1']/tbody"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@cellspacing='1']/tbody")));
        List<WebElement> row = table.findElements(By.tagName("tr"));
        List<WebElement> col ;

        System.out.println("Row Size : "+row.size());


        for(int i =0; i< row.size();i++){
         col   = row.get(i).findElements(By.tagName("td"));
            System.out.println("Number of cells in Row : "+col.size());
            for(int j=0;j<col.size();j++){
                System.out.println(col.get(0).getText());
            }
        }
    }

    @Test
    public void applyingFluentWait(){
        driver.get("https://www.google.co.in/");
        Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(
                Duration.ofSeconds(50))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        WebElement element = w.until(ExpectedConditions.presenceOfElementLocated(By.id("data")));
    }

    @Test
    public void testingSelenium(){
        SearchContext sc = new ChromeDriver();
        //Only SC methods are accessible

        WebDriver wd = new ChromeDriver();
        wd.quit();

        RemoteWebDriver rc = new ChromeDriver();
        rc.get(" ");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
