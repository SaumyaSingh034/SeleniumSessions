package Interview2024;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args){
        try {
            FileInputStream fielIn = new FileInputStream("location of file");
            Workbook workbook = new XSSFWorkbook(fielIn);
            Sheet sheet =  workbook.getSheet("TestFData");
            String Value = sheet.getRow(0).getCell(0).getStringCellValue();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
