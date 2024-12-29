package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShop {
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Opening URL");
		String url="https://demowebshop.tricentis.com/";
		driver.get(url);
		
		System.out.println("Clicking Register");
		driver.findElement(By.className("ico-register")).click();
		
		System.out.println("Clicking Gender");
		driver.findElement(By.id("gender-female")).click();
		
		System.out.println("Entering First Name");
		driver.findElement(By.name("FirstName")).sendKeys("Ankita");
		
		System.out.println("Entering Last Name");
		driver.findElement(By.name("LastName")).sendKeys("Bhogal");
		
		System.out.println("Entering Email");
		driver.findElement(By.id("Email")).sendKeys("ankita.bhogal2@gmail.com");
		
		System.out.println("Entering Password");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		
		System.out.println("Entering Confirm Password");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Test@123");
		
		Thread.sleep(5000);
		
		System.out.println("Clicking Register button");
		driver.findElement(By.id("register-button")).click();
		
		Thread.sleep(10000);
		
		String actualUrl ="https://demowebshop.tricentis.com/registerresult/1";
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals(actualUrl))
		{
			System.out.println("Registration success");
		}
		else
			System.out.println("Email already exist");
		
		driver.quit();
	}
}
