package com.AttendenceManagement.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}

	@FindBy(xpath = "//form[@id='login']/descendant::input[@type='email']")
	private WebElement userNameEtd;

	@FindBy(xpath = "//form[@id='login']/descendant::input[@type='password']")
	private WebElement passwordEtd;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginBtn;

	
	
	public WebElement getUserNameEtd() {
		return userNameEtd;
	}



	public WebElement getPasswordEtd() {
		return passwordEtd;
	}



	public WebElement getLoginBtn() {
		return loginBtn;
	}



	public void loginToApp(String userName,String password)
	{
		userNameEtd.sendKeys(userName);
		passwordEtd.sendKeys(password);
		loginBtn.click();
		
	}
}
