package com.ams.comcast.add_ClassTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ams.comcast.pomrepository.AddClass;
import com.ams.comcast.pomrepository.Profile;
import com.ams.comcast.pomrepository.Teacher_Dashboard;
import com.ams.genericutility.BaseClass;

@Listeners(com.ams.genericutility.LisImpClass.class)
public class DataFlowFromAddClassToProfileModule extends BaseClass {
	
	@Test
	public void DataFlowBetweenAddClassAndProfileModule() throws InterruptedException, EncryptedDocumentException, IOException {
		 int min=100;
		 int RanNum =min+ jLib.getRanDomNum(899);
		int Ran30=jLib.getRanDomNum(30);
		
		/*test script Data*/
		String Code=eLib.getExcelData("Sheet1", 3, 1)+RanNum;
		String StartingRollNum=eLib.getExcelData("Sheet1", 3, 1);
		String EndingRollNum=eLib.getExcelData("Sheet1", 3, 3);
		
		System.out.println(Code);
		System.out.println(StartingRollNum);
		System.out.println(EndingRollNum);
		
		
		//navigate to profile module
		Teacher_Dashboard Td= new Teacher_Dashboard(driver);
		Td.getProfileBtn().click();
		
		// Fetch the classCount From Profile Module
		Profile p= new Profile(driver);
		
		String TextBAC = p.getClassesCount().getText();
		//String TextBAC = ele1.getText();
		
		Object integer;
		int ecpectedClassCount=Integer.parseInt(TextBAC)+1;
		
		// Navigate to Teachers_Dashboard Module
		p.getDashBoardBtn().click();
		// Click On AddClass Button
		Td.getAddClassImg().click();
		AddClass ad=new AddClass(driver);
		ad.SelectYearListByIndx(5);
		ad.EnterCode(Code);
		jLib.waitingCondition();
		ad.ChooseSectionByIndex(2);
		ad.ChooseSemesterByIndex(2);
		ad.EnterStartingRollNum(StartingRollNum);
		ad.EnterEndingRollNum(EndingRollNum);
		ad.getAddBtn().click();
		
		jLib.waitingCondition();
		
		// Navigate To ProfilePage
		Td.ClickOnProfile();
		jLib.waitingCondition();
		
		// Compare The Class Count With Previous
		
		String TextAAC = p.getClassesCount().getText();
		//String TextAAC = ele.getText();
		int actualClassCount=Integer.parseInt(TextAAC);
		// Compare The Class Count With Previous
		
		if(ecpectedClassCount==actualClassCount) {
			System.out.println("Class Is Added Successfully");
		}
		else {
			System.out.println("Class Is not Added");
		}
	
	}

}
