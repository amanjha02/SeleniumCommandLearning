package DifferentCommand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LauchDifferentBrowser {
	public WebDriver driver;
	
	@Test
	public void launchChromeBrowser() {
		//System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser driver Window"+driver.getWindowHandle());
		driver.get("http://demo.guru99.com/test/ajax.html");
		//driver.findElement(By.name("n"));
	List<WebElement> list=driver.findElements(By.name("name"));
	for (WebElement liststname : list) {
		System.out.println(liststname.getAttribute("value"));
	}
	
	
		
	}
//	@Test
	public void launchFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Fire fox driver Window"+driver.getWindowHandle());
				driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
//	@Test
	public void InternetExplorerDriver() {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		System.out.println("Ie driver Window"+driver.getWindowHandle());
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
//	@AfterMethod
	public void closeBrowser() {
		System.out.println("Window is getting closed"+driver.getWindowHandle());
		driver.close();
	}
	

}
