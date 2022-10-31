package RiteshAutomation.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TutorialNnja {
	@Test
	public void VerifyTutorialNnja() {
		    WebDriverManager.chromedriver().setup();
	    	WebDriver driver=new ChromeDriver();
	    	JavascriptExecutor jsExecutor;
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			String expectedTitle="Your Store";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//a[text()='Components']"))).click().perform();
			driver.findElement(By.xpath("//a[text()='Monitors (2)']")).click();
		    String price1= driver.findElement(By.xpath("//span[@class='price-new']")).getText();
		    driver.findElement(By.partialLinkText("Apple")).click();
		    String price2= driver.findElement(By.xpath("//h2[text()='$110.00']")).getText();
			String actualPrice=price1;
			String expectedPrice=price2;
			Assert.assertEquals(actualPrice, expectedPrice,"Passed");
		    jsExecutor =(JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//h3[text()='Available Options']")));
			driver.findElement(By.xpath("//input[@value=7]")).click();
			driver.findElement(By.xpath("//label[text()='Checkbox']/ancestor::div[@class='form-group required ']/descendant::input[@value='10']")).click();
			driver.findElement(By.xpath("//textarea[@id='input-option209']")).sendKeys("Selenium4");
		    WebElement ele=	driver.findElement(By.xpath("//select[@id='input-option217']"));
			Select s=new Select(ele);
			s.selectByValue("3");
			driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		    String msg=	driver.findElement(By.xpath("//button[text()='Add to Cart']/following::div[@class='alert alert-info']")).getText();
			String actualmsg=msg;
			String expectedmsg="This product has a minimum quantity of 2";
			Assert.assertEquals(actualmsg, expectedmsg);
			
			String msg1=	driver.findElement(By.xpath("//div[text()='File required!']")).getText();
			String actualmsg1=msg1;
			String expectedmsg1="File required!";
			Assert.assertEquals(actualmsg1, expectedmsg1);
			

	}

}
