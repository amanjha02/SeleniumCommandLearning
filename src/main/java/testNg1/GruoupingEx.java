package testNg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GruoupingEx {
	WebDriver driver;
	//@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://www.google.com");
	}
	@Test(priority = 1,groups = "title")
	public void testGetTitle() {
		System.out.println(driver.getTitle());
	}
	@Test(priority = 2,groups = "pageURL")
	public void testGetPageURL() {
		System.out.println(driver.getCurrentUrl());
	}
	@Test(priority = 3,groups = "Logo")
	public void TestLogo() {
		System.out.println("TestLogo");
	}
	@Test(priority = 1,groups = "Test")
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(priority = 1,groups = "Test")
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(priority = 1,groups = "Test")
	public void Test3() {
		System.out.println("Test3");
	}
	
	
	//@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
