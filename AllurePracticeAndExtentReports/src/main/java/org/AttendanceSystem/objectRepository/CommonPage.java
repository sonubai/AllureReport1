package org.AttendanceSystem.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	/**
	 * This constructor is used to initialize elements everytime
	 * @param driver
	 */
	public CommonPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Email\"]/ancestor::form[@id=\"login\"]/div[1]/input") private WebElement loginemail;
	@FindBy(xpath = "//input[@placeholder=\"Password\"]/ancestor::form[@id=\"login\"]/div[2]/input") private WebElement loginpass;
	@FindBy(xpath = "//button[text()='Login']") private WebElement login;
	
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
	
	WebDriver driver;
	//business library
	/**
	 * This method is used to perform login action
	 * @param email
	 * @param password
	 */
	public void Login(String email, String password) {
		loginemail.sendKeys(email);
		loginpass.sendKeys(password);
		login.click();
		
		
	}
	public void Login1(String email, String password) {
		loginemail.sendKeys(email);
		loginpass.sendKeys(password);
		login.click();
		
		
	}
	
	/**
	 * This method is used to perform logout action
	 */
	public void Logout()
	{
		logout.click();
	}
	
	

}
