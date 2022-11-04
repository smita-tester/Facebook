package Signup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.Loginpage2;
import module.SignupPopup;
import utils.Utility;

public class VerifySignup {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
			System.setProperty("webdriver.chrome.driver", "E:\\smita11\\chromedriver_win32 (3)\\chromedriver.exe");
			 
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			/*Loginpage2 login=new Loginpage2(driver);
			login.openCreatenewaccount();

			SignupPopup signup1=new SignupPopup(driver);
			signup1.clicksignupbutton();*/
			
			
			Loginpage2 username=new Loginpage2(driver);
			
		   String exceldata=Utility.getDataFromExcelSheet("facebook",2 ,0 );
			username.sendUserName(exceldata);
			

			Loginpage2 password=new Loginpage2(driver);
			exceldata=Utility.getDataFromExcelSheet("facebook",2 ,1 );
			password.sendpassword(exceldata);
			
			//Loginpage2 login1=new Loginpage2(driver);
			//login1.ClickonLoginButton();
			
			
			Loginpage2 createnew=new Loginpage2(driver);
			createnew.openCreatenewaccount();
			
			/*SignupPopup  fname=new SignupPopup(driver);
			fname.sendfirstName();
			SignupPopup  lname=new SignupPopup(driver);
			lname.sendlastName();
			SignupPopup  mobileno=new SignupPopup(driver);
			mobileno.sendmobileno();
			SignupPopup  pass=new SignupPopup(driver);
			pass.sendpassword();
			SignupPopup  day=new SignupPopup(driver);
			day.sendday();
			SignupPopup  month=new SignupPopup(driver);
			month.sendmonth();
			SignupPopup  year=new SignupPopup(driver);
			year.sendyear();
			
			SignupPopup  female=new SignupPopup(driver);
			female.selectfemaleradiobutton();
			SignupPopup  signup=new SignupPopup(driver);
			signup.clicksignupbutton();*/
			

			SignupPopup firstName=new SignupPopup(driver);
			firstName.sendfirstName();
			SignupPopup  lastName=new SignupPopup(driver);
			lastName.sendlastName();
			SignupPopup  mobileno=new SignupPopup(driver);
			mobileno.sendmobileno();
			SignupPopup  password1=new SignupPopup(driver);
			password1.sendpassword();
			SignupPopup  day=new SignupPopup(driver);
			day.sendday();
			SignupPopup  month=new SignupPopup(driver);
			month.sendmonth();
			SignupPopup  year=new SignupPopup(driver);
			year.sendyear();
			
			SignupPopup  female=new SignupPopup(driver);
			 female.selectfemaleradiobutton();
			SignupPopup signup=new SignupPopup(driver);
			 signup.clicksignupbutton();
			
			String url=	driver.getCurrentUrl();
			String title=driver.getTitle();
			System.out.println(url);
			System.out.println(title);
			if(url.equals("https://www.facebook.com/")&&title.equals("Facebook � log in or sign up"))
			{
			System.out.println("pass");
			}
			else
			{
			System.out.println("fail");
			}
 }
}



