package Cleartrip.Trip;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class Screenshot implements ITestListener
{

public void onTestFailure(ITestResult il)
{
	String mn=il.getName();
	takeScreenshot(mn);
}
public void takeScreenshot(String name)
{
	
	FirefoxDriver ff= (FirefoxDriver)SuperTestScript.driver;
	File f1=ff.getScreenshotAs(OutputType.FILE);
	File f2= new File("./failure_screenshots/"+name+".png");
	
	try
	{
		FileUtils.moveFile(f1,f2);
	}
	catch(Exception obj)
	{
		Reporter.log("Screenshot not moved -------",true);
	}
}










public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}
public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}
public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}
public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}
public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}
	
}
