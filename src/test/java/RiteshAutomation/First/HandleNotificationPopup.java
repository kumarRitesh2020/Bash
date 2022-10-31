package RiteshAutomation.First;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleNotificationPopup {

	public static void main(String[] args) {
	    	ChromeOptions options=new ChromeOptions();
	    	options.addArguments("--disable-notifications");
	    	WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver(options);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://mictests.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[text()='Test my mic']")).click();
			
			

	}

}
