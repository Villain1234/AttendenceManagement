package com.ams.comcast.add_ClassTest;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ams.comcast.pomrepository.AddClass;
import com.ams.comcast.pomrepository.Teacher_Dashboard;
import com.ams.genericutility.BaseClass;

@Listeners(com.ams.genericutility.LisImpClass.class)
public class AddClassByTeacherOnlyWithYearField extends BaseClass{

	@Test
	public  void CreatClassByTeacherOnlyWithYearField() {
				 int min=100;
				 int RanNum =min+ jLib.getRanDomNum(899);
				int Ran30=jLib.getRanDomNum(30);
				
				// Navigate To AddClass

				Teacher_Dashboard Td= new Teacher_Dashboard(driver);
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

}
