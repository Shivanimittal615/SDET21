package com.crm.autodesk.GenericLiabraries;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelFileUtility {
	/**
	 * this method will read the data FROM Excel sheet
	 * @return 
	 * @throws Throwable 
	 */
        public String getExcelData(String sheetName, int rownum,int cellnum ) throws Throwable
        {
        	FileInputStream fis=new FileInputStream(IpathConstaints.ExcelFilePath);
        	
        	Workbook wb = WorkbookFactory.create(fis);
        	 org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);
        	 
        	 Row row = sheet.getRow(rownum);
        	 Cell cell = row.getCell(cellnum);
        	 String value = cell.getStringCellValue();
        	 return value;
        	 
        }
        
        /**
         * 
         */
        public Object[][] getExcelData(String sheetName ) throws Throwable
        {
        	FileInputStream fis=new FileInputStream(IpathConstaints.ExcelFilePath);
        	
        	Workbook wb = WorkbookFactory.create(fis);
        	 org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);
        	 
        	 int lastrow = sheet.getLastRowNum();
        	 short lastcell = sheet.getRow(0).getLastCellNum();
               
        Object [] [] data=new Object [lastrow] [lastcell];
        
        for (int i=0;i<lastrow;i++)
        {
        	for(int j=1;j<lastcell;j++)
        	{
        		data [i] [j]= sheet.getRow(i).getCell(j).getStringCellValue();
        	}
        }
        
        return data;
        
}
}