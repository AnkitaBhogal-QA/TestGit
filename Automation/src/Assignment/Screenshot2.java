package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot2 {
	public static void main(String args[]) throws IOException
	{

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	System.out.println("Launching Zomato Website");
	driver.get("https://www.zomato.com/");
	
	WebElement logo= driver.findElement(By.xpath("//img[@class='high-res-image']"));
	
	File src = logo.getScreenshotAs(OutputType.FILE);
	File dst = new File("./Screenshot/zomatologo.png");
	Files.copy(src, dst);
	
	driver.quit();
	}
}
