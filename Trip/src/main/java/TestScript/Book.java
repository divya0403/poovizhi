package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Book {

	public static void main(String[] args)
	{
		System.setProperty("WebDriver.Chrome.driver", "C:/Users/TYSS/Downloads/chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.linkText("HOTELS"));
		
		
		//driver.switchTo().window();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(e1));
		driver.findElement(By.linkText("HOTELS")).click();
		
		driver.findElement(By.xpath("//input[@id='search_key'])")).sendKeys("Ban");
		
		driver.findElement(By.xpath("//*[@id='rh_content']/div/section[1]/div/div[2]/div/div[2]/div/div/ul/li[1]/a/strong/small")).click();
		
		
	}

}
