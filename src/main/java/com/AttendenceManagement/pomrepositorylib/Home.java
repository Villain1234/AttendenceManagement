package com.AttendenceManagement.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home
{
	WebDriver driver; // global driver variable
	public Home(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(linkText = "Dashboard")
	private WebElement dashboardLink;
	
	@FindBy(linkText = "Profile")
	private WebElement profileLink;
	
	@FindBy(linkText = "Statistics")
	private WebElement statisticsLink;
	
	@FindBy(linkText = "About")
	private WebElement aboutLink;
	
	@FindBy(linkText = "Contact")
	private WebElement contactLink;
	
	//@FindBy(linkText = "Logout")
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getProfileLink() {
		return profileLink;
	}

	public WebElement getStatisticsLink() {
		return statisticsLink; 
	}

	public WebElement getAboutLink() {
		return aboutLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public void logout() {
		logoutLink.click();
	}
}
