package org.Reports.genericUtility;


import org.AttendanceSystem.objectRepository.AddClassPage;
import org.AttendanceSystem.objectRepository.CommonPage;
import org.AttendanceSystem.objectRepository.DashboardPage;
import org.AttendanceSystem.objectRepository.ProfilePage;
import org.AttendanceSystem.objectRepository.SignupAndLoginPage;
import org.openqa.selenium.WebDriver;


public class InstanceClass {
	public WebdriverUtility webdriverutility;
	public FilePathUtiltity fileutility;
	public ExcelUtility excelutility;
	public JavaUtility javautility;
	public String browser;
	public String url;
	public String timeout;
	protected String emailid;
	protected String password;
	public int randomNumber;
	public int randomNumber1;
	
	long time;
	protected CommonPage commonPage;
	protected SignupAndLoginPage signupAndLoginPage;
	protected ProfilePage profilePage;
	protected AddClassPage addClassPage;
	protected DashboardPage dashboardPage;
	
	public WebDriver driver;

}
