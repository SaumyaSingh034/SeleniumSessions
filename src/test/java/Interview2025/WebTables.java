package Interview2025;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class WebTables {
    public WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void countRow(String id){
        List<WebElement> row = driver.findElements(By.xpath("//*[@id='tableId']/tbody/tr"));
        row.size();
        List<WebElement> col = driver.findElements(By.xpath("//*[@id='tableId]/tbdoy/tr/th"));
        col.size();

    }

    public void printRow(){
        List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=tableId]/tbody/tr"));

        for(int i=0;i< allRows.size();i++){
            List<WebElement> cols = driver.findElements(By.xpath("//*[@id='tableId']/tbody/tr["+i+"]/td"));
            for(WebElement e : cols){
                System.out.println(e.getText());
            }
            System.out.println();
        }
    }
}
