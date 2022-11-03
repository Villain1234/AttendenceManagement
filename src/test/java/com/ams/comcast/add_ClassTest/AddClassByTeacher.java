
package com.ams.comcast.add_ClassTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ams.comcast.pomrepository.AddClass;
import com.ams.comcast.pomrepository.Teacher_Dashboard;
import com.ams.genericutility.BaseClass;

@Listeners(com.ams.genericutility.LisImpClass.class)
public class AddClassByTeacher extends BaseClass{
	
	@Test(retryAnalyzer =com.ams.genericutility.ReTryImpClass.class)
	public void AddClass() throws Throwable{
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
			
		//	SoftAssert Sf=new SoftAssert();
			
		//	Sf.assertEquals(Code, ActualText);
			
			if(ActualText.equalsIgnoreCase(Code)) 
			{
				System.out.println("Code Is Verifyed In Teachers DashBoard Page Class Created Successfully");
			}
			else {
				System.out.println("Code Is Not Varified in Teachers Dashboard Page");
			}
			
			Assert.fail();
	}
			
	
}