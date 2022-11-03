package com.ams.comcast.pomrepository;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teacher_Dashboard {
	public WebDriver driver;

	public Teacher_Dashboard(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindAll({@FindBy(id = "addClass") , @FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")})
	private WebElement addClassBtn;
	@FindAll({@FindBy(linkText = "Profile") , @FindBy(xpath = "//a[@href='profile.php']")})
	private WebElement profileBtn;
	@FindAll({@FindBy(linkText = "Statistics") , @FindBy(xpath = "//a[@href='statistics.php']")})
	private WebElement statisticsBtn;
	@FindAll({@FindBy(linkText = "Logout") , @FindBy(xpath = "//a[@href='logout.php']")})
	private WebElement LogoutBtn;
	
	@FindBy(xpath = "//span[@class='code']")
	private WebElement actualCodeTextLoc;
	


	public WebElement getAddClassImg() {
		return addClassBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProfileBtn() {
		return profileBtn;
	}

	public WebElement getStatisticsBtn() {
		return statisticsBtn;
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}
	public WebElement getactualCodeTextLoc() {
		return actualCodeTextLoc;
	}

	public void ClickOnLogin(){
		Actions act= new Actions(driver);
		act.moveToElement(LogoutBtn).perform();
		LogoutBtn.click();
	}

	public void ClickOnProfile(){
		Actions act= new Actions(driver);
		act.moveToElement(profileBtn).perform();
		profileBtn.click();
	}

	public void ClickOnStatistics(){
		Actions act= new Actions(driver);
		act.moveToElement(statisticsBtn).perform();
		statisticsBtn.click();
	}


	public void ClickOnLogout(){
		Actions act= new Actions(driver);
		act.moveToElement(LogoutBtn).perform();
		LogoutBtn.click();
	}
	public String actualCodeText() {
		
		String	text=actualCodeTextLoc.getText();
		
		return text;
	}

}
