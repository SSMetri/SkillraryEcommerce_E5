package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	//DECLERATION
	//Address of selenium traing image
	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumTraing;
	
	//Address of cart 
	@FindBy(id="cartArea")
	private WebElement carttab;
		
	//Address of facebook
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	//INITIALIZATION
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//UTILIZATION
	public WebElement getSeleniumTraing() {
		return seleniumTraing;
	}

	public WebElement getCarttab() {
		return carttab;
	}
	
	public void facebookIcon()
	{
		facebook.click();
	}
	
	

}
