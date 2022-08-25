package org.AttendanceManagement.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*public class PrintAllTextVtigerApplicationTest 
{

  public static void main(String[] args)
  { 
	WebDriver driver=null;
	String BROWSER="chrome";
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
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("http://rmgtestingserver:8888/index.php?action=Login&module=Users");
    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
    driver.findElement(By.id("submitButton")).click();
    driver.findElement(By.xpath("//td[@class='tabUnSelected']/descendant::a[text()='Organizations']")).click();
    List<WebElement> lst = driver.findElements(By.xpath("//tr[@bgcolor='white']/td[3]"));
    for(WebElement name:lst)
    {
    	String orgName = name.getText();
    	System.out.println(orgName);
    }
    
    
    
  }
}*/
