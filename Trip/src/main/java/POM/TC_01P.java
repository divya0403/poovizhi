package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cleartrip.Trip.SuperTestScript;

public class TC_01P extends BaseClass
{
	@FindBy(xpath="//*[@style='left:15%']")
	private WebElement fromTextBox;
	
	@FindBy(xpath="//*[@style='left: 21%;']")
	private WebElement toTextBox;
	
	@FindBy(xpath="//*[@for='onward_cal']")
	private WebElement onwardDateCalendar;
	
	@FindBy(xpath="//*[@for='return_cal']")
	private WebElement returnDateCalendar;
	
	@FindBy(id="search_btn")
	private WebElement searchButton;
	
	public TC_01P()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}

	
	public void fromTextBox(String s1)
	{
		fromTextBox.sendKeys(s1);
	}
	
	public void toTextBox(String s1)
	{
		toTextBox.sendKeys(s1);
	}
	
	public void onwardDateCalendar(String s1)
	{
		selectText(s1);
		
	}
	
	public void returnDateCalendar(String s1)
	{
		selectText(s1);
	}
	
	public void searchButton()
	{
		searchButton.click();
	}
	
	/*public void homePage(String s1)
	{
		fromTextBox.sendKeys(s1);
		toTextBox.sendKeys(s1);
		onwardDateCalendar.selectText(s1);
		returnDateCalendar.selectText(s1);
		searchButton.click();
		
	}*/
	
}
