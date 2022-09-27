package pageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class LoginToActiPage {
	
	@FindBy(name="username") WebElement userNameEnter;
	@FindBy(xpath="//input[@name='pwd']") WebElement passwordEnter;
	@FindBy(xpath="//div[normalize-space()='Login']") WebElement clickAction;
	
	public LoginToActiPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void loginAction(String username,String password) {
		userNameEnter.sendKeys(username);
		passwordEnter.sendKeys(password);
		clickAction.click();
		
		
	}

}
