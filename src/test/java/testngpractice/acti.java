package testngpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class acti {
	@Test
	public void actiTime() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public void myntra() {
		System.out.println("myntra");

}
}