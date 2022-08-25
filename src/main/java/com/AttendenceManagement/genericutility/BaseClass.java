package com.AttendenceManagement.genericutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.AttendenceManagement.pomrepositorylib.Home;
import com.AttendenceManagement.pomrepositorylib.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
    public static WebDriver sdriver;
	
	/* Object creation for Lib */
	
	   public DataBaseUtility dLib = new DataBaseUtility();
	   public ExcelUtility eLib = new ExcelUtility();
	   public FileUtility fLib = new FileUtility();
	   public JavaUtility jLib = new JavaUtility();
	   public WebDriverUtility wLib = new WebDriverUtility();
	   
	   @BeforeSuite
	   public void configBS() {
		   System.out.println("================ Connect to the database ===================");
		   
	   }
	   
	   @BeforeClass
	   public void configBC() throws Throwable{
		  
		   System.out.println("================ Lounch the browser ===================");
		  // driver = new ChromeDriver();
		   String BROWSER = fLib.getPropertyKeyValue("browser");

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
		   
		   sdriver = driver;
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(IConstants.Implicitly_TIMEOUT, TimeUnit.SECONDS);
  		   
	   }
	   
	   @BeforeMethod
	   public void configBM() throws Throwable {
		   /* Reading the common data */ 
		   String URL = fLib.getPropertyKeyValue("url");
		   String USERNAME = fLib.getPropertyKeyValue("username");
		   String PASSWORD = fLib.getPropertyKeyValue("password");
		   
		   /* Navigate to the app */
		   driver.get(URL);
		   
		   /* Step 1 : Login */
		   Login lp = new Login(driver);
		   lp.loginToApp(USERNAME, PASSWORD);
		   
	   }
	   
	   @AfterMethod
	   public void configAM() throws Throwable {
		   Home hp = new Home(driver);
		   hp.getLogoutLink().click();
		   
		   
	   }
	   
	   @AfterClass
	   public void configAC() {
		   System.out.println("================ Close the browser ===================");
		   driver.close();
	   }
	   
	   @AfterSuite
	   public void configAS() {
		   System.out.println("================ Database connection is closed ===================");

	   }
	   
	

}
