package airlines.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility.Listeners.class)
public class Testcase6_economy_Business extends Lauch_Quit_Makemytrip
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void validating_business_class() throws InterruptedException
	{
		Homepage_Makemytrip h1 = new Homepage_Makemytrip(driver);
		h1.usaselection(); 
		h1.usa();
		h1.usasel();
		h1.applyusa();
		h1.frm(); 
		h1.start_trip();
		h1.to();
		h1.end_trip();
		Thread.sleep(4000);
		h1.calenderarrow();
		//h1.dtslct();
		Thread.sleep(2000);
		h1.dt();
		//h1.retundate();
		//h1.retun();
		Thread.sleep(2000);
		h1.tvlr();
		Thread.sleep(2000);
		h1.adlt();
		h1.child();
		Thread.sleep(2000);
		h1.business();
		Thread.sleep(2000);
		h1.aply();
		h1.srch();
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id='travellerAndClass']"));
		Assert.assertEquals(e1.isDisplayed(), true, "sorry the testcase is failed");
		
		
	}

}
