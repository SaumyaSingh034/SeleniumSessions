package Interview2025;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDataLoading {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File(""));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("AutomationKey");
       // sheet.getRow(0).getCell(0);
        for(int i=1;i<sheet.getLastRowNum();i++){
            sheet.getRow(i).getCell(0);
        }

    }
}
