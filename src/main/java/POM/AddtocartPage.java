package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage 
{
	//DECLERATION
	//Address of add to cart
	@FindBy(xpath="(//button[contains(text(),'Add to Cart')])[1]")
	private WebElement addtocart;
	
	//Address of + icon
	@FindBy(xpath="//button[@id='add']")
	private WebElement plusIcon;
	
	//INITIALIZATION
	public AddtocartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//UTILIZATION
	public void addtocartBtn() 
	{
		addtocart.click();
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}
	
}
