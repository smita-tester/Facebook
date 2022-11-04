package TestngPack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println(" before suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println(" before test");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println(" before class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@AfterMethod
	public void aftermethod()
	{
	
	  System.out.println("after method");
    }
	
	@AfterClass
	public void afterclass()
	{
	
		System.out.println("after class");
    }
	@AfterTest
	public void aftertest()
	{
		System.out.println(" after test");
	}
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println(" After suite");
	}
	
}
	
