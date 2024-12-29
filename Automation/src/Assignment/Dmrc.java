package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dmrc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://delhimetrorail.com/");
		
		Thread.sleep(3000);
		
		System.out.println("Clicking Close on pop-up");
		driver.findElement(By.xpath("//div/button[@id='buttonDismiss1']")).click();
		System.out.println("Close on pop-up clicked");
		
		System.out.println("Clicking on From dropdown");
		driver.findElement(By.xpath("//div/input[@id='FromStation']")).click();
		System.out.println("From dropdown clicked");
				
		Thread.sleep(5000);
		
		System.out.println("Selecting Line from From dropdown");
		driver.findElement(By.xpath("//div[text()='RITHALA']")).click();
		System.out.println("Line selected");
		
		Thread.sleep(3000);

		System.out.println("Selecting station");
		driver.findElement(By.xpath("//font[text()='MOHAN NAGAR']")).click();
		System.out.println("Station selected");
		
		Thread.sleep(3000);
		
		System.out.println("Clicking on To dropdown");
		driver.findElement(By.xpath("//div/input[@id='ToStation']")).click();
		System.out.println("To dropdown clicked");
		
        Thread.sleep(5000);
		
		System.out.println("Selecting Line from To dropdown");
		driver.findElement(By.xpath("//div[text()='NOIDA ELECTRONIC CITY']")).click();
		System.out.println("Line selected");
		
		Thread.sleep(3000);

		System.out.println("Selecting station");
		driver.findElement(By.xpath("//font[text()='DWARKA SECTOR - 9']")).click();
		System.out.println("Station selected");
		
		Thread.sleep(3000);
		
		System.out.println("Clicking Show route & Fare button");
		driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();
		System.out.println("Button clicked");
		
		Thread.sleep(3000);
		
		System.out.println("Clicking Close on pop-up");
		driver.findElement(By.xpath("//div/button[@id='buttonDismiss1']")).click();
		System.out.println("Close on pop-up clicked");
		
		System.out.println("Clicking Zoom in 5 times");
		driver.findElement(By.xpath("//li[text()='+']")).click();
		driver.findElement(By.xpath("//li[text()='+']")).click();
		driver.findElement(By.xpath("//li[text()='+']")).click();
		driver.findElement(By.xpath("//li[text()='+']")).click();
		driver.findElement(By.xpath("//li[text()='+']")).click();
		System.out.println("Zoom in clicked 5 times");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
