package com.AttendenceManagement.pomrepositorylib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmitAttendancePage 
{
	public SubmitAttendancePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	public WebElement getClassEtd() {
		return classEtd;
	}

	public List<WebElement> getPrasentyEtd() {
		return prasentyEtd;
	}

	public WebElement getSubmitBtnEtd() {
		return submitBtnEtd;
	}

	@FindBy(xpath = "//a[@class='no-decoration']")
	private WebElement classEtd;
	
	@FindBy(xpath = "//div[@class='student-record']/child::button[text()='A']")
	private List<WebElement> prasentyEtd;
	
	@FindBy(id = "submit")
	private WebElement submitBtnEtd;
	
	
	public void makeAttendance()
	{
		
		classEtd.click();
		
		for(WebElement attendance:prasentyEtd)
		{
			attendance.click();
			
		}
		
		
		
		
		
	}
	
 
}
