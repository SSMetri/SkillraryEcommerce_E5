package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
	//Decleration
	//Address of gears web element
	@FindBy(xpath="//a[contains(text(),'GEARS')]")
	private WebElement gearbtn;
	
	//Address of skillrary demo
	@FindBy(xpath="(//a[contains(text(),' SkillRary Demo APP')])[2]")
	private WebElement skillrarydemoapp;
	
	//Address of search text field
	@FindBy(name="q")
	private WebElement searchtb;
	
	//Address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//INITIALIZATION
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//UTILIZATION
	public void gearsbutton()
	{
		gearbtn.click();
	}
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name)
	{
		searchtb.sendKeys(name);
	}
	public void gobutton()
	{
		searchbtn.click();;
	}

}
