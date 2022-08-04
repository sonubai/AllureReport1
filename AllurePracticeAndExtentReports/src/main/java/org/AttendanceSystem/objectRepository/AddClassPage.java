package org.AttendanceSystem.objectRepository;

import org.Reports.genericUtility.WebdriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClassPage {
	/**
	 * This constructor is used to initialize elements everytime
	 * @param driver
	 */
	public AddClassPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-plus\"]") private WebElement AddIcon;
	
	
	@FindBy(xpath = "//select[@name=\"year\"]") private WebElement yearDropdown;
	@FindBy(xpath = "//input[@name=\"code\"]") private WebElement code;
	@FindBy(xpath = "//select[@name=\"section\"]") private WebElement Section;
	@FindBy(xpath = "//select[@name=\"semester\"]") private WebElement Semester;
	@FindBy(xpath = "//input[@name=\"start\"]") private WebElement StartingRollNumber;
	@FindBy(xpath = "//input[@name=\"end\"]") private WebElement EndingRollNumber;
	@FindBy(xpath = "//button[text()='Add Class']") private WebElement addClassBtn;
	
	@FindBy(xpath = "//span[@class=\"code\"]") private WebElement codeValidate;
	@FindBy(xpath = "//span[@class=\"section\"]") private WebElement sectionValidate;
	@FindBy(xpath = "//span[@class=\"year\"]") private WebElement yearValidate;
	
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
	
	
	
	//business library
	/**
	 * This method is used to add details inside addclass page
	 * @param webdriverUtility
	 * @param year
	 * @param text
	 * @param section
	 * @param semester
	 * @param startRollnumber
	 * @param endRollNumber
	 * @throws InterruptedException 
	 */
	public void AddClass(WebdriverUtility webdriverUtility,String year, String text,String section,String semester,String startRollnumber,String endRollNumber) throws InterruptedException
	{
		
		AddIcon.click();
		webdriverUtility.handleSelectDropdown(yearDropdown, year);
		code.sendKeys(text);
		webdriverUtility.handleSelectDropdown(Section, section);
		webdriverUtility.handleSelectDropdown(Semester, semester);
		StartingRollNumber.sendKeys(startRollnumber);
		EndingRollNumber.sendKeys(endRollNumber);
		addClassBtn.click();
		
	}
	
	/**
	 * This method is used to validate
	 * @return
	 */
	public String validateCode() {
		 return codeValidate.getText();
	}
	
	
	

}
