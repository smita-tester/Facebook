package TestngPack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import module.Loginpage2;
import module.SignupPopup;
import utils.Utility;

public class VeryfysignuptestNG {
	private WebDriver driver;
	private Loginpage2 username;
	private Loginpage2 createnew;
	private Loginpage2 password;
	/*private SignupPopup firstName;
	private SignupPopup  lastName;
	private SignupPopup  mobileno;
	private SignupPopup  password1;
	private SignupPopup  day;
	private SignupPopup  month;
	private SignupPopup  year;
	private SignupPopup female;
	private SignupPopup signup;*/
	private SignupPopup signupPopup;
	@BeforeClass
	public void beforeclass()
	{
		System.out.println(" before class");
		System.setProperty("webdriver.chrome.driver", "E:\\smita11\\chromedriver_win32 (3)\\chromedriver.exe");
		 
	    driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforemethod() throws EncryptedDocumentException, IOException
	{
		System.out.println("before method");
		driver.get("https://www.facebook.com/");
		username=new Loginpage2(driver);
		 String exceldata=Utility.getDataFromExcelSheet("facebook",2 ,0 );
		username.sendUserName(exceldata);
	    password=new Loginpage2(driver);
		exceldata=Utility.getDataFromExcelSheet("facebook",2 ,1 );
		password.sendpassword(exceldata);
		
		//Loginpage2 login1=new Loginpage2(driver);
		//login1.ClickonLoginButton();
		
		
		 createnew=new Loginpage2(driver);
		
		
	}
	@Test
	public void test()
	{
		 System.out.println("test");
		 System.out.println("facebook signup");
		createnew.openCreatenewaccount();
		
		signupPopup=new SignupPopup(driver);
		signupPopup.sendfirstName();
		signupPopup.sendlastName();
		signupPopup.sendmobileno();
		signupPopup.sendpassword();
		signupPopup.sendday();
		signupPopup.sendpassword();
		signupPopup.sendyear();
		signupPopup.selectfemaleradiobutton();
		signupPopup.clicksignupbutton();
		
		/*firstName.sendfirstName();
	    lastName=new SignupPopup(driver);
		lastName.sendlastName();
	    mobileno=new SignupPopup(driver);
		mobileno.sendmobileno();
	    password1=new SignupPopup(driver);
		password1.sendpassword();
	    day=new SignupPopup(driver);
		day.sendday();
	    month=new SignupPopup(driver);
		month.sendmonth();
	    year=new SignupPopup(dr.iver);
		year.sendyear();
		
		 female=new SignupPopup(driver);
		 female.selectfemaleradiobutton();
		 SignupPopup signup=new SignupPopup(driver);*/
		// signup.clicksignupbutton();
		 System.out.println("test");
		
		
		String url=	driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		/*if(url.equals("https://www.facebook.com")&&title.equals("Facebook-log in or sign up"))
		{
		System.out.println("fail");
		}
		else
		{
		System.out.println("pass");
		}*/
		Assert.assertEquals(url, "https://www.facebook.com/");
		Assert.assertNotEquals(title, "Facebook � log in or sign up");
		
	}
	
	@AfterMethod
	public void logout()
	{
	
	  System.out.println("after method");
	  System.out.println("log out");
    }
	
	@AfterClass
	public void closebrowser()
	{
	
		System.out.println("after class");
		driver.close();
    }
	
	

}
