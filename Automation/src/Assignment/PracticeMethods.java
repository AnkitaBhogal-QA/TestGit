package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeMethods {
	public static void main(String[] args) throws InterruptedException
	{
		//Code to open the Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//URL 1 -------- SWIGGY
		String actual_url1="https://www.swiggy.com/";
		
		driver.get(actual_url1);
		String actual_title1 = driver.getTitle();
		String expected_title1= "Order Food & Groceries. Discover the best restaurants. Swiggy it!";
		String expected_url1=driver.getCurrentUrl();
		
		checkTitle(actual_title1,expected_title1);
		checkUrl(actual_url1, expected_url1);
		
		Thread.sleep(2000);
		
		//URL 2 -------- ZOMATO
		String actual_url2="https://www.zomato.com/";

		driver.navigate().to(actual_url2);
		String actual_title2 = driver.getTitle();
		String expected_title2= "Zomato";
		String expected_url2=driver.getCurrentUrl();

		checkTitle(actual_title2,expected_title2);
		checkUrl(actual_url2, expected_url2);
		
		//URL 3 --------- ZEPTO
		String actual_url3="https://www.zeptonow.com/";

		driver.navigate().to(actual_url3);
		String actual_title3 = driver.getTitle();
		String expected_title3= "Welcome to Zepto, India's Fastest Online Grocery Delivery App! Get all your groceries delivered to you in minutes. | www.zeptonow.com";
		String expected_url3=driver.getCurrentUrl();

		checkTitle(actual_title3,expected_title3);
		checkUrl(actual_url3, expected_url3);

		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		//Code to close the browser
		driver.quit();
		
		
	}
	
	//Script to check if the title is correct
	public static void checkTitle(String titleA,String titleE)
	{
		
		if(titleA.equals(titleE))
			System.out.println("Title matches");
		else
			System.out.println("Title mismatch");
	}
	
	//Script to check if URL is correct
	public static void checkUrl(String urlA,String urlE)
	{
		if(urlA.equals(urlE))
			System.out.println("URL Matches");
		else
			System.out.println("URL mismatch");
	}
}
