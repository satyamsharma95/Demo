import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StringDemo {

	public static void main(String[] args) {
	String a = "hi my name ";
	String b = "hi";
	boolean state1 = a.contains(b);
	
	System.out.println("Status is "+state1);
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.get("http://myntra.com");
	/*
		String actual = driver.getTitle();
		String expect = "myntra";
		*/	
			System.out.println("title is "+driver.getTitle());
			String title = driver.getTitle();
			String [] spl = title.split(" ");
			for(int i =0;i<spl.length;i++)
			{
				System.out.println(i+" word of title is "+spl[i]);
				
			}
			boolean state = driver.getTitle().contains(a);
			System.out.println("state is "+state);
			
	}	



}


