package mavenpack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Loginpage;
import pages.MessangerPage;
import pages.RoomsPage;

public class VeryfycontactTohelpcenter {
	public static void main(String[] args)
	{		
			System.setProperty("webdriver.chrome.driver", "E:\\smita\\chromedriver_win32 (2)\\chromedriver.exe");
			 
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			//Thread.sleep(3000);
			Loginpage loginpage=new Loginpage(driver);
			loginpage.openmessangerpage();
			
			MessangerPage messengerpage=new MessangerPage(driver);
			messengerpage.ClickonRoomstab();
			
			RoomsPage roomspage1=new RoomsPage(driver);
			roomspage1.gobackTohelpcenter();
			
		String urt=	driver.getCurrentUrl();
		String title=driver.getTitle();
		if(urt.equals("https://www.messenger.com/help")&&title.equals("Messenger Help Centre"))
      {
			System.out.println("PASSED");
      }
		else
		{
			System.out.println("FAILED");
		}
		
		
      }

}
