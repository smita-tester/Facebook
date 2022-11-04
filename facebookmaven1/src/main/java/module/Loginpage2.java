package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
	//variable -WebElement
		@FindBy(xpath="//input[@id='email']")
		private WebElement UserName;
		
		@FindBy(xpath="//input[@name='pass']")
		private WebElement password;
		
	//@FindBy(xpath="//button[text()='Log in']")
		//private WebElement loginbutton;
		
		@FindBy(xpath="//a[text()='Create New Account']")
		private WebElement Createnewaccount ;
		
		//constructor initialization
		public Loginpage2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	   //methods -Actions on WebElement
		public void sendUserName(String exceldata)
		{
			
			//UserName.sendKeys("sunanda");
			UserName.sendKeys(exceldata);
		}
		public void sendpassword(String exceldata)
		{
			
			//password.sendKeys("Sunanda@99");
			password.sendKeys(exceldata);
			
		}
		/*public void ClickonLoginButton()
		{
			loginbutton.click();
		}*/
		
		public void openCreatenewaccount()
		{
			Createnewaccount.click(); 
		}
		//Group of actions
		public void loginToApplication()
		{
			UserName.sendKeys("sunanda");
			password.sendKeys("Sunanda@99");
			//loginbutton.click();
			Createnewaccount.click();
			
			
		}
	}


