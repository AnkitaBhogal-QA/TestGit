package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="https://www.instagram.com/";
		driver.get(url);
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys("ankitabhogal");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("test@123");
		
		
	}

}
