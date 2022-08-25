package com.AttendenceManagement.genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImpClass implements ITestListener {
	public void onTestFailure(ITestResult result) {
		JavaUtility jLib = new JavaUtility();
		int ranNum = JavaUtility.getRandomNumber();
		String date = jLib.getSystemDate();
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + "============= Exucute & I'm Listening ================");
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.sdriver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./screenshot/"+testName+ranNum+date+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
