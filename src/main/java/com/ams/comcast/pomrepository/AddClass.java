package com.ams.comcast.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddClass {
 public	WebDriver driver;

	public AddClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(name="year") , @FindBy(xpath = "//select[@class='form-control' and @name='year']" )})
	private WebElement yearListEdit;
	@FindAll({@FindBy(name="code") ,  @FindBy(xpath = "//input[@class='form-control' and @name='code']")})
	private WebElement codeTextEdit;
	@FindAll({@FindBy(name = "section") , @FindBy(xpath = "//select[@class='form-control' and @name='section']")})
	private WebElement chooseSectionEdit;
	@FindAll({@FindBy(name = "semester") , @FindBy(xpath = "//select[@class='form-control' and @name='semester']")})
	private WebElement chooseSemesterEdit;
	@FindAll ({@FindBy(name = "start") , @FindBy(xpath = "//input[@class='form-control' and @name='start']")})
	private WebElement startRollNumEdit;
	@FindAll({@FindBy(name = "end") , @FindBy(xpath = "//input[@class='form-control' and @name='end']")})
	private WebElement endRollNumEdit;
	@FindAll({@FindBy(xpath = "//button[text()=\"Add Class\"]") , @FindBy( id = "add") })
	private WebElement addBtn;
	@FindAll({@FindBy(id = "cancel") , @FindBy(xpath = "//button[text()=\"Cancel\" and @class='btn']")})
	private WebElement cancleBtn;



	public WebElement getYearListEdit() {
		return yearListEdit;
	}
	public WebElement getCodeTextEdit() {
		return codeTextEdit;
	}
	public WebElement getChooseSectionEdit() {
		return chooseSectionEdit;
	}
	public WebElement getChooseSemesterEdit() {
		return chooseSemesterEdit;
	}
	public WebElement getStartRollNumEdit() {
		return startRollNumEdit;
	}
	public WebElement getEndRollNumEdit() {
		return endRollNumEdit;
	}


	public WebElement getAddBtn() {
		return addBtn;
	}
	public WebElement getCancleBtn() {
		return cancleBtn;
	}	

	
	public void SelectYearListByIndx(int index) {
	Select s=new Select(yearListEdit);
	s.selectByIndex(index);
	}
	public void EnterCode(String code) throws InterruptedException {
	codeTextEdit.sendKeys(code);
	Thread.sleep(500);
	}
	public void ChooseSectionByIndex(int index){
	Select sel=new Select(chooseSectionEdit);
	sel.selectByIndex(index);}
	public void ChooseSemesterByIndex(int index) {
	Select select=new Select(chooseSemesterEdit);
	select.selectByIndex(index);
	}
	public void EnterStartingRollNum(String startRollNum) {
	startRollNumEdit.sendKeys(startRollNum);
	}
	public void EnterEndingRollNum(String endRollNum) {
	endRollNumEdit.sendKeys(endRollNum);
	}
	public void ClickOnAddClassBtn() {
		Actions act= new Actions(driver);
    act.moveToElement(addBtn).click();
	}
	
	public void AddNewClass(String code , String startRollNum , String endRollNum) {

		Select s=new Select(yearListEdit);
		s.selectByIndex(2);

		codeTextEdit.sendKeys(code);

		Select sel=new Select(chooseSectionEdit);
		sel.selectByIndex(2);

		Select select=new Select(chooseSemesterEdit);
		select.selectByIndex(2);
		
		startRollNumEdit.sendKeys(startRollNum);
		
		endRollNumEdit.sendKeys(endRollNum);
		
		addBtn.click();

	}

}
