package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriveMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:facebook.com");
		String url = driver.getCurrentUrl();
		System.out.println("Current url is "+url);
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		String pagesource = driver.getPageSource();
		//System.out.println("page source is "+pagesource);
		WebElement ele=driver.findElement(By.id("u_0_m"));
		System.out.println("id is "+ele);
		
		
		driver.manage().window().maximize();
		driver.close();
	}

}
