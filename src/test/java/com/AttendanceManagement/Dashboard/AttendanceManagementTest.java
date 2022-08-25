package com.AttendanceManagement.Dashboard;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.AttendenceManagement.genericutility.BaseClass;
import com.AttendenceManagement.genericutility.JavaUtility;
import com.AttendenceManagement.pomrepositorylib.CreateClass;
import com.AttendenceManagement.pomrepositorylib.CreateNewClass;
import com.AttendenceManagement.pomrepositorylib.Dashboardpage;
import com.AttendenceManagement.pomrepositorylib.Home;
import com.AttendenceManagement.pomrepositorylib.StudentAttendanceDetailspage;
import com.AttendenceManagement.pomrepositorylib.SubmitAttendancePage;

@Listeners(com.AttendenceManagement.genericutility.LisImpClass.class)
public class AttendanceManagementTest extends BaseClass {
	@Test
	public void createClassTest() throws Throwable {
		//Get random number
		int randomNumber = JavaUtility.getRandomNumber();

		//Step 2 : Read the test data from excel sheet		
		String classCode = eLib.getExcelData("Sheet1", 1, 2)+randomNumber;
		String startRollNum = eLib.getExcelData("Sheet1", 1, 3);
		String endtRollNum = eLib.getExcelData("Sheet1", 1, 4);
		String SECTION = eLib.getExcelData("Sheet1", 1, 5);
		String YEAR = eLib.getExcelData("Sheet1", 1, 6);
		String SEMESTER = eLib.getExcelData("Sheet1", 1, 7);


		//Step 4 : Creating or adding a class		
		CreateClass cs = new CreateClass(driver);
		cs.getCreateClass().click();
		CreateNewClass cls = new CreateNewClass(driver);
		cls.creatClass(classCode, startRollNum, endtRollNum, YEAR, SECTION, SEMESTER);
        
		String section = cls.getSectionClsEtd().getText();
		String year = cls.getClsYearEtd().getText();

		System.out.println("=============================================================================");

		//Step 5 : Verification and validiation of class 
		Assert.assertEquals(SECTION, section);
		Assert.assertEquals(YEAR, year);
		System.out.println("class is added sucessfully ====>  pass ");
		
		/*if(SECTION.equalsIgnoreCase(section)) 
		{
			if(YEAR.equalsIgnoreCase(year))
			{
				System.out.println("class is added sucessfully ====>  pass ");
			}
		}



		else 
		{ 
			System.out.println("fail");
		}*/

	}
	
	
	@Test(priority = 2)
	public void SubmitAttendanceTest() {
		SubmitAttendancePage acp = new SubmitAttendancePage(driver);
		acp.makeAttendance();
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-3000)");
		acp.getSubmitBtnEtd().click();
		
		//Navigating to statistic module 
  				Home hp = new Home(driver);
				hp.getStatisticsLink().click();
			
	}    
	
	
	@Test(dependsOnMethods = "SubmitAttendanceTest")
	public void CheckAttendanceOfStudentTest() {
		Dashboardpage dp = new Dashboardpage(driver);
		dp.studentAttendance();



	}
	
	@Test(dependsOnMethods = "CheckAttendanceOfStudentTest",retryAnalyzer = com.AttendenceManagement.genericutility.ReTryImpclass.class)
	public void VerifyAttendance() throws Throwable {
		
		String rollNum = eLib.getExcelData("Sheet1",1,3);
		StudentAttendanceDetailspage sap = new StudentAttendanceDetailspage(driver);
		sap.getResult(rollNum);
		//Assert.fail();
		
		
		
	}

}
