package com.AttendenceManagement.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentListPage {
	public StudentListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(xpath = "//a[text()='110/AB/07']")
	private WebElement studentEtd;

	public WebElement getStudentEtd() {
		return studentEtd;
	}
	
	public void studentAttendance()
	{
		studentEtd.click();
	}

}
