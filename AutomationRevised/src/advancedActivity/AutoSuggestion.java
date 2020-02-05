package advancedActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shirt");
		Actions builder = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement el = driver.findElement(By.xpath("//div[@data-reactid=\"809\"]//div/ul/li[6]"));
	
		builder.moveToElement(el).build().perform();
		
		Thread.sleep(5000);
		builder.click(el).build().perform();
		driver.close();
	
	
		
		
	
	}

}
