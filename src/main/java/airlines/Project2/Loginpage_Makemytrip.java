package airlines.Project2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_Makemytrip 
{
	ChromeDriver driver;
	@FindBy(xpath="//input[@class='font14 fullWidth']")
	WebElement mobile_no;
	@FindBy(xpath="//div[@class='makeFlex column flexOne whiteText latoBold']")
	WebElement for_login;
	@FindBy(xpath="//input[@id='user-consent-checkbox']")
	WebElement checkbox;
	
	public void checkbox_continue()
	{
		checkbox.click();
	}

	public void loginorcreate()
	{
		for_login.click();
	}
	
	public void login_with_mobileno()
	{
		mobile_no.sendKeys("4025106398"+Keys.ENTER);
	}
	
	public Loginpage_Makemytrip(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
