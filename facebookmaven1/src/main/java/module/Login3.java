package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login3 {
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbutton;
	
	//constructor initialization
	public Login3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	public void sendUserName()
	{
		
		UserName.sendKeys("krishna");
	}
	public void sendpassword()
	{
		password.sendKeys("krishna@99");
	}
	public void ClickonLoginButton()
	{
		loginbutton.click();
	}
	//Group of actions
			public void loginToApplication()
			{
				UserName.sendKeys("krishna");
				password.sendKeys("krishna@99");
				loginbutton.click();
				
			}
			
}
