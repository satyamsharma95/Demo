import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//specifying the file location
		
		driver.get("http://the-internet.herokuapp.com/upload");
		System.out.println("hiiiiiiii");
		WebElement fileupload=driver.findElement(By.xpath("//input[@id='file-upload']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(fileupload).click().build().perform();
	
	}	



}
