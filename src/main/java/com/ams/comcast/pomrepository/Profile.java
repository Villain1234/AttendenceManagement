package com.ams.comcast.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	
	public WebDriver driver;

	public Profile(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath = "//dl[@class='dl-horizontal']/descendant::dd[4]")//==//dt[text()='Classes : ']/following-sibling::dd/text()
	private WebElement ClassesCount;
	@FindAll({@FindBy(linkText = "Dashboard") , @FindBy(xpath = "//a[@href='teacher.php']")})
	private WebElement DashBoardBtn;
	
	public WebElement getClassesCount() {
		return ClassesCount;
	}
	public WebElement getDashBoardBtn() {
		return DashBoardBtn;
	}
	
	
	
}
