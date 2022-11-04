package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//variable -WebElement
	@FindBy(xpath="//input[@id='email']")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='Messenger']")
	private WebElement messengerLink;
	
	//constructor initialization
	public Loginpage(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
   //methods -Actions on WebElement
	public void sendUserName()
	{
		UserName.sendKeys("8378977104");
		//UserName.sendKeys(exceldata);
		
	}
	public void sendpassword()
	{
		password.sendKeys("ayushsr@123");
	}
	public void ClickonLoginButton()
	{
		loginbutton.click();
	}
	public void openmessangerpage()
	{
		messengerLink.click();
	}
	//Group of actions
	public void loginToApplication()
	{
		UserName.sendKeys("8378977104");
		password.sendKeys("ayushsr@123");
		loginbutton.click();
		
		
	}
}
