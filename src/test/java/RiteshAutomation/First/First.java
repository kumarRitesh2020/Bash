package RiteshAutomation.First;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generalUtils.BaseClassFirst;
import generalUtils.CommonFileUtilPath;
import generalUtils.DataTypesConversion;
import generalUtils.ExcelFileUtils;
import generalUtils.FileUtils;
import generalUtils.JavaUtils;
import generalUtils.WebDriverUtils;
import pageObjectRepo.LoginToActiPage;



public class First extends BaseClassFirst{
	
//	 ExcelFileUtils excelUtility;
//	 FileUtils fileUtility;
//	JavaUtils javaUtility;
//	 WebDriverUtils webDriverUtility;
	@Test
	public void testCaseLogin() throws EncryptedDocumentException, IOException
	{
//		//creating instances for generic uility
//				 excelUtility=new ExcelFileUtils();
//				 fileUtility=new FileUtils();
//				 javaUtility=new JavaUtils();
//				 webDriverUtility=new WebDriverUtils();
//				 
//				 //initialization
//				    fileUtility.initializePropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH);
//					excelUtility.openExcel(CommonFileUtilPath.EXCEL_FILE_PATH);
//				
//				//fetching the data from property file
//				 String browser=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH, "browser");
//				 String url=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH,"url");
//				 String un=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH,"username");
//				 String pwd=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH,"password");
//				String timeouts=fileUtility.getDataFromPropertyFile(CommonFileUtilPath.PROPERTY_DATA_FILE_PATH,"timeout");
//				
//				 
//				//convert string to long
//					long longTimeout=(long) javaUtility.convertStringtoAnyDatatype(timeouts, DataTypesConversion.LONG);
//					
//				
//				 WebDriver driver = webDriverUtility.openBrowserWithApplication(browser, longTimeout, url);
//				 
//				 LoginToActiPage lp=new LoginToActiPage(driver);
//					lp.loginAction(un, pwd);
//				
//				
	}
	
	

}
