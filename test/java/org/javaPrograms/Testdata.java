package org.javaPrograms;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class Testdata {
    public static void main(String[] args) throws IOException {
        String filepath="C:\\Users\\manik\\OneDrive - Microsoft 365\\Documents\\Interview\\Testdata.xlsx";
        String sheetName="Sheet1";
        FileInputStream fileInputStream=new FileInputStream(new File(filepath));
        Workbook workbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount= sheet.getLastRowNum();
        System.out.println(rowCount);

        for(int i=0;i<=rowCount;i++){
            Row row =sheet.getRow(i);
            for(int j=0;j<row.getLastCellNum();j++){
                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
            }
            System.out.println();

        }

    }
}
