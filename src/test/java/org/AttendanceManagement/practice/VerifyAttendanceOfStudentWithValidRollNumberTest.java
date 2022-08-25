package org.AttendanceManagement.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.AttendenceManagement.genericutility.ExcelUtility;
import com.AttendenceManagement.genericutility.FileUtility;
import com.AttendenceManagement.genericutility.IConstants;
import com.AttendenceManagement.pomrepositorylib.Login;
import com.AttendenceManagement.pomrepositorylib.StudentAttendanceDetailspage;

import io.github.bonigarcia.wdm.WebDriverManager;

/*public class VerifyAttendanceOfStudentWithValidRollNumberTest 
{
	public static void main(String[] args) throws Throwable
	{
		// create an object for utility
				FileUtility fLib = new FileUtility();
				ExcelUtility eLib = new ExcelUtility();
				
		//Step 1: Read all the necessary common data from property file
		
		String URL = fLib.getPropertyKeyValue("url");
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		String BROWSER = fLib.getPropertyKeyValue("browser");

		
		//Step 2 : Read the test data from excel sheet
		
		String rollNum = eLib.getExcelData("Sheet1",1,3);
		
		
		//Step 3 : Launch the browser ----- Run time polymorphism
		WebDriver driver = null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();

		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver(); 
		}
		else
		{
			System.out.println("INCORRECT BROWSER");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(IConstants.Implicitly_TIMEOUT, TimeUnit.SECONDS);
		driver.get(URL);

		//Step 4 : Login to the application
		Login lp = new Login(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		
		
		//Step 5 : Navigating to dashboard module and checking the attendance details of particular student
		
		StudentAttendanceDetailspage sap = new StudentAttendanceDetailspage(driver);
		sap.getResult(rollNum);
		
	}
}*/
