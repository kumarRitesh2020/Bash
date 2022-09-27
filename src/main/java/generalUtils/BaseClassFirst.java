package generalUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObjectRepo.LoginToActiPage;

public class BaseClassFirst {
	
	private LoginToActiPage lp;
	private WebDriver driver;
	private WebDriverUtils webDriverUtility;
	private FileUtils fileUtility;
	private ExcelFileUtils  excelUtility;
	private JavaUtils  javaUtility;
	private int randomNumber;
	private String un;
	private String pwd;
	 
	 
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
	     un=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH,"username");
	      pwd=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH,"password");
	   	String timeouts=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH,"timeout");
		long longTimeout=(long) javaUtility.convertStringtoAnyDatatype(timeouts, DataTypesConversion.LONG);
		randomNumber=javaUtility.getRandomNumber(1000);
		  driver = webDriverUtility.openBrowserWithApplication(browser, longTimeout, url);
		  webDriverUtility.jsInitialization(driver);
		   lp=new LoginToActiPage(driver);
	 }
		   @BeforeMethod
		   public void setUp() {
		 //  lp.loginAction(fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH, "username"),fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH, "password"));
		   lp.loginAction(un, pwd);
		   
	 }
}
