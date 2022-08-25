package com.ams.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ams.comcast.pomrepository.AddClass;
import com.ams.comcast.pomrepository.Login;
import com.ams.comcast.pomrepository.Profile;
import com.ams.comcast.pomrepository.ShortAttendancePage;
import com.ams.comcast.pomrepository.StatisticsPage;
import com.ams.comcast.pomrepository.Teacher_Dashboard;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sdriver;

	// Object To the Library
	public  ExcelUtility eLib=new ExcelUtility();
	public FileUtility fLib= new FileUtility();
	public JavaUtility jLib=new JavaUtility();
	public WebDriverUtlity wLib= new WebDriverUtlity();
	public DataBaseUtility dLib= new DataBaseUtility();
	@BeforeSuite
	public void configBS() {
		System.out.println("=====> Connect To the Data Base <=====");
	}
    
	//@Parameters("BROWSER")
	@BeforeClass
	public void configBC() throws EncryptedDocumentException, IOException {
		
		String BROWSER=fLib.getPropertyKeyValue("browser");
		
		System.out.println("===> Launch The Browser <===");
		
		//driver = new ChromeDriver();	
		//driver.manage().window().maximize();
		//sdriver=driver;
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		}
		else if (BROWSER.equalsIgnoreCase("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();		}
		else {
			System.out.println("enter correct browser");
		}
		sdriver=driver;
		wLib.waitForElementInDOM(driver);
		driver.manage().window().maximize();
		
		
	}
	@BeforeMethod
	public void configBM() throws IOException {
		System.out.println("===> Read The CoMMON Data And Login <===");
		String UN=fLib.getPropertyKeyValue("username");
		String PWD=fLib.getPropertyKeyValue("pwd");
		String URL=fLib.getPropertyKeyValue("url");
		
		// Navigate To The App
		driver.get(URL);
		
		// Login To The Application
		Login l=new Login(driver);
		l.LoginToApp(UN, PWD);
		
	}
	@AfterMethod
	public void configAM() throws InterruptedException {
		
		System.out.println("===> LogOut <===");
		Teacher_Dashboard Td=new Teacher_Dashboard(driver);
		jLib.waitingCondition();
		Td.getLogoutBtn().click();
	}
	@AfterClass
	public void configAC() {
		System.out.println("=====> Close The Browser <=====");
		driver.close();
	}
	@AfterSuite
	public void configAS() {
		System.out.println("=====>  Disconnect to The Data Base <=====");
	}
	

}
