package org.AttendanceManagement.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*public class GoibiboFlightTest
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
		driver.get("https://www.goibibo.com/");
		Actions act= new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.xpath("//span[text()='From']/following-sibling::p[text()='Enter city or airport']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("blr");
		driver.findElement(By.xpath("//span[text()='Bengaluru, India']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune");
		driver.findElement(By.xpath("//p[text()='Pune Airport']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'August')]/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='18']")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		
		
		
	}
}*/
