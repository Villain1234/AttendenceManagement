package com.AttendenceManagement.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AttendenceManagement.genericutility.WebDriverUtility;

public class CreateNewClass extends WebDriverUtility
{
   public CreateNewClass(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//select[@name='year']")
   private WebElement yearEtd;
   
   @FindBy(xpath = "//input[@class='form-control' and @name='code']")
   private WebElement classCodeEtd;
   
   @FindBy(xpath = "//select[@name='section']")
   private WebElement sectionEtd;
   
   @FindBy(xpath = "//select[@name='semester']")
   private WebElement semesterEtd;
   
   @FindBy(name = "start")
   private WebElement startRollNumEtd;
   
   @FindBy(xpath = "//input[@name='end']")
   private WebElement endRollNumEtd;
   
   @FindBy(xpath = "//button[text()='Add Class']")
   private WebElement addClassBtnEtd;
  
   @FindBy(xpath = "//div[@class='class' and @style='display: block;']/descendant::span[@class='code']")
   private WebElement codeEtd;
   
   @FindBy(xpath = "//div[@class='class' and @style='display: block;']/descendant::span[@class='section']")
   private WebElement sectionClsEtd;
   
   @FindBy(xpath = "//div[@class='class' and @style='display: block;']/descendant::span[@class='year']")
   private WebElement clsYearEtd;
   
   

public WebElement getCodeEtd() {
	return codeEtd;
}

public WebElement getSectionClsEtd() {
	return sectionClsEtd;
}

public WebElement getClsYearEtd() {
	return clsYearEtd;
}

public WebElement getYearEtd() {
	return yearEtd;
}

public WebElement getClassCodeEtd() {
	return classCodeEtd;
}

public WebElement getSectionEtd() {
	return sectionEtd;
}

public WebElement getSemesterEtd() {
	return semesterEtd;
}

public WebElement getStartRollNumEtd() {
	return startRollNumEtd;
}

public WebElement getEndRollNumEtd() {
	return endRollNumEtd;
}

public WebElement getAddClassBtnEtd() {
	return addClassBtnEtd;
}


   public void creatClass(String classCode,String startRollNum,String endRollNum, String year,String section,String semester)
   {
	   select(yearEtd, year);
	   classCodeEtd.sendKeys(classCode);
	   select(sectionEtd, section);
	   select(semesterEtd, semester);
	   startRollNumEtd.sendKeys(startRollNum);
	   endRollNumEtd.sendKeys(endRollNum);
	   addClassBtnEtd.click();
   }
   
   
}
