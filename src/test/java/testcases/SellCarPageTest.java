package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class SellCarPageTest extends BaseTest {
	
	@Test
	public void gotoSellCarPage() throws IOException {
		initialSetUp();
		HomePage homepage= new HomePage(driver);
		String txtH1tag = homepage.gotoSellCarTab().getTextUsedCarVal();
		Assert.assertEquals(txtH1tag, "Valuation of Used Cars Online");
		//NewCarPage newcarpage= new NewCarPage(driver);
	}
			
		
	}
