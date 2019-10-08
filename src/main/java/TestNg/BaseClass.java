package TestNg;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseClass {
	public static WebDriver driver;
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://www.google.com");
	}
	
	public void failed(String Methodname) throws IOException {
		File srcfile=  ((TakesScreenshot)driver).getScreenshotAs(OutputType .FILE);
		Files.copy(srcfile, new File("D:\\JAVA_CODE\\SeleniumCommandLearning\\Driver\\"+Methodname+".jpg"));
	}

}
