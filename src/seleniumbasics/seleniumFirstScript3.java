package seleniumbasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class seleniumFirstScript3 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer_x64_3.11.1\\IEDriverServer.exe");
	
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://www.facebook.com"); 
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	Runtime.getRuntime().exec("taskkill /F /IM iexplorer.exe");
	driver.quit();
		 
	}

}
