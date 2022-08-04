package org.AttendanceSystem.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupAndLoginPage {
	
	/**
	 * This constructor is used to initialize elements everytime
	 * @param driver
	 */
	public SignupAndLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Name\"]") private WebElement signupName;
	@FindBy(xpath = "//input[@placeholder=\"Phone\"]") private WebElement signupPhone;
	@FindBy(xpath = "//input[@placeholder=\"Email\"]/ancestor::form[@id=\"signup\"]/div[3]/input") private WebElement signupEmailId;
	@FindBy(xpath = "//input[@placeholder=\"Password\"]/ancestor::form[@id=\"signup\"]/div[4]/input") private WebElement signupPassword;
	@FindBy(xpath = "//input[@placeholder=\"Password\"]/ancestor::form[@id=\"signup\"]/div[5]/input") private WebElement signupRetypePassword;
	@FindBy(xpath = "//button[text()='Sign Up']") private WebElement signup;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Email\"]/ancestor::form[@id=\"login\"]/div[1]/input") private WebElement loginemail;
	@FindBy(xpath = "//input[@placeholder=\"Password\"]/ancestor::form[@id=\"login\"]/div[2]/input") private WebElement loginpass;
	@FindBy(xpath = "//button[text()='Login']") private WebElement login;
	
	
	//business library
	/**
	 * This method is used to provide datas for signUp process
	 * @param name
	 * @param phone
	 * @param email
	 * @param password
	 * @param retyppassword
	 */
	
	public void Signup(String name,String phone, String email, String password, String retyppassword) {
		
		signupName.sendKeys(name);
		signupPhone.sendKeys(phone);
		signupEmailId.sendKeys(email);
		signupPassword.sendKeys(password);
		signupRetypePassword.sendKeys(retyppassword);
		signup.click();
		
	}
	
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
}
