package RiteshAutomation.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {
	
	@Test

	public void PlaySong() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Tum mile song");
			driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//a[@title='Tum Mile Full Video - Title Track|Emraan Hashmi,Soha Ali|Pritam|Neeraj Shridhar|Kumaar']")).click();
			

	}

}
