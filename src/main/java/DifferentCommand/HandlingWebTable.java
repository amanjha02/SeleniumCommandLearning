package DifferentCommand;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWebTable {
	@Test
	public void HandelWebTable() {
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	// WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/web-table-element.php#");
	List<WebElement> numOfColumn=driver.findElements(By.xpath("//table/thead/tr/th"));
	for (WebElement columnValue : numOfColumn) {
		System.out.println(columnValue.getText());
	}
	
	Iterator itr=numOfColumn.iterator();
	while (itr.hasNext()) {
	System.out.println(itr.next());
	itr.next();
	numOfColumn.get((Integer)itr.next()).getText();
	}
		
	
	
	
	
	System.out.println(numOfColumn.size());
	List<WebElement> noOfRow=driver.findElements(By.xpath("//table/thead/tr"));
	System.out.println(noOfRow.size());
}
}
