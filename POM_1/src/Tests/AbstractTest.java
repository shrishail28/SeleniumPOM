package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import UI_Components.LoginComponent;
import cucumber.api.java.*;
import UI_Components.FlightFinder;

public class AbstractTest 
{
	
	LoginComponent logincomponent;
	FlightFinder Flightfinder;
	WebDriver driver;
	
	public AbstractTest()
	{
		logincomponent = new LoginComponent();
		Flightfinder = new FlightFinder();
	}
	
	@Before
	public void setUpEnvironment()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Class files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		PageFactory.initElements(driver, logincomponent);
		PageFactory.initElements(driver, Flightfinder);
	}
	
	@AfterTest
	public void closeEnvironment()
	{
		driver.close();
	}
	
	
	
	
}
