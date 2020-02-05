package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertClass {
	
	@Test
	public void alertTest() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		int total_number = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(arg0)
		System.out.println("Total number of frames are "+total_number);
		//driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sartaa");;
		/*Alert al = driver.switchTo().alert();
		al.accept();
		*/
	}

}
