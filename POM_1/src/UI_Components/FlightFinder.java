package UI_Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Tests.AbstractTest;

public class FlightFinder extends AbstractTest
{
	@FindBy(name="fromPort")
	static WebElement departedfrom;
	
	@FindBy(xpath=".//input[@name='servClass']")
	static WebElement serviceClass;
	
	public void dpfrom()
	{
		departedfrom.sendKeys("New York");
		
	}
	
	public void servive_Class()
	{
		serviceClass.isSelected();
	}
	

}
