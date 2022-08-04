package KeyBoardDrivenTesting;

import java.time.Duration;

import org.Reports.genericUtility.ExcelUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KDTexample  {
	
	@Test
	public void keyboarddrivenTestingExample() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888");
		ExcelUtility excelutility = new ExcelUtility();
		excelutility.initializeExcelFile("./src/test/resources/ExaminationSheet.xlsx");
		String[][] alldata = excelutility.getMultipleDataFromExcel("KDT");	
		for (int i = 0; i < alldata.length; i++) {
			String locatorName = alldata[i][2].split("###")[0];
			
			String locatorValue = alldata[i][2].split("###")[1];
			
			if(alldata[i][1].equals("send")) {
				driver.findElement(locatorSelection(locatorName, locatorValue)).sendKeys(alldata[i][3]);
			}
			else if(alldata[i][1].equals("click")) {
				driver.findElement(locatorSelection(locatorName, locatorValue)).click();
			}
		}
		driver.quit();
	
		
	}
	public By locatorSelection(String locatorName,String locatorValue)
	{
		By locator=null;
		if(locatorName.equalsIgnoreCase("id"))
		{
			locator=By.id(locatorValue);
		}
		else if(locatorName.equalsIgnoreCase("name"))
		{
			locator=By.name(locatorValue);
		}
		else if(locatorName.equalsIgnoreCase("xpath"))
		{
			locator=By.xpath(locatorValue);
		}
		else if(locatorName.equalsIgnoreCase("linkText"))
		{
			locator=By.linkText(locatorValue);
		}
		if(locator==null)
		{
			System.out.println("Specify proper locator name in Excel Sheet");
		}
		return locator;
	}
		

}
