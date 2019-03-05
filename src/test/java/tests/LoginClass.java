package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Genercis.AutoConstant;
import Genercis.genericUtils;
import Genercis.BaseTest;
import Genercis.ExcelData;
import Pages.DashboardPage;
import Pages.LoginPage;



public class LoginClass extends BaseTest
{
	
	
	 @Test (priority=1)
	 public void ValidLogin() throws InterruptedException 
	 {
		 System.out.println("in beforeClass");
		    
		    //Setting the webdriver.chrome.driver property to its executable's location
		    System.setProperty(Chrome_key, Chrome_value);

		    //Instantiating driver object
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			//driver.get("http://localhost/login.do");
		    driver.get(url);
		    
		    
		 System.out.println("in testcass");
		 String user=ExcelData.getData( "Sheet1", 1, 0);
		 String pass=ExcelData.getData( "Sheet1", 1, 1);
			//String loginTitle=ExcelData.getData( "Sheet1", 1, 2);
			//String EnterTimeTrackTitle=ExcelData.getData( "Sheet1", 1, 3);
		
		 LoginPage lp= new LoginPage(driver);
		 System.out.println(user+pass);
		 //Thread.sleep(10000);
		   lp.enterUserName("42053");
			//enter valid password
			Reporter.log("valid password"+pass, true);
			lp.enterPassword("rm123");
			//click onlog in
			DashboardPage dp=lp.clickOnLogin();
			//verify acttitime Enter time track page
			//lp.verifyPage(EnterTimeTrackTitle);
			//click on logout
			Assert.assertTrue(dp.checkdashboardbtn(), "Pass");
			//Assert.true();
	      
	      
	   }
	 @Test (priority=2)
	 public void InvalidLogin() throws InterruptedException 
	 {
		 System.out.println("in beforeClass");
		    
		   System.setProperty(Chrome_key, Chrome_value);
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			 driver.get(url);
		    
		    
		 System.out.println("in InvalidLogin testcase");
		
		 LoginPage lp= new LoginPage(driver);
		 //Thread.sleep(10000);
		   lp.enterUserName("420053");
			//enter valid password
			Reporter.log("invalid password", true);
			lp.enterPassword("rm123");
			//click onlog in
			lp.clickOnLogin();
			String filepath="./Screenshots/test.png";
			try {
				genericUtils.takeSnapShot(driver,filepath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(lp.checkLoginbtn());
			
			
			//Assert.assertTrue(dp.checkdashboardbtn(), "Pass");
			//Assert.true();
	      
	      
	   }

	 /*  // test case 2
	   @Test (priority=2)	
	   public void InvalidLogin() {
	      System.out.println("InvalidLogin");
	   }
	   
	   @Test (priority=3)	
	   public void NavigatetoEmployees() {
	      System.out.println("NavigatetoEmployees");
	   }
	   */
	   
	   /*

	   @BeforeMethod
	   public void beforeMethod() {
	      System.out.println("in beforeMethod");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod");
	   }

	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("in beforeSuite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("in afterSuite");
	   }
	   */

	 //Creating a driver object referencing WebDriver interface
 

}
