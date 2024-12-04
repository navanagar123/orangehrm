package com.OrangeHRM.Util;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility
{
        public  String getDataFromExcel(String sheetName,int row,int cell) throws IOException {
            FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\New folder\\OrangeHRM\\OrangeHRMTestData.xlsx");
            Workbook wb= WorkbookFactory.create(fis);
            String value= wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
            return value;
        }
    }

