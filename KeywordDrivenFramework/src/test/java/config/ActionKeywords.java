package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
	public static WebDriver driver;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void navigate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("C:/HTML/LoginPage.html");
	}
	
	public static void Input_Username() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
	}
	
	public static void Input_Password() {
		driver.findElement(By.id("pass_word")).sendKeys("admin1234");
	}
	
	public static void click_Login() {
		driver.findElement(By.id("btn_login")).click();
	}
	
	public void thread_sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public static void closeBrowser() {
		driver.close();
		driver = null;
	}
}
