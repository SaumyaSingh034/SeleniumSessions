package Interview2024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("TestDataSheet");
        Cell cell = sheet.createRow(0).createCell(0);
        cell.setCellValue("Hello Apache Poi");

        try {
            FileOutputStream fileOut = new FileOutputStream("Testsdta.xlsx");
            workbook.write(fileOut);
            workbook.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }}
