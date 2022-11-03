package com.ams.comcast.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatisticsPage {
	
	public WebDriver driver;

	public StatisticsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindAll({@FindBy(linkText = "Short Attendance") , @FindBy(xpath = "//a[@href='#detained']")})
	private WebElement ShortAttendanceBtn;
		
	public WebElement getShortAttendanceBtn() {
		return ShortAttendanceBtn;
	}


}
