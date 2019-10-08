package DifferentCommand;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandelCheckBoxAndRadioButton {
	WebDriver driver;
	
	@Test
	public void RadioButton() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://demo.guru99.com/test/radio.html");
		System.out.println(driver.findElement(By.xpath("//*[@id='vfb-7-1']")).getText());
		List<WebElement> buttonList=driver.findElements(By.name("webform"));
		System.out.println(buttonList.size());
		for (int i = 0; i < buttonList.size(); i++) {
			buttonList.get(i).click();
			//System.out.println(buttonList.get(i).getText());
		}
		driver.close();
	}

}
