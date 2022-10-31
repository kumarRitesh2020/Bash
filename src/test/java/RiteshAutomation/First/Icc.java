package RiteshAutomation.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Icc {
	
     @Test
     @Parameters("BROWSER")
	public  void Ranking(String BROWSER) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.t20worldcup.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@class='site-tabs__link']/following::li/a[normalize-space(text())='ICC RANKINGS']")).click();
			driver.close();

	}

}
