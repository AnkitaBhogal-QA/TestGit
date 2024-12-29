package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Launching Zomato Website");
		driver.get("https://www.zomato.com/");
		
		System.out.println("Taking screenshot");
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screenshot/zomato.png");
		Files.copy(src, dst);
		
		driver.quit();

	}

}
