package seleniumBasicsDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver-v0.20\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		select.selectByValue("hi");
		
		
		List<WebElement> options = select.getOptions();
		int x=options.size();
		
		
		System.out.println(x);
		
		
		System.out.println("----------Printing all dropdown values------------");
		for(int i=0; i<options.size(); i++){
			System.out.println(options.get(i).getText());
		}
					
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		List<WebElement> options1 = dropdown.findElements(By.tagName("option"));
		System.out.println(options1.size());
		System.out.println("----------Printing all values of attribute 'lang'------------");
		for(int i=0; i<options1.size(); i++){
			System.out.println(options1.get(i).getAttribute("lang"));
		}
		driver.close();
	}
}
