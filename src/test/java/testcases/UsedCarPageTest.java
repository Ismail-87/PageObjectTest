package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class UsedCarPageTest extends BaseTest {
	
	@Test
	public void gotoUsedCarPage() throws IOException {
		initialSetUp();
		HomePage homepage= new HomePage(driver);
		String tabBudget = homepage.gotoUsedCarTab().getTextByBudgetTab();
		Assert.assertEquals(tabBudget, "BY BUDGET");
		//NewCarPage newcarpage= new NewCarPage(driver);
	}

}
