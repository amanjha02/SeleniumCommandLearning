package DifferentCommand;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	@Test
	public void OpenTwotab() throws AWTException {
	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
        String parent = driver.getWindowHandle();

        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        

        Set<String> browsers = driver.getWindowHandles();
        for (String i : browsers) {
            if (!i.equals(parent)) {
                driver.switchTo().window(i);
                driver.get("http://www.gmail.com");
            }
        }
        
        
		/*driver.get("http://demo.guru99.com/test/delete_customer.php");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+ "t");
		driver.get("http://gmail.com"); 
		System.out.println(driver.getWindowHandle());*/
		
	}
	

}
