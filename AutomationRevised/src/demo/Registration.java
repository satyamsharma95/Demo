package demo;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-extensions");
		
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text'][@name='firstname']")).sendKeys("Test");
		driver.findElement(By.id("u_0_o")).sendKeys("New");
		
		driver.findElement(By.id("u_0_r")).sendKeys("7567");
		
		driver.findElement(By.id("u_0_w")).sendKeys("4565");
		
		Select sel1 = new Select(driver.findElement(By.id("day")));
		
		sel1.selectByIndex(2);
		
Select sel2 = new Select(driver.findElement(By.id("month")));
		
		sel2.selectByIndex(2);
		
Select sel3 = new Select(driver.findElement(By.id("year")));
		
		sel3.selectByIndex(2);
		
		driver.findElement(By.id("u_0_7")).click();
	
		driver.findElement(By.id("u_0_13")).click();
		
		driver.findElement(By.xpath("//a[@class='_8esh']")).click();
		
		driver.navigate().back();
		//driver.close();
		

	}

}
