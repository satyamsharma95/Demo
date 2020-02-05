import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Test1 {
	
	//Disable Notification in Chrome BROWSER
	public static void main(String [] args) throws InterruptedException
	 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		 
	       driver.get("http://www.facebook.com/");
	       driver.manage().window().maximize();
	       System.out.println("Application title is ============="+driver.getTitle());
	       WebElement checkboxx = driver.findElement(By.id("u_0_7"));
	       boolean status = checkboxx.isDisplayed();
	       System.out.println("Male radio button displayed = "+status);
	       boolean enabled_status = checkboxx.isEnabled(); 
	       
	  
	       System.out.println("Male radio button enabled status = "+enabled_status);
	       boolean status_selected = checkboxx.isSelected();
	       System.out.println("checkbox selected status = "+status_selected);
	       checkboxx.click();
	       //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       /*WebDriverWait wait = new WebDriverWait(driver,10);
	       checkboxx = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox'][@value='Casual Shoes']")));
	       */
	       
	       boolean newstate = checkboxx.isSelected();
	       System.out.println(" new checkbox selected status = "+newstate);
	       
	 
	       
		
	/*	<---------Launch WebDriver for chrome------>
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		
		WebDriver driver = new ChromeDriver(options);
		 
	       driver.get("http://www.myntra.com");
	       
	       System.out.println("Application title is ============="+driver.getTitle());
	 
	       driver.manage().window().maximize();
	*/
	}}
