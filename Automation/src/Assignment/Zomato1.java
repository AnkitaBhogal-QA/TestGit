package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato1 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			System.out.println("Launching Zomato Website");
			driver.get("https://www.zomato.com/");
			
			Thread.sleep(3000);
			
			System.out.println("Clicking search and entering text");
			driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("chole bhature");
			
			System.out.println("Selecting first item from search dropdown");
			driver.findElement(By.xpath("//p[2]")).click();
			
			System.out.println("Clicking first promoted item");
			driver.findElement(By.xpath("//div[text()='Promoted']")).click();
			System.out.println("First promoted item sucessfully clicked");

			System.out.println("Closing browser");
			driver.quit();
		}

	}
