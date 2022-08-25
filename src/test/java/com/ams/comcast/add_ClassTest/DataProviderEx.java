package com.ams.comcast.add_ClassTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ams.genericutility.ExcelUtility;

public class DataProviderEx {
	
	@Test(dataProvider = "bookingTest_dataProvider")
	
	public void bookingTest(String src, String dest,int tckt) {
		System.out.println("Source is ===>"+ src + "destination is ===>"+dest+"No.of Ticktes is ===>"+tckt); 
	}
	@DataProvider
	public Object[][] bookingTest_dataProvider() throws EncryptedDocumentException, IOException {
		ExcelUtility eLib=new ExcelUtility();
		String source=eLib.getExcelData("Sheet2", 1, 1);
		
		String dest1 = eLib.getExcelData("Sheet2", 1, 2);
		String dest2=eLib.getExcelData("Sheet2", 2, 2);
		String dest3 = eLib.getExcelData("Sheet2", 3, 2);
		String dest4 = eLib.getExcelData("Sheet2", 4, 2);
		String dest5 = eLib.getExcelData("Sheet2", 5, 2);
		
		String ticket1=eLib.getExcelData("Sheet2", 1, 3);
		String ticket2=eLib.getExcelData("Sheet2", 2, 3);
		String ticket3=eLib.getExcelData("Sheet2", 3, 3);
		String ticket4=eLib.getExcelData("Sheet2", 4, 3);
		String ticket5=eLib.getExcelData("Sheet2", 5, 3);
		
		
		
		Object[][] arr=new Object[5][3];
		arr[0][0]=source;
		arr[0][1]=dest1;
		arr[0][2]=ticket1;
		
		arr[1][0]=source;
		arr[1][1]=dest2;
		arr[1][2]=ticket2;
		
		
		arr[2][0]=source;
		arr[2][1]=dest3;
		arr[2][2]=ticket3;
		
		arr[3][0]=source;
		arr[3][1]=dest4;
		arr[3][2]=ticket4;
		
		arr[4][0]=source;
		arr[4][1]=dest5;
		arr[4][2]=ticket5;
		return arr; 
		
		
		
	/*	
	    Object[][] arr=new Object[5][3];
		
		arr[0][0]="Bangalore";
		arr[0][1]="Goa";
		arr[0][2]=1;
		
		arr[1][0]="Bangalore";
		arr[1][1]="Mysore";
	    arr[1][2]=2;
		
		
		
		
		arr[2][0]="Bangalore";
		arr[2][1]="Mangalore";
		arr[2][2]=1;
		
		
		arr[3][0]="Bangalore";
		arr[3][1]="Mp";
		arr[3][2]=1;
		
		arr[4][0]="Bangalore";
		arr[4][1]="Hyd";
		arr[4][2]=1;
		
		//return arr;
		
		*/
	}
	
	
	
}
