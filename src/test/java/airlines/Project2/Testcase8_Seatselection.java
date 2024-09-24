package airlines.Project2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility.Listeners.class)
public class Testcase8_Seatselection extends Lauch_Quit_Makemytrip
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void seatselection() throws InterruptedException
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
		Thread.sleep(2000);
		h1.calenderarrow();
		Thread.sleep(2000);
		h1.dt();
		Thread.sleep(2000);
		h1.tvlr();
		Thread.sleep(2000);
		h1.adlt();
		//h1.child();
		h1.ecnmy();
		h1.aply();
		h1.srch();
		
		Searchresultspage_Makemytrip s1 = new Searchresultspage_Makemytrip(driver);
		s1.booknow();
		s1.booknowconfirm();
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> id =ids.iterator();
		String parentid = id.next();//parent id
		String childid = id.next();//1st child id
		
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		s1.addingadultdetails();
		//s1.adult1();
		Thread.sleep(1000);
		s1.firstname();
		Thread.sleep(1000);
		s1.lastname();
		Thread.sleep(1000);
		s1.gender1();
		s1.addingadultdetails();
		s1.firstname1();
		s1.lastname1();
		s1.gender2();
		Thread.sleep(2000);
		//s1.countrycode();
		s1.mobilenumber();
		s1.emailid();
		Thread.sleep(2000);
		s1.continue_select();
		s1.confirm_select();
		s1.seat1();
		s1.seat2();
		s1.continue_seat();
		
		WebElement e1 = driver.findElement(By.xpath("//li[@class='active appendRight25']"));
		Assert.assertEquals(e1.isDisplayed(), true, "sorry the testcase is failed");
	}


}
