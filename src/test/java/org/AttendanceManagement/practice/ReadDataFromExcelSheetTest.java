package org.AttendanceManagement.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*public class ReadDataFromExcelSheetTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
      //step 1 : Read the file using file input stream
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data\\TestData.xlsx");
		
		//step 2 : Create workbook
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step 3 : Load the sheet
		Sheet sh = workbook.getSheet("Sheet1");
		
		//step 4 : Navigate to the row
	    Row row = sh.getRow(1);
	    
	    //step 5 : Navigate to the cell
	    Cell cel = row.getCell(2);
	    
	    //step 6 : read the value inside the cell
	    System.out.println(cel.getStringCellValue());
	}

}*/
