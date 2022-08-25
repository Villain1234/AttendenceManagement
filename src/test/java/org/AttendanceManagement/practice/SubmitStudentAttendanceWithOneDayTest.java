package org.AttendanceManagement.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.AttendenceManagement.genericutility.FileUtility;
import com.AttendenceManagement.genericutility.IConstants;
import com.AttendenceManagement.pomrepositorylib.Home;
import com.AttendenceManagement.pomrepositorylib.Login;
import com.AttendenceManagement.pomrepositorylib.SubmitAttendancePage;

import io.github.bonigarcia.wdm.WebDriverManager;

/*public class SubmitStudentAttendanceWithOneDayTest 
{
	public static void main(String[] args) throws Throwable 
	{
		// create an object for utility
		FileUtility fLib = new FileUtility();
		

		//Step 1: Read all the necessary common data from property file
		String URL = fLib.getPropertyKeyValue("url");
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		String BROWSER = fLib.getPropertyKeyValue("browser");

		//Step 2 : Launch the browser ----- Run time polymorphism
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

		//Step 3 : Login to the application
		Login lp = new Login(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		


		//Step 4 : Navigating to the dashboard module and submitting the attendance
		
		SubmitAttendancePage acp = new SubmitAttendancePage(driver);
		acp.makeAttendance();
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-3000)");
		acp.getSubmitBtnEtd().click();
		
		

		//Step 5 : Navigating to statistic module 
		Home hp = new Home(driver);
		hp.getStatisticsLink().click();
		
		// Step 6 : Logout to the app
		hp.logout();

	}
}*/
