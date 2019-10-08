package DifferentCommand;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class handelDropDownValue {
	@Test
	
	public void handelDropDown() {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement countryDropDown=driver.findElement(By.name("country"));
		 Select countrySelect=new Select(countryDropDown);
		 List<WebElement> AllcountryList=	countrySelect.getOptions();
		 System.out.println(AllcountryList.size());
		 for (WebElement element : AllcountryList) {
			 System.out.println(element.getText());
			
			// countrySelect.selectByVisibleText(element.getText());
			
		}
		 WebElement element= driver.findElement(By.xpath("//div[@id='txt']"));
		 Actions action=new Actions(driver);
		 		action.moveToElement(element).keyDown(element,Keys.SHIFT).sendKeys(element, "hello").keyUp(element,Keys.SHIFT);;
		 Action action1=action.build();
		 		action1.perform();
		
	}
	

}
