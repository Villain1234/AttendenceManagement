package com.ams.comcast.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShortAttendancePage {
	
	public WebDriver driver;
	
	public ShortAttendancePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath = "(//div[@class='classes'])[last()]")
	private WebElement RecentlyCreatedClassCode;
	
	public WebElement getRecentlyCreatedClassCode() {
		return RecentlyCreatedClassCode;
	}

}
