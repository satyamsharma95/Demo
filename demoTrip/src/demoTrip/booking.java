package demoTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class booking {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripmasters.com/");
		/*driver.findElement(By.xpath("//*[@class='dvIntlFly']/child::span[text()='Without Air *']")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
*/
	String s =  driver.findElement(By.xpath("//section[@class='dvByoCalTitle']//h1[contains(text(),'Custom vacation packages since 1984')]")).getText();
	System.out.println(s);
	String expect = "Custom vacation packages since 1984";
	Assert.assertEquals(s, expect);
	System.out.println("User is on homepage tc passed.");
	
	}

}
