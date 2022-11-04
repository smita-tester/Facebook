package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class SignupPopup {
	//variable -WebElement
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstName;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastName;
		
		@FindBy(xpath="(//input[@type='text'])[4]")
		private WebElement mobileno;
		
		
		@FindBy(xpath="(//input[@type='password'])[2]")
		private WebElement password1;
		
		@FindBy(xpath="//select[@name='birthday_day']")
		private WebElement day;
		
		@FindBy(xpath="//select[@id='month']")
		private WebElement month;
		
		
		@FindBy(xpath="//select[@name='birthday_year']")
		private WebElement year;
		
		//@FindBy(xpath="(//label[@class='_58mt'])[2]")
		//private WebElement male;
		
		@FindBy(xpath="(//label[@class='_58mt'])[1]")
		private WebElement female;
		
		
		@FindBy(xpath="//button[@name='websubmit']")
		private WebElement signup;
		
		
		//constructor initialization
		public SignupPopup(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	   //methods -Actions on WebElement
		public void sendfirstName()
		{
			firstName.sendKeys("sunanda");
		}
		public void sendlastName()
		{
			lastName.sendKeys("patil");
		}
	
		public void sendmobileno()
		{
			mobileno.sendKeys("8378977104");
		}
	
		public void sendpassword()
		{
			password1.sendKeys("Sunanda@99");
		}
	
		public void sendday()
		{
			//Select s=new Select(day);
		   // s.selectByValue("26");
		    day.sendKeys("26");
		}
	
		public void sendmonth()
		{
			// Select s1=new Select(month);
			 //  s1.selectByIndex(5);
			month.sendKeys("5");
		}
	
		public void sendyear()
		{
			// Select s2=new Select(year);
			    //s2.selectByValue("1990");
			
			year.sendKeys("1988");
		}
		public void selectfemaleradiobutton()
		{
			
			   female.click();
		}
		
		public void clicksignupbutton()
		{
			
			   signup.click();
		}
		
}
