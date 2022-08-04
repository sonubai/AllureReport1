package org.Reports.genericUtility;

import org.AttendanceSystem.objectRepository.AddClassPage;
import org.AttendanceSystem.objectRepository.CommonPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseClass extends InstanceClass{
	String code;
	String startingRoll;
	String endingRoll;
	String year;
	String section;
	String semester;

	public static WebDriver listenerdriver;

	@BeforeSuite
	public void suiteSetup() {

	}		

	@BeforeClass
	public void classSetup() {
		//Creating objects for GenericUtility
		fileutility= new FilePathUtiltity();
		excelutility = new ExcelUtility();
		javautility= new JavaUtility();
		webdriverutility= new WebdriverUtility();

		//Initialize data from Property file
		fileutility.intializePropetiesFile(IpathConstants.ATTENDANCEPROPERTIYFILE);

		//Get the control for particular sheet in excel
		excelutility.initializeExcelFile(IpathConstants.ATTENDANCEXCELFILE);

		//Fetch the data from Property file
		url=fileutility.getDataFromProperty("url");
		emailid=fileutility.getDataFromProperty("emailid");
		password=fileutility.getDataFromProperty("password");
		browser=fileutility.getDataFromProperty("browser");
		timeout=fileutility.getDataFromProperty("timeouts");

		//covert string to long
		time=javautility.convertStringToLong(timeout);
		//run time polymorphism
		WebDriver driver=webdriverutility.Webdriversetupdriver(browser);
		listenerdriver=driver;

		//pre-setting for browser
		webdriverutility.maximizeBrowser();
		webdriverutility.implicitwait(time);

		//login to the app
		commonPage= new CommonPage(driver);
		addClassPage= new AddClassPage(driver);



		//creating object for Actions class
		webdriverutility.initializeActions();

		//navigate the application
		webdriverutility.enterUrl(url);

	}

	@BeforeMethod
	public void randomSetup()
	{
		//Generate the random number
		randomNumber= javautility.RandomNumber();
		randomNumber1=javautility.RandomNumber1();
		commonPage.Login(emailid, password);

	}

	@AfterMethod
	public void methodTearDown()
	{
		//Closing the workbook and driver
		commonPage.Logout();

	}

	@AfterClass
	public void classTearDown()
	{

		excelutility.closeExcelSheet();
		webdriverutility.closeBrowser();
	}
}
