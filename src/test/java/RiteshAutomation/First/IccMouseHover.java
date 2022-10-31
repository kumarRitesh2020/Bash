package RiteshAutomation.First;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccMouseHover {
	@Test
	@Parameters("BROWSER")
	public void WomenRanking(String BROWSER) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.t20worldcup.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@class='site-tabs__link']/following::li/a[normalize-space(text())='ICC RANKINGS']")).click();
			String parent=driver.getWindowHandle();
			System.out.println("parent window id is"+parent);
			Set<String>allWindows=driver.getWindowHandles();
			ArrayList<String>tabs=new ArrayList<>(allWindows);
			driver.switchTo().window(tabs.get(1));
			System.out.println("Title is:"+driver.getTitle());
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//span[text()='label.ICCHome']/ancestor::div[@class='main-navigation__header u-hide-desktop']/descendant::button[normalize-space(text())='Rankings']"))).click().perform();
			driver.findElement(By.xpath("(//button[@class='linked-list__dropdown-label js-dropdown-btn']/following::ul/li/a[normalize-space(text())='Player Rankings'])[1]")).click();
			

	}

}
