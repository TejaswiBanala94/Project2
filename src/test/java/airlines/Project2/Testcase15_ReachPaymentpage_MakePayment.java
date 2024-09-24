package airlines.Project2;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility.Listeners.class)
public class Testcase15_ReachPaymentpage_MakePayment extends Lauch_Quit_Makemytrip
{
	@Test(retryAnalyzer=utility.RetryLogic.class)
	public void payment() throws InterruptedException, EncryptedDocumentException, IOException
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
		s1.skip_add_ons();
		
		PaymentsPage_Makemytrip p1 = new PaymentsPage_Makemytrip(driver);
		p1.proceedto_pay();
		p1.cardnumber("airlines",0,0);
		p1.nameoncard();
		p1.monthselection();
		p1.yearselection();
		p1.cvv("airlines",1,0);
		p1.billing_county();
		p1.billing_state();
		p1.billing_address();
		p1.billing_city();
		p1.pincode();
		p1.paynow();
		
		String expected_msg="This card is not allowed for this transaction";
		WebElement e1 = driver.findElement(By.xpath("//p[@class='red-text font11 append-top5 ']"));
		String Actual_msg=e1.getText();
		System.out.println(Actual_msg);
		Assert.assertEquals(Actual_msg, expected_msg, "Sorry the testcase is failed");
		
	}

}
