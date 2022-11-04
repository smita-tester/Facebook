package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessangerPage {
	//variable -WebElement
		@FindBy(xpath="//a[text()='Rooms']")
		private WebElement rooms;
		
		@FindBy(xpath="//a[text()='Features']")
		private WebElement features;
		
		@FindBy(xpath="//a[text()='Desktop app']")
		private WebElement desktopapp;
		
		//constructor initialization
		public MessangerPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		 //methods -Actions on WebElement
		public void ClickonRoomstab()
		{
		  rooms.click();
		}
		public void clickonFeaturesTab()
		{
			features.click();
			
		}
		public void clickondesktopApptab()
		{
			desktopapp.click();
			
		}
		
		
		
		
		

}
//a[text()='Rooms']
//a[text()='Features']
//a[text()='Desktop app']