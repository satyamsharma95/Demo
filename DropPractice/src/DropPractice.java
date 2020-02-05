mport java.util.List;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.utest.com/signup/personal");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("satyam");
		
		driver.findElement(By.xpath("//input[@ng-model = 'registrationData.lastName']")).sendKeys("sharma");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("satyamsharma0001@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	/*	driver.findElement(By.xpath("//div[@placeholder='Month']")).click();
		
		List<WebElement> mon= driver.findElements(By.xpath("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//li/div/span/div"));
		
		for(int i = 0;i<mon.size();i++)
		{
			WebElement ele = mon.get(i);
			String nam = ele.getAttribute("innerHTML");
			if(nam.contentEquals("August"))
			{
				ele.click();
			}
			System.out.println("List value are = "+nam);
		}*/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@placeholder='Day']")).click();
		List<WebElement> day = driver.findElements(By.xpath("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//li/div/span/div"));
		for(int j = 0;j<day.size();j++)
		{
			WebElement ele1 = day.get(j);
			String nam1 = ele1.getAttribute("innerHTML");
			if(nam1.contentEquals("30"))
			{
				ele1.click();
			}
			System.out.println("List value are = "+nam1);
		}
	}

}
