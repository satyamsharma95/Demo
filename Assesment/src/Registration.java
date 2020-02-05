import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.utest.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='nav-sidebar-footer__link nav-sidebar-footer__link--inline' and @href='/signup/personal']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("satyam");
		
		driver.findElement(By.xpath("//input[@ng-model = 'registrationData.lastName']")).sendKeys("sharma");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("satyamsharma0001@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.xpath("//div[@placeholder='Month']")).click();
		Select sel1 = new Select(driver.findElement(By.xpath("//input[@type='search' and @placeholder='Month']")));
		
		sel1.selectByVisibleText("February");
		Thread.sleep(5000);
		
		Select sel2 = new Select(driver.findElement(By.xpath("//input[@type='search' and @placeholder='Day']")));
		Thread.sleep(5000);
		sel2.selectByVisibleText("2");
		
		Select sel3 = new Select(driver.findElement(By.xpath("//input[@type='search' and @placeholder='Year']")));
		
		sel3.selectByVisibleText("1996");
		
		Select sel4 = new Select(driver.findElement(By.xpath("//input[@type='search' and @placeholder='Select a gender']")));
		
		sel4.selectByVisibleText("Male");
		
		driver.findElement(By.xpath("//a[@aria-label = 'Next step - define your location']")).click();
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Noida");
		
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("302004");
		
		Select sel5 = new Select(driver.findElement(By.xpath("//input[@placeholder='Select a country']")));
		
		sel5.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//a[@aria-label='Next step - select your devices']")).click();
		
		Select sel6 = new Select(driver.findElement(By.xpath("//input[@placeholder='Select OS' and @aria-owns='ui-select-choices-15']")));
		
		sel6.selectByVisibleText("Windows");
		
		Select sel7 = new Select(driver.findElement(By.xpath("//input[@aria-owns='ui-select-choices-16']")));
		
		sel7.selectByVisibleText("Vista");
		
		Select sel8 = new Select(driver.findElement(By.xpath("//input[@aria-owns='ui-select-choices-17']")));
		
		sel8.selectByVisibleText("Arabic");
		
		Select sel9 = new Select(driver.findElement(By.xpath("//input[@aria-owns='ui-select-choices-18']")));
		
		sel9.selectByVisibleText("Alcatel");
		
		driver.findElement(By.xpath("//a[@role='button' and @aria-label='Next - final step']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='confirmPassword']']")).sendKeys("1234567890");
		
		
		driver.findElement(By.xpath("//span[@class='checkmark signup-consent__checkbox error' and @ng-class='{error: userForm.termOfUse.$error.required}']")).click();
		driver.findElement(By.xpath("//span[@class='checkmark signup-consent__checkbox error' and @ng-class='{error: userForm.privacySetting.$error.required}']")).click();
		driver.findElement(By.xpath("//a[@id='laddaBtn']")).click();
		
		driver.close();
		

	}

}
