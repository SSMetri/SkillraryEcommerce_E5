package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
	//DECLERATION
	//Address pf course
	@FindBy(id="course")
	private WebElement coursetab;
	
	//Address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//Address of dropdown
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	//INITIALIZATION
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//UTILIZATION
	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void seleniumtrainingtab() 
	{
		seleniumtraining.click();
	}
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	
	
	
	

}
