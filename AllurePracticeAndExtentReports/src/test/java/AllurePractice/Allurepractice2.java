package AllurePractice;

import org.Reports.genericUtility.JavaUtility;
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
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
@Listeners(org.Reports.genericUtility.AllureImplementation.class)
@Epic("Epic 1")
@Story("Story 1")
public class Allurepractice2 {
	//@Attachment(value="abc" , type="image/png")
	@Description("Description")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void AllureTest()
	{
		WebdriverUtility webdriverUtility= new WebdriverUtility();
		UtilityObjectClass.setWebdriverutility(webdriverUtility);
		UtilityObjectClass.setJavautility(new JavaUtility());
		WebDriverManager.edgedriver().setup();
		printStatement("Browser executable files initialized");
		WebDriver driver=new EdgeDriver();
		UtilityObjectClass.setDriver(driver);
		printStatement("Browser Launched successfully");
		driver.manage().window().maximize();
		printStatement("Browser maximised successfully");
		driver.get("https://google.com");
		printStatement("Application launched successfully");
		driver.findElement(By.name("q")).sendKeys("flipkart",Keys.ENTER);
		printStatement("Product searched successfully");
		//Assert.fail();
		printStatement("Application wait for 3 sec");
		driver.quit();
		printStatement("Browser closed successfully");
	}
	@Step("{str}")
public void printStatement(String str) {
	System.out.println(str);
}

}
