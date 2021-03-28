package seleniumBasicsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFrames {

	public static WebDriver driver;
	public static boolean isElementPresent(String locator){
		try{
			driver.findElement(By.xpath(locator));
			return true;
		}catch(Throwable t){
			return false;
			}
		}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_checkbox_disabled2");
		//Print total number of iframe on web page
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		System.out.println(isElementPresent("//input[@id='myCheck']"));
		
		driver.findElement(By.xpath("//input[@id='myCheck']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='myCheck']")).isSelected()+"    is selected");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='menuButton']")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
