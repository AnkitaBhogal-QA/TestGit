package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http:\\www.facebook.com");
		
		Thread.sleep(5000);
		
		System.out.println("Clicking Create new account");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(5000);
		
		System.out.println("Entering Firstname");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ankita");
		
		System.out.println("Entering surname");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bhogal");
		
		System.out.println("Select Gender");
		driver.findElement(By.cssSelector("input[value='1']")).click();
		
		System.out.println("Enter phone");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9818262366");	
	
		System.out.println("Enter password");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Test@123");
		
		System.out.println("Click Signup");
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		
		Thread.sleep(5000);
		
		//driver.quit();
		
		}

}
