package Cleartrip.Trip;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.Zip;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;


public class SuperTestScript
{
	String browserType =ExcelLib.getData("","Tc_01",0,1 );
	String url=ExcelLib.getData("","Tc_01",1,1);
	
	public static WebDriver driver;
	
	
	
	
	@BeforeMethod
	public static void openBrowser(String browserType,String url)
	{
		if(browserType.equalsIgnoreCase("ff"))
		{
			driver=new FirefoxDriver();
			
		}
		if(browserType.equalsIgnoreCase("gc"))
		{
			System.setProperty("Webdriver.Chrome.driver", "path");
			driver=new ChromeDriver();
			
		}
		if(browserType.equalsIgnoreCase("ie"))
		{
			System.setProperty("Webdriver.ie.driver", "path");
			driver=new InternetExplorerDriver();
			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	
	@AfterMethod
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	@AfterSuite
	public static void executionReport()
	{
		Date d1=new Date();
		String t1=d1.toString().replace(":","_");
		
		File src=new File("./test-Output");
		File des=new File("D:/framework/Trip/ExecutionReport"+t1+".zip");
		
		Zip z1=new Zip();
		try
		{
			z1.zip(src, des);
		}
		
		catch(Exception ev)
		{
			Reporter.log("Execution Report is not done");
		}
		
		
		
		
		
	}
}
