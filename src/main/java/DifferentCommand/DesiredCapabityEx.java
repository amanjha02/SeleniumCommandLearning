package DifferentCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DesiredCapabityEx {
	public WebDriver driver;
	@BeforeClass
	public void Setup() {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");					
	       driver = new ChromeDriver();
	}
	//@Test
	public void DesiredCapability() {
		String baseUrl = "http://demo.guru99.com/test/social-icon.html";					
       					
        driver.get(baseUrl);					
        String expectedTooltip = "Github";	
        
        // Find the Github icon at the top right of the header		
        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));	
        
        //get the value of the "title" attribute of the github icon		
        String actualTooltip = github.getAttribute("title");	
        
        //Assert the tooltip's value is as expected 		
        System.out.println("Actual Title of Tool Tip"+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();			
	}
	@Test
	public void JqeryToolTip() {
		String baseUrl = "http://demo.guru99.com/test/tooltip.html";					
       // System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");	
        
        // driver = new ChromeDriver();					
        String expectedTooltip = "What's new in 3.2";					
        driver.get(baseUrl);					
        		
        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
        Actions builder = new Actions (driver);							

        builder.clickAndHold().moveToElement(download);					
        builder.moveToElement(download).build().perform(); 	
        
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
        String actualTooltip = toolTipElement.getText();			
        
        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();		
	}

}
