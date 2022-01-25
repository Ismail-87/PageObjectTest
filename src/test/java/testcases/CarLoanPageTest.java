package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CarLoanPage;
import pages.HomePage;

public class CarLoanPageTest extends BaseTest {
	
	@Test
	public void gotoCarLoanPage() throws IOException {
		initialSetUp();
		HomePage homepage= new HomePage(driver);
		boolean txtLoan = homepage.gotoMoreTab().displayLoanLink();
		Assert.assertEquals(txtLoan, true);
		//NewCarPage newcarpage= new NewCarPage(driver);
	}
			

}
