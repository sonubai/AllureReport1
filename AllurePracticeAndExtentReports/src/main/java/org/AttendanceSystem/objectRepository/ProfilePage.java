package org.AttendanceSystem.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	/**
	 * This constructor is used to initialize elements everytime
	 * @param driver
	 */
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Profile']") private WebElement profile;
	@FindBy(xpath = "//div[@class=\"input-group\"]//input[@value=\"Smruti\"]") private WebElement name;
	@FindBy(xpath = "//input[@name=\"phone\"]") private WebElement phone;
	@FindBy(xpath = "//input[@name=\"email\"]") private WebElement email;
	
	// business library
	
	/**
	 * This method is used to click on profile
	 */
	public void clickProfile() {
		profile.click();
	}
	
	/**
	 * These methods is used to validate information
	 * @return
	 */
	public String validateName()
	{
		return name.getAttribute("value");
	}
	
	public String validatePhone()
	{
		return phone.getAttribute("value");
	}
	public String validateEmail()
	{
		return email.getAttribute("value");
	}

}
