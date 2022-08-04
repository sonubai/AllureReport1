package org.AttendanceSystem.objectRepository;

import org.Reports.genericUtility.WebdriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	/**
	 * This constructor is used to initialize elements everytime
	 * @param driver
	 */
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class=\"class\"][2]") private WebElement clickonclass;
	@FindBy(xpath = "//button[@class=\"marker btn\"]") private WebElement absent;
	@FindBy(xpath = "//button[@class=\"marker btn btn-success\"]") private WebElement present;
	@FindBy(xpath = "//button[@id=\"submit\"]") private WebElement sendBtn;
	@FindBy(xpath = "//a[text()='Dashboard']") private WebElement dashBoard;
	
	
	@FindBy(xpath = "//a[text()='Student Dashboard']") private WebElement studentDashboard;
	@FindBy(xpath = "//select[@name=\"section\"]") private WebElement section;
	@FindBy(xpath = "//input[@name=\"code\"]") private WebElement code;
	@FindBy(xpath = "//input[@name=\"roll\"]") private WebElement roll;
	@FindBy(xpath = "//button[text()='Get Results']") private WebElement getresults;
	@FindBy(xpath = "(//div[@class=\"container\"])[2]") private WebElement verify;
	
	
	//business library
	/**
	 * This method is used to mouse over element action
	 * @param webdriverUtility
	 */
	public void ClickOnClass(WebdriverUtility webdriverUtility)
	{
		clickonclass.click();
		absent.click();
		webdriverUtility.mouseOverElement(dashBoard);
		sendBtn.click();
		dashBoard.click();
	}
	
	
	/**
	 * This method is used handle dropdown action
	 * @param webdriverUtility
	 * @param Section
	 * @param Code
	 * @param Roll
	 */
	public void Studentdashboard(WebdriverUtility webdriverUtility, String Section, String Code, String Roll)
	{
		studentDashboard.click();
		webdriverUtility.handleSelectDropdown(section, Section);
		code.sendKeys(Code);
		roll.sendKeys(Roll);
		getresults.click();
	
	}
	
	/**
	 * This method is used to take screenshot
	 * @param webdriverUtility
	 */
	public void takeSnap(WebdriverUtility webdriverUtility)
	{
		webdriverUtility.takesScreenShotElement(verify);
	}
	

}
