package airlines.Project2;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility.Listeners.class)
public class Testcase9_MultiplePassengers_Singlebooking extends Lauch_Quit_Makemytrip
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void multiplepassengers() throws InterruptedException
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
		h1.calenderarrow();
		//h1.dtslct();
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
		Thread.sleep(2000);
		//s1.countrycode();
		s1.mobilenumber();
		s1.emailid();
		Thread.sleep(2000);
		s1.continue_select();
		 
		String expected_msg="Please select/add 1 ADULT";
		WebElement e1 = driver.findElement(By.xpath("//font[.='Please select/add 1 ADULT']"));
		String Actual_msg=e1.getText();
		System.out.println(Actual_msg);
		Assert.assertEquals(Actual_msg, expected_msg, "Sorry the testcase is failed");
		
	}

}
