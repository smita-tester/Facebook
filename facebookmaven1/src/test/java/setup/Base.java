package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	//browser related code
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\smita11\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver","E:\\smita11\\selenium1\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	/*public static WebDriver openOperaBrowser()
	{
		System.setProperty("webdriver.opera.driver","E:\\smita11\\opera11\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		return driver;
	}*/
	

}

