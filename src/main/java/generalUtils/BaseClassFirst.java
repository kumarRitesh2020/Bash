package generalUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObjectRepo.HomeAndKitchenPage;
import pageObjectRepo.LoginToActiPage;

public class BaseClassFirst {
	
	private LoginToActiPage lp;
	protected WebDriver driver;
	private WebDriverUtils webDriverUtility;
	private FileUtils fileUtility;
	protected ExcelFileUtils  excelUtility;
	private JavaUtils  javaUtility;
	protected HomeAndKitchenPage h;
	
	
	 
	 
	 @BeforeClass
	 public void classSetUp() throws IOException {
	 excelUtility=new ExcelFileUtils();
     fileUtility=new FileUtils();
	 javaUtility=new JavaUtils();
	 webDriverUtility=new WebDriverUtils();
	 
	    fileUtility.initializePropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH);
		excelUtility.openExcel(CommonFileUtilPath.EXCEL_FILE_PATH);
		
		
		
		
		 String browser=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH, "browser");
		 String url=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH,"url");
	   	String timeouts=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH,"timeout");
		long longTimeout=(long) javaUtility.convertStringtoAnyDatatype(timeouts, DataTypesConversion.LONG);
		  driver = webDriverUtility.openBrowserWithApplication(browser, longTimeout, url);
		  webDriverUtility.jsInitialization(driver);
		   
	 }
		   @BeforeMethod
		 public void setUp() {
		 driver.get("url");
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 h=new HomeAndKitchenPage(driver);
		 
		   
	 }
}
