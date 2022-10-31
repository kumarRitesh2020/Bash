package RiteshAutomation.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccTeam {
	@Test
	public void TeamRanking() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.t20worldcup.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@role='button']/following::li/div/a[normalize-space(text())='Teams']")).click();
			driver.close();
			

	}

}
