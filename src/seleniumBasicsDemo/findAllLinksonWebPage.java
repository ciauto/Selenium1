package seleniumBasicsDemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findAllLinksonWebPage {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver-v0.20\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.wikipedia.org/");
		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]"));	
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println("----------Printing all links------------");
		for(int i=0; i<links.size(); i++){
			System.out.println(links.get(i).getText());
		}
		System.out.println("----------Printing all values of URLs------------");
		for(int i=0; i<links.size(); i++){
		System.out.println(links.get(i).getAttribute("href"));
		}
		driver.close();
	}
}
