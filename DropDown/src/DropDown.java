 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\91807\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe" );
	ChromeOptions options = new ChromeOptions();
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println("Title is = "+driver.getTitle());
	/*WebElement date_drop = driver.findElement(By.id("day"));
	Select date = new Select(date_drop);
	date.selectByVisibleText("4");
	
	WebElement month_drop = driver.findElement(By.id("month"));
	Select month = new Select(month_drop);
	month.selectByVisibleText("Dec");
	
	WebElement year_drop = driver.findElement(By.id("year"));
	Select year = new Select(year_drop);
	year.selectByVisibleText("2019");
	*/
	WebElement month_drop = driver.findElement(By.id("month"));
	Select month = new Select(month_drop);
	/*month.selectByIndex(3);
	
	Thread.sleep(3000);
	
	month.selectByIndex(5);
	WebElement value = month.getFirstSelectedOption();
	String v = value.getText(); 
	System.out.println(v);
	*/
	List<WebElement> drop =month.getOptions();
	for(int i = 0;i<drop.size();i++)
	{
		String drop_values =drop.get(i).getText();
		System.out.println("Drop Down values are "+drop_values);
		
		
	}
	}

}
