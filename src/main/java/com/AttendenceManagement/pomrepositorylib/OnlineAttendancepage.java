package com.AttendenceManagement.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineAttendancepage {

	public	OnlineAttendancepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Online Attendance")
	private WebElement onlineAttEdd;

	@FindBy(linkText = "Logout")
	private WebElement logoutEdd;

	public WebElement getOnlineAttEdd() {
		return onlineAttEdd;
	}

	public WebElement getLogoutEdd() {
		return logoutEdd;
	}
	
	public void endClass()
	{
		onlineAttEdd.click();
		//logoutEdd.click();
		
	}

}
