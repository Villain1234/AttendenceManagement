package com.ams.comcast.add_ClassTest;

import java.io.IOException;

import org.apache.commons.math3.distribution.TDistribution;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.FinanceLib;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ams.comcast.pomrepository.AddClass;
import com.ams.comcast.pomrepository.Profile;
import com.ams.comcast.pomrepository.ShortAttendancePage;
import com.ams.comcast.pomrepository.StatisticsPage;
import com.ams.comcast.pomrepository.Teacher_Dashboard;
import com.ams.genericutility.BaseClass;
import com.ams.genericutility.DataBaseUtility;
import com.ams.genericutility.ExcelUtility;
import com.ams.genericutility.FileUtility;
import com.ams.genericutility.JavaUtility;
import com.ams.genericutility.WebDriverUtlity;
import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;


@Listeners(com.ams.genericutility.LisImpClass.class)
public class CreatClassByTeacher extends BaseClass{

	    @Test
		public void CreatClassByTeacher() throws Throwable{
			 int min=100;
			 int RanNum =min+ jLib.getRanDomNum(899);
			 int Ran30=jLib.getRanDomNum(30);
			 
			//test script Data
			String Code=eLib.getExcelData("Sheet1", 1, 1)+RanNum;
			String StartingRollNum=eLib.getExcelData("Sheet1", 1, 2);
			String EndingRollNum=eLib.getExcelData("Sheet1", 1, 3);
			
			System.out.println(Code);
			System.out.println(StartingRollNum);
			System.out.println(EndingRollNum);
			 /*step 2 : navigate to AddClass*/
			Teacher_Dashboard Td=new Teacher_Dashboard(driver);
			Td.getAddClassImg().click();
			
	      	// Select the Year Dropdownlist
			 AddClass Ad= new AddClass(driver);   
				Ad.SelectYearListByIndx(Ran30);
		

				// Enter Code
				Ad.EnterCode(Code);

				//  Choose Section
				Ad.ChooseSectionByIndex(2);

				// Choose Semester
				Ad.ChooseSemesterByIndex(2);
				// Enter Starting RollNumber
				Ad.EnterStartingRollNum(StartingRollNum);
				Ad.EnterEndingRollNum(EndingRollNum);

				// Click on Add Button

				Ad.getAddBtn().click();
				System.out.println("class added");

				// Verify the added  Class
				jLib.waitingCondition();

				String ActualText=Td.getactualCodeTextLoc().getText();
				System.out.println("Created Class Code Is: "+ActualText);
				if(ActualText.equalsIgnoreCase(Code)) 
				{
					System.out.println("Code Is Verifyed In Teachers DashBoard Page Class Created Successfully");
				}
				else {
					System.out.println("Code Is Not Varified in Teachers Dashboard Page");
				}
				Assert.fail();
				}
				
				@Test(retryAnalyzer =com.ams.genericutility.ReTryImpClass.class)
		public  void CreatClassByTeacherOnlyWithYearField() throws InterruptedException {
					 int min=100;
					 int RanNum =min+ jLib.getRanDomNum(899);
					int Ran30=jLib.getRanDomNum(30);
					
					// Navigate To AddClass

					Teacher_Dashboard Td= new Teacher_Dashboard(driver);
					jLib.waitingCondition();
					Td.getAddClassImg().click();

					// Select the Year Dropdownlist
					AddClass Ad= new AddClass(driver);
					Ad.SelectYearListByIndx(Ran30);
					
					// click on addBtn
					Ad.getAddBtn().click();
					
					// verify Alert
					String ExpectedMsg = "Invalid Code!";
					wLib.swithToAlertWindowAndAccpect(driver, ExpectedMsg);
					
					System.out.println(ExpectedMsg);
					
					// click on cancel button
					Ad.getCancleBtn().click();
					Assert.fail();
		}
				@Test
				public void DataFlowFromAddClassToAvgAttendancePage() throws EncryptedDocumentException, IOException, InterruptedException {
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
				@Test
				public void DataFlowBetweenAddClassAndProfileModule() throws InterruptedException, EncryptedDocumentException, IOException {
					 int min=100;
					 int RanNum =min+ jLib.getRanDomNum(899);
					int Ran30=jLib.getRanDomNum(30);
					
					/*test script Data*/
					String Code=eLib.getExcelData("Sheet1", 3, 1)+RanNum;
					String StartingRollNum=eLib.getExcelData("Sheet1", 3, 2);
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