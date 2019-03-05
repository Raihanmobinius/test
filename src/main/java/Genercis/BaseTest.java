package Genercis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		
	    

		
	}
	
	  @AfterMethod
	   public void afterClass() 
	  {
	      System.out.println("in afterClass");
	      //Closing the browser
		    driver.quit();
	   }

}
