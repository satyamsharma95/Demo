package assertOperation;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertOperation {
	
	
	@Test
	public void test1()
	{
		System.out.println("Test 1 started");
		Assert.assertEquals(1, 17,"Count does not match");
		System.out.println("Test 1 completed");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2 started");
		Assert.assertEquals(1, 1,"Count does not match");
		System.out.println("Test 2 completed");
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("Soft Assert");
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(1, 2,"Count does not match");
		System.out.println("Test 3 completed");
		assertion.assertAll();
	}
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91807\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.makemytrip.com/flights/?gclid=EAIaIQobChMIvaGpucCC5wIVWwwrCh1NpAy6EAAYASAAEgKzT_D_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!makemytrip&ef_id=EAIaIQobChMIvaGpucCC5wIVWwwrCh1NpAy6EAAYASAAEgKzT_D_BwE:G:s");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();;
		String color = driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getAttribute("class");
		String[] arrcolor = color.split("#");
		
		System.out.println("color of text is "+ color);
		
		assertTrue(arrcolor[1].equals("d93025"));
		
		
	/*	String[] hexValue = color.replace("rgba(","").replace(")","").split(",");
		
		int hexValue1=Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2=Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3=Integer.parseInt(hexValue[2]);
		
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		
		//String expected_e = "Enter an email or phone number";
		
		*/
		
	
	
	
	}

}
