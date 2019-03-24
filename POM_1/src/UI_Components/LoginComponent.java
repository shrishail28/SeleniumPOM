package UI_Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Tests.AbstractTest;

public class LoginComponent extends AbstractTest
{
	
	@FindBy(name="userName")
	static WebElement userNameEditbox;
	
	@FindBy(name="password")
	static WebElement passwordEditbox;
	
	@FindBy(name="login")
	static WebElement loginButton;
	
	@FindBy(xpath="//*[@src='/images/spacer.gif'][1]//following::font")
	static WebElement loginVerificationText;
	
	public void login()
	{
		userNameEditbox.sendKeys("batman");
		passwordEditbox.sendKeys("batman");
		loginButton.click();
	}
	
	public static boolean verfiyLoginFunc()
	{
		String actualText=loginVerificationText.getText();
		String expectedText = "";
		//System.out.println("In Verify Login");
		if ( actualText.equals(expectedText))
			return true;
		else
			return false;
	}
	
	

}