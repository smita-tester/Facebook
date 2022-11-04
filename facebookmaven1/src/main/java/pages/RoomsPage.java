package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsPage {
	@FindBy(xpath="//a[text()=' Return to messenger.com ']")
	private WebElement returnbutton;
	
	@FindBy(xpath="//a[text()=' Visit our help center ']")
	private WebElement contactTohelpcenter;
	
	
	
	//constructor initialization
	public  RoomsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	 //methods -Actions on WebElement

	public void returnTomessenger()
	{
		returnbutton.click();
		
	}
	public void gobackTohelpcenter()
	{
		contactTohelpcenter.click();
		
	}
	

}
