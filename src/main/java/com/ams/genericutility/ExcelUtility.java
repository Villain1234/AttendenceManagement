package com.ams.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

		 /** its used to read the data from Excel-Workbook base on below 
		 * @param sheetName
		 * @param rowNuum
		 * @param cellNum
		 * @param String data
		 * @throws IOException 
		 * @throws EncryptedDocumentException 
		 * @throws Throwable
		 */
		public String getExcelData(String sheetName , int rowNum , int celNum) throws EncryptedDocumentException, IOException  {
			FileInputStream fis = new FileInputStream(IConstants.EXCELPATH);
			Workbook WB = WorkbookFactory.create(fis);
			Sheet sh= WB.getSheet(sheetName);
			Row row=sh.getRow(rowNum);
			String data=row.getCell(celNum).getStringCellValue();
			
			return data;
			
		}
		public void setExcelData(String sheetName , int rowNum , int celNum , int data) throws EncryptedDocumentException, IOException  {
			FileInputStream fis = new FileInputStream(IConstants.EXCELPATH);
			Workbook wb= WorkbookFactory.create(fis);
			Sheet sh= wb.getSheet(sheetName);
			Row row=sh.getRow(rowNum);
			Cell cel=row.getCell(celNum);
		    cel.setCellValue(data);
		    FileOutputStream fos= new FileOutputStream(IConstants.EXCELPATH);
		    wb.write(fos);
		    wb.close();
			
			
		}

	

}
