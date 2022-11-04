package TestngPack1;

import java.io.IOException;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Loginpage;
import pages.MessangerPage;
import pages.RoomsPage;
import setup.Base;
import utils.Utility;



public class VeryfyroomstestNG extends Base{
	//globaly referencevariable declared
	
	private WebDriver driver;
	private Loginpage loginpage;
	private MessangerPage messengerpage;
	private RoomsPage roomspage;
	private SoftAssert soft;
	private int testID ;
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
		
			driver=openChromeBrowser();
		}
		if(browserName.equals("Firefox"))
		{
		
		driver=openFirefoxBrowser();
		}
		if(browserName.equals("Opera"))
		{
		
		driver=openOperaBrowser();
		}
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		}
	@BeforeClass
	public void createPOMobjects()
	{
		System.out.println(" before class");
		//System.setProperty("webdriver.chrome.driver", "E:\\smita\\chromedriver_win32 (2)\\chromedriver.exe");
		 /*webdriver driver=new chromedriver;
		   here we copy webdriver driver declared globaly then write 
		   driver=new chomedriver only*/
		/*driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();*/
		 loginpage=new Loginpage(driver);
		 messengerpage=new MessangerPage(driver);
		 roomspage=new RoomsPage(driver);
	}
	@BeforeMethod
	public void openroomspage()
	{
		 System.out.println("before method");
		 driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		// loginpage=new Loginpage(driver);
		 loginpage.openmessangerpage();
		
	     //messengerpage=new MessangerPage(driver);
		 messengerpage.ClickonRoomstab();
		// roomspage=new RoomsPage(driver);
		 soft=new SoftAssert();
		
		
	}
	@Test (priority=1)
	public void Gotomessengertab()
	{
		
		System.out.println("test1");
		roomspage.returnTomessenger();
		
		String url=	driver.getCurrentUrl();
		String title=driver.getTitle();
		/*if(url.equals("https://www.messenger.com/")&&title.equals("Messenger"))
        {
			System.out.println("PASSED");
        }
		else
		{
			System.out.println("FAILED");
		}*/
		
		//Assert.assertEquals(url, "https://www.messenger.com/");
		//Assert.assertEquals(title, "Messenger");
		
		soft.assertEquals(url,"https://www.messenger.com/");
		soft.assertEquals(title,"Messenger");
		soft.assertAll();
	}
	@Test (priority=2)
	public void veryfycontactTohelpcenter () throws IOException 
	{
	
		testID=123;
		
		System.out.println("test2");
	
		roomspage.gobackTohelpcenter();
	
		String url=	driver.getCurrentUrl();
		String title=driver.getTitle();
		/*if(url.equals("https://www.messenger.com/help")&&title.equals("Messenger Help Centre"))
        {
			System.out.println("PASSED");
        }
		else
		{
			System.out.println("FAILED");
		}*/
		//Assert.assertEquals(url,"https://www.messenger.com/help");
		//Assert.assertEquals(title,"Messenger Help Centre");
	    // soft=new SoftAssert();
		soft.assertEquals(url,"https://www.messenger.com/help");
		soft.assertEquals(title,"Messenger Help Centre");
		soft.assertAll();
		
		//Utility.captureScreen(testID, driver);
		
	}
	@AfterMethod
	public void logoutFromapplication(ITestResult result) throws IOException
	{
	if(ITestResult.FAILURE==result.getStatus())
	{
		Utility.captureScreen(testID, driver);
	}
	System.out.println("after method");
	  System.out.println("Log out");
	}
	@AfterClass
	public void clearObject()
	{
	
		System.out.println("after class");
		 loginpage=null;
		 messengerpage=null;
		 roomspage=null;
		 
		 
    }
	@AfterTest
	public void closebrowser()
	{
	
		System.out.println("after test");
		driver.close();
		driver=null;
		//to remove delete all object without reference
		System.gc();
    }
	
	

}
