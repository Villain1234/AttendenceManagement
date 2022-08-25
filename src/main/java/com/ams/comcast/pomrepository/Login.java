package com.ams.comcast.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
public 	WebDriver driver;

	public Login(WebDriver driver) {
		
	    PageFactory.initElements(driver, this);
	    this.driver=driver;
	}
	@FindBy(xpath = "//form[@id='login']/descendant::input[@type='email' and  @class='form-control']")
	private WebElement userNameEdit;
	@FindBy(xpath = "//form[@id='login']/descendant::input[@type='password' and  @class='form-control']")
	private WebElement userPwdEdit;
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement LoginBtn;
	
	public WebElement getUserNameEdit() {
		return userNameEdit;
	}
	public WebElement getUserPwdEdit() {
		return userPwdEdit;
	}
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public void LoginToApp (String userName , String password){
		userNameEdit.sendKeys(userName);
		userPwdEdit.sendKeys(password);
		LoginBtn.click();
		
	}
	
	

}
