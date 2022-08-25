package org.AttendanceManagement.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.AttendenceManagement.genericutility.ExcelUtility;
import com.AttendenceManagement.genericutility.FileUtility;
import com.AttendenceManagement.genericutility.IConstants;
import com.AttendenceManagement.genericutility.JavaUtility;
import com.AttendenceManagement.pomrepositorylib.CreateClass;
import com.AttendenceManagement.pomrepositorylib.CreateNewClass;
import com.AttendenceManagement.pomrepositorylib.Home;
import com.AttendenceManagement.pomrepositorylib.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class VerifyClassIsAddedTest 
//{
//public static void main(String[] args) throws Throwable
//{
		// create an object for utility
//	FileUtility fLib = new FileUtility();
//	ExcelUtility eLib = new ExcelUtility();
//	//WebDriverUtility wLib = new WebDriverUtility();

		
		
		//Step 1: Read all the necessary common data from property file
//	String URL = fLib.getPropertyKeyValue("url");
//	String USERNAME = fLib.getPropertyKeyValue("username");
//	String PASSWORD = fLib.getPropertyKeyValue("password");
//	String BROWSER = fLib.getPropertyKeyValue("browser");

	//Get random number
//   int randomNumber = JavaUtility.getRandomNumber();
	//Step 2 : Read the test data from excel sheet		
//		String classCode = eLib.getExcelData("Sheet1", 1, 2)+randomNumber;
//	String startRollNum = eLib.getExcelData("Sheet1", 1, 3);
//	String endtRollNum = eLib.getExcelData("Sheet1", 1, 4);
//	String SECTION = eLib.getExcelData("Sheet1", 1, 5);
//	String YEAR = eLib.getExcelData("Sheet1", 1, 6);
//		String SEMESTER = eLib.getExcelData("Sheet1", 1, 7);
        
		/*System.out.println(classCode);
       System.out.println(SECTION);
       System.out.println(YEAR);*/
       
        
		//Step 3 : Launch the browser ----- Run time polymorphism
//  WebDriver driver = null;

//if(BROWSER.equalsIgnoreCase("chrome"))
//{
//	WebDriverManager.chromedriver().setup();
//driver= new ChromeDriver();
//}
//else if(BROWSER.equalsIgnoreCase("firefox"))
//{
//	WebDriverManager.firefoxdriver().setup();
//	driver= new FirefoxDriver(); 
//}
//else
//{
//	System.out.println("INCORRECT BROWSER");
//}
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(IConstants.Implicitly_TIMEOUT, TimeUnit.SECONDS);
//driver.get(URL);

////Step 3 : Login to the application
//Login lp = new Login(driver);
//	lp.loginToApp(USERNAME, PASSWORD);
		
//	/*driver.findElement(By.name("email")).sendKeys(USERNAME);
//	driver.findElement(By.name("password")).sendKeys(PASSWORD);
//	driver.findElement(By.xpath("//button[text()='Login']")).click();*/
		
		//Step 4 : Creating or adding a class		
//	CreateClass cs = new CreateClass(driver);
//	cs.getCreateClass().click();
		
//	CreateNewClass cls = new CreateNewClass(driver);
//	cls.creatClass(classCode, startRollNum, endtRollNum, YEAR, SECTION, SEMESTER);
		
		    
		
	   /* driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus']")).click();
	    WebElement yr = driver.findElement(By.xpath("//select[@name='year']"));
	    wLib.select(yr, 0);
	    driver.findElement(By.xpath("//input[@class='form-control' and @name='code']")).sendKeys(classCode);
	    
	    WebElement section = driver.findElement(By.xpath("//select[@name='section']"));
	    wLib.select(section, 2);
	    
	    WebElement semester = driver.findElement(By.xpath("//select[@name='semester']"));
	    wLib.select(semester, 3);
	    driver.findElement(By.name("start")).sendKeys(startRollNum);
	    driver.findElement(By.xpath("//input[@name='end']")).sendKeys(endtRollNum);
	    driver.findElement(By.xpath("//button[text()='Add Class']")).click();*/
	    
		
//String section = cls.getSectionClsEtd().getText();
//String year = cls.getClsYearEtd().getText();
	    //WebElement codeElement = driver.findElement(By.xpath("//span[@class='code']"));
	   // wLib.waitForElement(driver, codeElement);	    
	  //  String code = driver.findElement(By.xpath("//span[@class='code']")).getText();
	    
	   // WebElement secElement = driver.findElement(By.xpath("//span[@class='section']"));
	   // wLib.waitForElement(driver, secElement);
	   // String sec = driver.findElement(By.xpath("//span[@class='section']")).getText();
	    
	   // WebElement yearElement = driver.findElement(By.xpath("//span[@class='year']"));
	   // wLib.waitForElement(driver, yearElement);
	    //String year = driver.findElement(By.xpath("//span[@class='year']")).getText();
	   // System.out.println(code);
        
// System.out.println("=============================================================================");
	    
	    //Step 5 : Verification and validiation of class 
	    
//	if(SECTION.equalsIgnoreCase(section)) 
//    	{
//  		if(YEAR.equalsIgnoreCase(year))
//		{
//         System.out.println("class is added sucessfully ====>  pass ");
//		}
//	}
	    
	    	
	    
// else 
//  {
// 	System.out.println("fail");
// }
	    
 //Step 6 : Logout the application
//  Home hp = new Home(driver);
//  hp.logout();
	  // hp.logout();
	    
//}
//}

