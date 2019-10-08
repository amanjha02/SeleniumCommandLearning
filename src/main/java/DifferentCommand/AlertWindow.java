package DifferentCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertWindow {
	WebDriver driver;
	@Test
	public void Alerthandel() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		System.out.println(driver.getWindowHandle());
		driver.get("http://demo.guru99.com/popup.php");
		System.out.println(driver.getWindowHandle());
		/*driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("539220");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		try {
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}*/
	}
	Alert alt;
	

}
