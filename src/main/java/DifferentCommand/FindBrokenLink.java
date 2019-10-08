package DifferentCommand;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindBrokenLink {
	@Test
	public void getBrokenLink() {
		String homePage = "http://www.zlti.com";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
        WebDriver driver;
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    	 driver = new ChromeDriver();
    	driver.get("https://www.zlti.com/");
    	
    	List <WebElement> alllinks=driver.findElements(By.tagName("a"));
    	
    	Iterator<WebElement> itr=alllinks.iterator();
    	
    	while(itr.hasNext()) {
    		url=itr.next().getAttribute("href");
    		System.out.println(url);
    		if(url == null || url.isEmpty()){
    			System.out.println("URL is either not configured for anchor tag or it is empty");
    			                continue;
    			            }
    			            
    			            if(!url.startsWith(homePage)){
    			                System.out.println("URL belongs to another domain, skipping it.");
    			                continue;
    			            }
    			            try {
    			                huc = (HttpURLConnection)(new URL(url).openConnection());
    			                
    			                huc.setRequestMethod("HEAD");
    			                
    			                huc.connect();
    			                
    			                respCode = huc.getResponseCode();
    			                
    			                if(respCode >= 400){
    			                    System.out.println(url+" is a broken link");
    			                }
    			                else{
    			                    System.out.println(url+" is a valid link");
    			                }
    			                    
    			            } catch (MalformedURLException e) {
    			                // TODO Auto-generated catch block
    			                e.printStackTrace();
    			            } catch (IOException e) {
    			                // TODO Auto-generated catch block
    			                e.printStackTrace();
    			            }
    	}
    	
    	
	}

}
