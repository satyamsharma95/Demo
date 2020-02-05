package multiple;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
	
		
		String parent = driver.getWindowHandle();
		System.out.println("name is "+parent);
		
		WebElement clickElement  = driver.findElement(By.id("button1"));
		for(int i=0;i<3;i++)
		{
			clickElement.click();
			Thread.sleep(3000);
		}
		
		
		Set<String> s1 = driver.getWindowHandles();
	
		System.out.println("name is "+s1);
		Iterator<String> I1 = s1.iterator();
		while(I1.hasNext())
		{
			String child_window = I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				driver.manage().window().maximize();
				System.out.println(driver.switchTo().window(child_window).getTitle());
				
				//driver.close();
			}
		}
		driver.switchTo().window(parent);
	
		System.out.println(driver.getTitle());
		
		
		driver.close();
	}
	

}
