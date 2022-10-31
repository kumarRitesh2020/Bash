package RiteshAutomation.First;


import org.testng.annotations.Test;

import generalUtils.BaseClassFirst;

public class HomeAndKitchen extends BaseClassFirst {
	
	@Test
	public void Home( ) {
		String brandone=excelUtility.getDataFromExcelInKey("AJIO", "BRAND NAME");
		
		h.HomeKitchenAction();
		h.BrandSelectForThreeProduct();
		h.SelectBrand(brandone);
		h.ClickMore();
		h.ClickApply();
		
	}

}
