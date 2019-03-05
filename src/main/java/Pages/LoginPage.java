package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genercis.BasePage;

public class LoginPage extends BasePage
{
	//declartion

		public LoginPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
		/*public loginpage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
			
		}*/
		@FindBy(name="username")
		private WebElement usernameTB;
		@FindBy(name="password")
		private WebElement passwordTB;
		@FindBy(name="button")
		private WebElement loginBTN;
		
		/*@FindBy(xpath="//span[contains(.,' invalid')]")
		private WebElement errorMSG;
		@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
		private WebElement version;
		*/
		//initialization
		
		// utilize
		public void verifyPage(String etitle)
		{
			verifyTitle(etitle);
		}
		public void enterUserName(String un) 
		{
		usernameTB.sendKeys(un);	
		}
		public void enterPassword(String pw)
		{
			passwordTB.sendKeys(pw);
		}
		/*
		public String verifyErrorMessage()
		{
			verifyElement(errorMSG);
		String aErrorMessage = errorMSG.getText();
		return aErrorMessage;	
		}
		
		public String verifyVersion()
		{
			verifyElement(version);
			String aVersion = version.getText();
			return aVersion;
		}*/
		public DashboardPage clickOnLogin() 
		{
		loginBTN.click();	
		return new DashboardPage(driver);
		}
		
		public boolean checkLoginbtn()
		{
			if(loginBTN.isDisplayed())
			return true;
			else 
				return false;
		}

}
