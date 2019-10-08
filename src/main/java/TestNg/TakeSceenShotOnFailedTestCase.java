package TestNg;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;
@Listeners(CustomListner.class)
public class TakeSceenShotOnFailedTestCase extends BaseClass  {
	public WebDriver driver;
	@BeforeMethod
	public void Setup() {
		initialization();
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	@Test
	public void loginTest() {
		System.out.println("public void Test case statted");
		Assert.assertEquals(false, true);
	}
	
}
