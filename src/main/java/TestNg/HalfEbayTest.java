package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HalfEbayTest {
	WebDriver driver;
	@BeforeMethod
	public void SetrupMethod() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.MILLISECONDS);
		driver.get("http://www.google.com");
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();	
	}

}
