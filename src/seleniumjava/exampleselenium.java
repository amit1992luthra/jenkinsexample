package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleselenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String urlname = driver.getTitle(); 
		System.out.println("title of the page is "+urlname);
		Thread.sleep(3000);
		driver.get("https://www.univarsolutions.com/");
		urlname = driver.getTitle(); 
		System.out.println("title of the page is "+urlname);
		Thread.sleep(3000);
		driver.get("https://www.grainger.ca/en");
		urlname = driver.getTitle(); 
		System.out.println("title of the page is "+urlname);
		System.out.println("driver is closing");
		Thread.sleep(3000);
		driver.quit();

	}

}
