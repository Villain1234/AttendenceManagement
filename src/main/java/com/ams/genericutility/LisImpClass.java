package com.ams.genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



	
	public class LisImpClass extends BaseClass implements ITestListener {

		public void ontestFailure(ITestResult result) throws IOException {
			
			 
			System.out.println("=======> Execute & i am Listner <======");
			/*int RanNum=jLib.getRanDomNum(899); 
			String testName = result.getMethod().getMethodName();
            EventFiringWebDriver ef = new EventFiringWebDriver(BaseClass.sdriver);
			//TakesScreenshot t= (TakesScreenshot) BaseClass.sdriver;
			File src = ef.getScreenshotAs(OutputType.FILE);
			try{
				FileUtils.copyFile(src,new File("./screenshot/"+testName+RanNum+".png"));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		public void onFinish(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailure(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestSkipped(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestStart(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestSuccess(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onFinish(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStart(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailure(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSkipped(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestStart(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSuccess(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}*/
}

		@Override
		public void onFinish(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStart(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailure(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSkipped(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestStart(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSuccess(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}
}