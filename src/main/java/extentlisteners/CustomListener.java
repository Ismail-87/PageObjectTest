package extentlisteners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import io.qameta.allure.Allure;

public class CustomListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
		//System.out.println("the test Start " + result.getMethod().getMethodName());
		//Reporter.log();
		Reporter.log("Test Started "+ result.getMethod().getMethodName() );
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		//System.out.println("the test Passed " + result.getMethod().getMethodName());
		Reporter.log(result.getMethod().getMethodName());
		//Reporter.log("Capture screenshot");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		System.out.println("the test failed " + result.getMethod().getMethodName());
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(result.getMethod().getMethodName());
		try {
			CustomeAction.takeScreenshot("./target/Error_Screenshot/", result.getMethod().getMethodName());
			Reporter.log("screenshot captured");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File screeshotpath= new File("./target/Error_Screenshot/"+result.getMethod().getMethodName()+".jpg");
		
		//System.out.println(screeshotpath);
		Reporter.log("<a href="+ screeshotpath.getAbsolutePath() +">Screenshot</a>");
		Reporter.log("<br/>");
		Reporter.log("<a href=" + screeshotpath.getAbsolutePath()+ " target=\"_blank\"><img src=" + screeshotpath.getAbsolutePath()+ " height=150 width=150></a>");
		// Allure Report screensot attach
		//Path path = Paths.get(screeshotpath);
		try {
			InputStream is= new FileInputStream(screeshotpath.getAbsolutePath());
			Allure.addAttachment("Screenshot", is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
		System.out.println("the test skipped " + result.getMethod().getMethodName());
		Reporter.log(result.getMethod().getMethodName());
		Reporter.log("Capture screenshot");
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	}

}
