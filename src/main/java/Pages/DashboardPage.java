package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genercis.BasePage;

public class DashboardPage extends BasePage
{
	public DashboardPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	//a[.='Dashboard']
	@FindBy(xpath="//a[.='Dashboard']")
	private WebElement dashboardbtn;
	public boolean checkdashboardbtn()
	{
		if(dashboardbtn.isDisplayed())
			return true;
		else 
			return false;
	}

}
