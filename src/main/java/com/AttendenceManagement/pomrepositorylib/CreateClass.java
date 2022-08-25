package com.AttendenceManagement.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateClass {
	public CreateClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")
	private WebElement createClassBtn;
	
	public WebElement getCreateClass() {
		return createClassBtn;
	}

}
