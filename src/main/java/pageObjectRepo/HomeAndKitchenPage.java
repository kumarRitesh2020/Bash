package pageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generalUtils.WebDriverUtils;

public class HomeAndKitchenPage {
	WebDriverUtils webDriverUtils= new WebDriverUtils();
	@FindBy(xpath="//a[text()='HOME AND KITCHEN']") private WebElement clickHomeAndKitchenPage;
	
	@FindBy(xpath="//span[text()='brands']") private WebElement BrandSelect;
		
	@FindBy(xpath="//span[text()='brands']/following::div[@class='facet-body']/div[text()='MORE']")	private WebElement MoreClick;
	
	@FindBy(xpath="//button[text()='Apply']") private WebElement ApplyClick;
	public HomeAndKitchenPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void HomeKitchenAction() {
		clickHomeAndKitchenPage.click();
	}
	public void BrandSelectForThreeProduct() {
		BrandSelect.click();
	}
	public void SelectBrand(String brandone) {
		webDriverUtils.select(clickHomeAndKitchenPage,brandone);
	}
	
	public void ClickMore() {
		MoreClick.click();
	}
	
	public void ClickApply() {
		ApplyClick.click();
	}

}
