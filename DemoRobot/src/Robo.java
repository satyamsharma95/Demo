import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Robo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//specifying the file location
		
		
		
		
		driver.get("http://www.elitmus.com/login");
		driver.findElement(By.id("user_email_or_username")).sendKeys("satyamsharma0001");
		driver.findElement(By.id("user_password")).sendKeys("satyamsharma");
		Thread.sleep(5000);
		
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
		driver.get("http://www.elitmus.com/users/3471734/jobs/32659/new");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scroll(0,1300)");
	
		 
		 
		 
		 WebElement browser = driver.findElement(By.xpath("//*[@id='resume_file']"));
		 Actions actions = new Actions(driver);
			actions.moveToElement(browser).build().perform();
			actions.click().build().perform();
		 Thread.sleep(2000);
		// browser.sendKeys(Keys.ENTER);
		 StringSelection sel = new StringSelection("\"C:\\Users\\91807\\cv.pdf\"");
		 
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		 
		 
		 
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		// Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		        
		         //Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		
			
		
		
		
		
			
			
		}

		
		
	}


