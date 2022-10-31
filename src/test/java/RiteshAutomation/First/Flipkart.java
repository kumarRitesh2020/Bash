package RiteshAutomation.First;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	

	@Test
public void AddToCart() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("riteshkmr981@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ritesh2022@");
		driver.findElement(By.xpath("//button[text()='Request OTP']/ancestor::div[@class='_36HLxm col col-3-5']/descendant::span[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Winter heater");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Classic ROOM HEATER FOR WINTER 1500-2000 W Fan Room Hea...']")).click();
		System.out.println("parent window title is"+driver.getTitle());
		Set<String>allWindows=driver.getWindowHandles();
		ArrayList<String>tabs=new ArrayList<>(allWindows);
		driver.switchTo().window(tabs.get(1));
		System.out.println("Title is:"+driver.getTitle());
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		String expected="Classic ROOM HEATER FOR WINTER 1500-2000 W Fan Room Heater Price in India - Buy Classic ROOM HEATER FOR WINTER 1500-2000 W Fan Room Heater online at Flipkart.com";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
		
		

	}

}
