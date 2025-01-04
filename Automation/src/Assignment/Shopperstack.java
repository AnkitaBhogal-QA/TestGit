package Assignment;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopperstack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		System.out.println("Launching Website");
		driver.get("https://www.shoppersstack.com/");
		
		System.out.println("Clicking product");
		driver.findElement(By.xpath("//span[text()='FOREVER 21  Casual Regular Sleeves Sol...']")).click();
	
		System.out.println("Entering pincode");
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("132103");
		
		//Thread.sleep(5000);
		
		//Explicit wait
	/*	System.out.println("Waiting for condition to be true");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));
		*/
		
		//fluent wait
		FluentWait w = new FluentWait(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofSeconds(6));
		w.ignoring(TimeoutException.class);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));
		
		
		System.out.println("Clicking the check button");
		driver.findElement(By.xpath("//button[@id='Check']")).click();
		
		
	}

}
