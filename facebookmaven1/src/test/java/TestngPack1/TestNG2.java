package TestngPack1;

//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
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
	@Test (priority=1,invocationCount=2)
	public void testA()
	{
		System.out.println("test1");
	}
	@Test (priority=-1)
	public void test2()
	{
		System.out.println("test2");
		//Assert.fail();
	}
	@Test (priority=0)
	public void test3()
	{
		System.out.println("test3");
	}
	@Test (priority=3,dependsOnMethods="test2")
	public void testB()
	{
		System.out.println("test4");
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
