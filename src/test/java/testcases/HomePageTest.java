package testcases;

import java.io.IOException;

import org.testng.Assert;
//import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import pages.HomePage;

public class HomePageTest extends BaseTest{
	
	SoftAssert assrt = new SoftAssert();
	@Test
	public void gotoHomePage() throws IOException {
		initialSetUp();
		HomePage homepage= new HomePage(driver);
		Assert.assertEquals(homepage.getPageTitle(), "CarDekho: New Cars, Car Prices, Buy & Sell Used Cars in India");
		//homepage.gotoNewCarTab();
		
	}
	

}
