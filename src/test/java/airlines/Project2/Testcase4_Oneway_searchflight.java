package airlines.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility.Listeners.class)

public class Testcase4_Oneway_searchflight extends Lauch_Quit_Makemytrip
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void searchforflight() throws InterruptedException
	{
		Homepage_Makemytrip h1 = new Homepage_Makemytrip(driver);
		h1.usaselection(); 
		h1.usa();
		h1.usasel();
		h1.applyusa();
		h1.oneway();
		h1.frm();
		h1.start_trip();
		h1.to();
		h1.end_trip();
		Thread.sleep(4000);
		//h1.dtslct();
		h1.calenderarrow();
		Thread.sleep(2000);
		h1.dt();
		Thread.sleep(2000);
		h1.tvlr();
		Thread.sleep(2000);
		h1.adlt();
		h1.child();
		h1.ecnmy();
		h1.aply();
		h1.srch();
		
		WebElement e1 = driver.findElement(By.xpath("(//button[@class='lato-black button buttonPrimary corp-btn fontSize13 text-uppercase  clusterBtn'])[1]"));
		Assert.assertEquals(e1.isDisplayed(), true, "sorry testcase ia failed");
	
	}
	

}
