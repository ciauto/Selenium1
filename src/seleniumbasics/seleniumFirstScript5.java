package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class seleniumFirstScript5 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.opera.driver", "C:\\driver\\operadriver_win64\\operadriver.exe");
	OperaOptions options = new OperaOptions();
	options.setBinary(new File("C:\\Users\\Naresh\\AppData\\Local\\Programs\\Opera\\66.0.3515.44_0\\opera.exe"));
	WebDriver driver=new OperaDriver(options);
	driver.get("http://www.facebook.com"); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	driver.quit();
		 
	}

}
