package com.AttendenceManagement.pomrepositorylib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAttendanceDetailspage {
	WebDriver driver;
	public StudentAttendanceDetailspage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='form-control' and @name='roll' ]")
	private WebElement rollNumEtd;
	
	@FindBy(xpath = "//button[@class='btn btn-primary' ]")
	private WebElement getResultBtnEtd;

	public WebElement getRollNumEtd() {
		return rollNumEtd;
	}

	public WebElement getGetResultBtnEtd() {
		return getResultBtnEtd;
	}
	
	
	public void getResult(String rollNum)
	{
		Dashboardpage dp = new Dashboardpage(driver);
		dp.getClassEtd().click();
		System.out.println("done1");
		StudentListPage sp = new StudentListPage(driver);
		sp.getStudentEtd().click();
		System.out.println("done2");
		rollNumEtd.clear();
		rollNumEtd.sendKeys(rollNum);
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,3000)");
		getGetResultBtnEtd().click();
		System.out.println("done3");
		OnlineAttendancepage oap = new OnlineAttendancepage(driver);
		oap.getOnlineAttEdd().click();
		//oap.endClass();
		//driver.close();
		
		
		
	}
	

}
