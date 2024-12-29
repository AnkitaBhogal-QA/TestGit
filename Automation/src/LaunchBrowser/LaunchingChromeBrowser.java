package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.facebook.com");
		
		String actual_title = driver.getTitle();
		String expected_title= "Facebook – log in or sign up";
		
		if(actual_title.equals(expected_title))
			System.out.print("Facebook page is displayed");
		else
			System.out.println("Facebook page is not displayed");
	}

}
