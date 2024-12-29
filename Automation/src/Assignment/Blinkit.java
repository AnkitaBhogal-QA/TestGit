package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Blinkit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.blinkit.com/");
		
		Thread.sleep(3000);
		
		try
		{
			System.out.println("Clicking Detect location automatically");
			driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
			System.out.println("Detect location automatically clicked");     ///(keys.space) to press the space
		}
		catch(Exception e)
		{
			System.out.println("Detect location automatically pop-up not found");
		}
		
		Thread.sleep(10000);
		
		System.out.println("Clicking search");
		driver.findElement(By.xpath("//a[@href='/s/']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering in search");
		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("milk");
		
		Thread.sleep(2000);
		
		System.out.println("Adding searched item to cart");
		driver.findElement(By.xpath("//div[text()='Amul Moti Toned Milk (90 Days Shelf Life)']/../following-sibling::*/descendant::div[text()='ADD']")).click();
		
		System.out.println("Selecting more quantity");
		
		for(int i=0;i<4;i++)
		{
		driver.findElement(By.cssSelector("div[class*='StyledDiv2']")).click();
		}
		
		System.out.println("Total 5 quantity selected");
		
		System.out.println("Clicking Cart");
		driver.findElement(By.xpath("//div[text()=' items']")).click();
		System.out.println("Cart clicked");
		
		Thread.sleep(5000);
		
		System.out.println("Clicking Login to proceed to cart pop-up");
		driver.findElement(By.xpath("//div[text()='Login to Proceed']")).click();
		System.out.println("Login to proceed clicked");
		
		Thread.sleep(5000);
		
		System.out.println("Entering phone number on Login pop-up");
		driver.findElement(By.className("login-phone__input")).sendKeys("9818262366");
		System.out.println("Phone number entered sucessfully");
	}
	

}
