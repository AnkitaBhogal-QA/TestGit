package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		System.out.println("Launching Website");
		driver.get("https://www.myntra.com/pants");
		
		List<WebElement> productname= driver.findElements(By.xpath("//h3[@class='product-brand']"));
		
		for(int i=0;i<productname.size();i++)
		{
			System.out.println(productname.get(i).getText());
		}
		
		List<WebElement> productprice= driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));

		for(WebElement p : productprice)
		{
			System.out.println(p.getText());
		}
	}

}
