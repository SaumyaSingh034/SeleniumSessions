package Interview2025;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Slf4j
public class ScenarioBasedInterviewQuestions {

    public static WebDriver driver;

    public static void main(String[] args){
        //1. Highlight an element and then verify
        WebElement element = driver.findElement(By.id(""));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);


        String bgColor = element.getCssValue("background-color");
        if(!bgColor.equals("rgba(0,0,0,0)") && !bgColor.equals("transparent")){
            System.out.println("Highlights");
        }

        String textDecoration = element.getCssValue("text-decoration-line");
        if(textDecoration.equals("underline")){
        }
    }
}
