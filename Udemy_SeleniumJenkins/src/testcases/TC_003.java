package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {

	WebDriver driver;
	
	@Test
	public void testcase3() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.id("pass")).sendKeys("pass1");
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
		
		driver.quit();
	}
	
}
