package com.AttendenceManagement.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {
	WebDriver driver;
	public Dashboardpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[@class='class']")
	private WebElement classEtd;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClassEtd() {
		return classEtd;
	}
	
	public void studentAttendance()
	{
		StudentListPage sp = new StudentListPage(driver);
		OnlineAttendancepage oap = new OnlineAttendancepage(driver);
		classEtd.click();
		
		sp.studentAttendance();
		oap.endClass();
	}

}
