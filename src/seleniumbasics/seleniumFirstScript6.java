package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumFirstScript6 {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver-v0.26.0\\geckodriver.exe");
		

		
		WebDriver driver=new FirefoxDriver();
		
		
		  driver.get("http://www.facebook.com"); 
		  
		  driver.manage().window().maximize();
		  Thread.sleep(4000); 
		 
		  driver.quit();
		 
		 
		
	}

}
