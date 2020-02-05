package robotRevise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotRe {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.elitmus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("satyamsharma0001");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("satyamsharma");
		driver.findElement(By.xpath("//input[@id='submit_button']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@title='Jobs']")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"cocoonJavaScriptEnabled\"]/div[8]/div[2]/div/div[4]/div/div[1]/div[3]/a")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,1300)");
		
		WebElement browser = driver.findElement(By.xpath("//input[@type='file']"));
		Actions action = new Actions(driver);
		action.moveToElement(browser).build().perform();
		action.click().build().perform();
		Thread.sleep(3000);
		StringSelection sel = new StringSelection("\"C:\\Users\\91807\\cv.pdf\"");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		Robot robot = new Robot();
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
		
		driver.close();
		
	}

}
