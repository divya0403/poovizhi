package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import POM.TC_01P;

public class TC_01
{
	@Test
	public void run()
	{
		System.setProperty("WebDriver.Chrome.driver", "C:/Users/TYSS/Downloads/chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		TC_01P t1=new TC_01P();
		t1.fromTextBox("Ban");
		
	}

}
