package com.ams.comcast.add_ClassTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ams.comcast.pomrepository.AddClass;
import com.ams.comcast.pomrepository.ShortAttendancePage;
import com.ams.comcast.pomrepository.StatisticsPage;
import com.ams.comcast.pomrepository.Teacher_Dashboard;
import com.ams.genericutility.BaseClass;
@Listeners(com.ams.genericutility.LisImpClass.class)
public class DataFlowFromAddClassToAvgAttendancePage extends BaseClass {
	
	@Test
	public void DataFlowFromAddClassToAvgAttendancePag() throws EncryptedDocumentException, IOException, InterruptedException {
		 int min=100;
		 int RanNum =min+ jLib.getRanDomNum(899);
		int Ran30=jLib.getRanDomNum(30);
		
		/*test script Data*/
		String Code=eLib.getExcelData("Sheet1", 2, 1)+RanNum;
		String StartingRollNum=eLib.getExcelData("Sheet1", 2, 2);
		String EndingRollNum=eLib.getExcelData("Sheet1", 2, 3);
		
		System.out.println(Code);
		System.out.println(StartingRollNum);
		System.out.println(EndingRollNum);

		
		
		Teacher_Dashboard Td= new Teacher_Dashboard(driver);
		Td.getAddClassImg().click();
		// Select Year List
		AddClass Ac= new AddClass(driver);
		Ac.SelectYearListByIndx(30);
		// Enter The Class Code
		Ac.EnterCode(Code);
		// Choose Section
		Ac.ChooseSectionByIndex(1);
		// Choose Semester
		Ac.ChooseSemesterByIndex(1);
		// Enter The Starting RollNumber
		Ac.EnterStartingRollNum(StartingRollNum);
		// Enter the ending RollNumber
		Ac.EnterEndingRollNum(EndingRollNum);
		// Click ON Add Button
		Ac.getAddBtn().click();
		
		// Navigate To Statistics Page
		Td.ClickOnStatistics();
		// Click On Short Attendance Page
		StatisticsPage s=new StatisticsPage(driver);
		s.getShortAttendanceBtn().click();
		// Fetch the recently created Class Code
		ShortAttendancePage Sa= new ShortAttendancePage(driver);
		jLib.waitingCondition();
		String ActualCode = Sa.getRecentlyCreatedClassCode().getText();
		if(ActualCode.trim().contains(Code)) {
			System.out.println("DataFlow Happened Successfully");
		}
		else{
			System.out.println("Data Flow Is Not Happening");
		}
		
	}

}
