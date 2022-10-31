package RiteshAutomation.First;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationTesting {
	
	@Test
	public void testAutomate() throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./test/resourcefiles/ExcelData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("AUTOMATE");
		String firstname=sheet.getRow(1).getCell(0).getStringCellValue();
		String lastname=sheet.getRow(1).getCell(1).getStringCellValue();
		String address=sheet.getRow(1).getCell(2).getStringCellValue();
		String email=sheet.getRow(1).getCell(3).getStringCellValue();
		String phone=sheet.getRow(1).getCell(4).getStringCellValue();
		String language=sheet.getRow(1).getCell(7).getStringCellValue();
		String skill=sheet.getRow(1).getCell(8).getStringCellValue();
		String country=sheet.getRow(1).getCell(8).getStringCellValue();
		String year=sheet.getRow(1).getCell(10).getStringCellValue();
		String month=sheet.getRow(1).getCell(11).getStringCellValue();
		String day=sheet.getRow(1).getCell(12).getStringCellValue();
		String password=sheet.getRow(1).getCell(13).getStringCellValue();
		String cpassword=sheet.getRow(1).getCell(13).getStringCellValue();
		String path=sheet.getRow(1).getCell(14).getStringCellValue();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='First Name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@type='email' and @ng-model='EmailAdress']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		WebElement w7=driver.findElement(By.xpath("//div[@id='msdd']"));
		w7.click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//label[text()='Languages']")).click();
		Thread.sleep(3000);
		
	    WebElement w=driver.findElement(By.xpath("//select[@id='Skills']"));
	    w.click();
		Select s=new Select(w);
		s.selectByVisibleText(skill);
		
		driver.findElement(By.xpath("//select[@id='countries']")).click();
		
		
		WebElement w1=driver.findElement(By.xpath("//span[@role='combobox']"));
		w1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search']")).click();
		WebElement r=driver.findElement(By.xpath("//span[@id='select2-country-container']"));
		Actions act=new Actions(driver);
		act.moveToElement(r).click().perform();
		
		
		WebElement w2=driver.findElement(By.xpath("//select[@id='yearbox']"));
		w2.click();
		Select s2=new Select(w2);
		s2.selectByVisibleText(year);
		
		WebElement w3=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		w3.click();
		Select s3=new Select(w3);
		s3.selectByVisibleText(month);
		
		WebElement w4=driver.findElement(By.xpath("//select[@id='daybox']"));
		w4.click();
		Select s4=new Select(w4);
		s4.selectByVisibleText(day);
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(cpassword);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		
		
	}

}
