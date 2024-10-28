package vimoFitment;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadindDataFromExcel {
    public WebDriver driver;

    @Test
    public void readDataFromExcel(){
        File src = new File("pathofthe file");
        try {
            FileInputStream fis = new FileInputStream(src);
            Workbook workbook = new HSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            for(int i=1;i<sheet.getLastRowNum();i++){
                Cell cell = sheet.getRow(i).getCell(1);
                String value = cell.getStringCellValue();
                driver.findElement(By.id("q")).sendKeys(value);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}