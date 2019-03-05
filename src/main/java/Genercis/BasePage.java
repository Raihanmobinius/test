package Genercis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void verifyTitle(String etitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		String aTitlte=driver.getTitle();
		
		try
		{
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("Title is matching"+ etitle,true);
		}
		catch(Exception e)
		{
			
			Reporter.log("Title is not matching"+ etitle,true);
			Reporter.log("Actual title is " + aTitlte,true);
			Assert.fail();
		}
		//String actualGooglePageTitlte=driver.getTitle();
		
	}
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try 
		{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present:",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not present", true);
			Assert.fail();
		}
	}

}
