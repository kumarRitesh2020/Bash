package RiteshAutomation.First;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Roshan");
		    Thread.sleep(3000);
		    List<WebElement>l=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		    ArrayList<WebElement>set=new ArrayList<WebElement>(l);
		    Thread.sleep(5000);
	
//			for(WebElement wb:set) {
//				System.out.println(wb.getText());
		    WebElement wb=set.get(3);
				String st=wb.getText();
				System.out.println(st);
				driver.quit();
				
			}}
					
				
				
		
		                                                                                                                                                  
		
