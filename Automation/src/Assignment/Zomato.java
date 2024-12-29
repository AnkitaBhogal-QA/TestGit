package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("cake");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).click();
		
		driver.findElement(By.xpath("//p[2]")).click();
		
		driver.findElement(By.xpath("//div[text()='Promoted']")).click();
	}

}
