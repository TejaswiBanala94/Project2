package airlines.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility.Listeners.class)
public class Testcase7_Multicity_selection extends Lauch_Quit_Makemytrip
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void multicity_search() throws InterruptedException
	{
		Homepage_Makemytrip h1 = new Homepage_Makemytrip(driver);
		h1.usaselection(); 
		h1.usa();
		h1.usasel();
		h1.applyusa();
		h1.multicity();;
		h1.multicity_cityone();
		h1.start_trip();
		//h1.multicity_citytwo();
		Thread.sleep(2000);
		h1.end_trip();
		Thread.sleep(4000);
		h1.calenderarrow();
		Thread.sleep(2000);
		h1.dt();
		Thread.sleep(2000);
		h1.multicity_selection();
		Thread.sleep(2000);
		h1.multicityname();
		Thread.sleep(2000);
		h1.departure2();
		Thread.sleep(2000);
		h1.calenderarrow();
		h1.dt();
		//h1.dt2();
//		h1.tvlr();
//		Thread.sleep(2000);
//		h1.adlt();
//		h1.child();
//		h1.ecnmy();
//		h1.aply();
		h1.searchmulticity2();
		Thread.sleep(4000);
		WebElement e1 = driver.findElement(By.xpath("//div[@class='multiDropDownVal']"));
		Assert.assertEquals(e1.isDisplayed(), true, "sorry the testcase is failed");
	}
	

}
