package Interview2025;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class IplMatch {

    public static void main(String[] args){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.espncricinfo.com/series/ipl-2025-1449924/points-table-standings");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        int tableNo = 8;
       List<WebElement> teamsData =  driver.findElements(By.xpath("//a[@class='ds-flex ds-items-center ds-min-w-max']"));
            String name = teamsData.get(8).getText();
            String teamName = name.replaceAll("[0-9]|\\n", "");
            System.out.println(teamName);

    }
}
