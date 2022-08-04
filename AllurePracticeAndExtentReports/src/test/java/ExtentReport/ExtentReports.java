package ExtentReport;

import org.Reports.genericUtility.JavaUtility;
import org.Reports.genericUtility.ListenerImplementation;
import org.Reports.genericUtility.UtilityObjectClass;
import org.Reports.genericUtility.WebdriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(org.Reports.genericUtility.ListenerImplementation.class)
public class ExtentReports {
	
	@Test
	public void extentreport() throws InterruptedException {
		WebdriverUtility webdriverUtility= new WebdriverUtility();
		UtilityObjectClass.setWebdriverutility(webdriverUtility);
		UtilityObjectClass.setJavautility(new JavaUtility());
		WebDriverManager.edgedriver().setup();
		ListenerImplementation.testLog.info("Browser executable files initialized");
		WebDriver driver=new EdgeDriver();
		UtilityObjectClass.setDriver(driver);
		ListenerImplementation.testLog.info("Browser Launched successfully");
		driver.manage().window().maximize();
		ListenerImplementation.testLog.info("Browser maximised successfully");
		driver.get("https://google.com");
		ListenerImplementation.testLog.info("Application launched successfully");
		driver.findElement(By.name("q")).sendKeys("flipkart",Keys.ENTER);
		ListenerImplementation.testLog.info("Product searched successfully");
		//Assert.fail();
		ListenerImplementation.testLog.info("Application wait for 3 sec");
		driver.quit();
		ListenerImplementation.testLog.info("Browser closed successfully");
		
		
	}
	

}
