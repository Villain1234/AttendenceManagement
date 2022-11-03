package org.AttendanceManagement.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
// just for the gitbub sample
/*public class DataProviderExTest {
	
	@Test(dataProvider ="bookingTest_dataProvider" )
	public void bookingTest(String src, String dest, String tckt) {
		
		
		System.out.println("Source==>"+src+", Destination==> "+dest+" and No. of tickets==> "+tckt);
	}
	
	@DataProvider
	public Object[][] bookingTest_dataProvider() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data\\SampleDataProvider.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String source = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		String dest1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String dest2 = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		String dest3 = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		String dest4 = wb.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		String dest5 = wb.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
		
		String tckt1 = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String tckt2 = wb.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		String tckt3 = wb.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		String tckt4 = wb.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
		String tckt5 = wb.getSheet("Sheet1").getRow(5).getCell(2).getStringCellValue();





		Object arr[][]= new Object[5][3];
		arr[0][0]=source;
		arr[0][1]=dest1;
		arr[0][2]=tckt1;
		
		arr[1][0]=source;
		arr[1][1]=dest2;
		arr[1][2]=tckt2;
		
		arr[2][0]=source;
		arr[2][1]=dest3;
		arr[2][2]=tckt3;
		
		arr[3][0]=source;
		arr[3][1]=dest4;
		arr[3][2]=tckt4;
		
		arr[4][0]=source;
		arr[4][1]=dest5;
		arr[4][2]=tckt5;
		
		return arr;
	}


}*/
