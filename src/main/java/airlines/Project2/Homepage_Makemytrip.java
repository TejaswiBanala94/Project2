package airlines.Project2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Makemytrip 
{
	ChromeDriver driver;
	@FindBy(xpath="(//span[@class='tabsCircle appendRight5'])[1]")
	WebElement oneway_selection;
	@FindBy(xpath="//div[@class='whiteText makeFlex perfectCenter langSlct']")
	WebElement usa_selection_Dropdown;
	@FindBy(xpath="//div[@class='selectConWrap']")
	WebElement usa_select;
	@FindBy(xpath="(//p[@class='listRow'])[3]")
	WebElement usa_selecting;
	@FindBy(xpath = "//button[.='Apply']")
	WebElement applyusa_button;
	
	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement calender_arrow;
	
	
	
	
	@FindBy(xpath="(//span[@class='tabsCircle appendRight5'])[2]")
	WebElement roundtrip_selection;
	
	@FindBy(xpath="(//span[@class='tabsCircle appendRight5'])[3]")
	WebElement multicity_selection;
	
	@FindBy(id="fromCity")
	WebElement from_tf;
	
	@FindBy(id="toCity")
	WebElement to_tf;
	
	@FindBy(id="fromAnotherCity0")//input[@placeholder="From"]
	WebElement from_tf_formulticity;
	
	@FindBy(xpath="//input[@id='toAnotherCity0']")
	WebElement to_tf_formulticity;
	
	@FindBy(xpath="(//span[@class='lbl_input appendBottom10'])[3]")
	WebElement date_selct; 
	
	@FindBy(xpath="(//div[@class='DayPicker-Day'])[14]")
	WebElement date;
	@FindBy(xpath="(//div[@class='DayPicker-Day'])[15]")
	WebElement date2;
	
	@FindBy(xpath="//span[@class='lbl_input appendBottom5']")
	WebElement traveller; 
	
	@FindBy(xpath="//li[@data-cy=\"adults-2\"]") 
	WebElement adult_sel;
	
	@FindBy(xpath="//li[@data-cy=\"children-1\"]")
	WebElement child_sel;
	
	@FindBy(xpath="//li[@data-cy=\"travelClass-0\"]")
	WebElement economy_sel;
	
	@FindBy(xpath="//button[.='APPLY']")
	WebElement apply_btn;  
	
	@FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement search_btn; 
	
	@FindBy(xpath="//a[@class=\"primaryBtn font24 latoBold widgetSearchBtn  fltWidgetSearchBtnMultiCity\"]")
	WebElement search2_btn; 
	
	@FindBy(xpath="//input[@placeholder=\"From\"]")
	WebElement from_entr;
	
	@FindBy(xpath="(//div[@class='DayPicker-Day'])[23]")
	WebElement return_date;
	
	@FindBy(xpath="//input[@placeholder=\"To\"]")
	WebElement to_entr;
	
	@FindBy(xpath="(//span[@class='lbl_input appendBottom10'])[4]")
	WebElement return_selct;
	
	@FindBy(xpath="//li[@data-cy=\"travelClass-2\"]")
	WebElement business_sel;
	
	@FindBy(id="toAnotherCity1")
	WebElement anothercity_feild;
	
	@FindBy(xpath="//input[@placeholder=\"To\"]")   //input[@id="anotherDeparture 1"]
	WebElement anothercity_enter;
	
	@FindBy(xpath="(//span[@class='lbl_input appendBottom10'])[7]")
	WebElement another_departure;
	
	public void calenderarrow()
	{
		calender_arrow.click();
	}
	public void applyusa()
	{
		applyusa_button.click();
	}
	
	public void usaselection()
	{
		usa_selection_Dropdown.click();
		//usa_selection_Dropdown.click();
		
	}
	public void usa() throws InterruptedException
	{
		usa_select.click();
		Thread.sleep(2000);
//		usa_select.sendKeys(Keys.ARROW_DOWN);
//		usa_select.sendKeys(Keys.ARROW_DOWN);
//		usa_select.sendKeys(Keys.ARROW_DOWN);
//		usa_select.click();
//		usa_select.sendKeys(Keys.ENTER);
		
	}
	public void usasel() throws InterruptedException
	{
		usa_selecting.click();
		Thread.sleep(2000);
//		usa_selecting.sendKeys(Keys.ARROW_DOWN);
//    	usa_selecting.sendKeys(Keys.ARROW_DOWN);
		//usa_selecting.sendKeys(Keys.ENTER);
	}
	
	public void departure2()
	{
		another_departure.click();
	}
	public void searchmulticity2()
	{
		search2_btn.click();
	}
	
	public void multicity_selection()
	{
		anothercity_feild.click();
	}
	public void multicity_cityone()
	{
		from_tf_formulticity.click();
	}
	public void multicity_citytwo()
	{
		to_tf_formulticity.click();
	}
	public void multicityname() throws InterruptedException
	{
		anothercity_enter.sendKeys("Hyderabad");
		Thread.sleep(2000);
		anothercity_enter.sendKeys(Keys.ARROW_DOWN);
		anothercity_enter.sendKeys(Keys.ENTER);

	}
	
	public void business()
	{
		business_sel.click();
	}
	public void retundate()
	{
		return_selct.click();
	}
	
	public void retun()
	{
		return_date.click();
	}
	
	public void start_trip() throws InterruptedException 
	{
		from_entr.sendKeys("Delhi");
		Thread.sleep(2000);
		from_entr.sendKeys(Keys.ARROW_DOWN);
		from_entr.sendKeys(Keys.ENTER);	
	} 
	
	public void end_trip() throws InterruptedException 
	{
		to_entr.sendKeys("Mumbai");
		Thread.sleep(2000);
		to_entr.sendKeys(Keys.ARROW_DOWN);
		to_entr.sendKeys(Keys.ENTER);	
	}
	
	public void srch() 
	{
		search_btn.click();	
	}
	
	public void aply() 
	{
		apply_btn.click();	
	}
	
	public void ecnmy() 
	{
		economy_sel.click();	
	}
	
	public void child() 
	{
		child_sel.click();	
	}
	
	public void adlt() 
	{
		adult_sel.click();	
	}
	public void tvlr() 
	{
		traveller.click();	
	}
	
	public void dt() 
	{
		date.sendKeys(Keys.ENTER);	
	}
	public void dt2() 
	{
		date2.sendKeys(Keys.ENTER);		
	}
	
	public void dtslct() 
	{
		date_selct.click();	
	}
	
	public void oneway() 
	{
		oneway_selection.click();
		//oneway_selection.sendKeys(Keys.TAB);
	}
	public void roundtrip() 
	{
		roundtrip_selection.click();
	}
	public void multicity() 
	{
		multicity_selection.click();
	}
	public void frm() throws InterruptedException 
	{
		from_tf.click();
//		if(from_tf.isDisplayed()&& from_tf.isEnabled()==true)
//		{
//			from_tf.click();
//			from_tf.sendKeys("Mumbai");
//			from_tf.sendKeys(Keys.ARROW_DOWN);
			//from_tf.sendKeys(Keys.ENTER);
			//from_tf.sendKeys(Keys.RETURN);
//		}
//		Actions a1=new Actions(driver);
//		a1.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).build().perform();
		//String s1=from_tf.getAttribute("value");
		//System.out.println(s1);
//			if(from_tf.getAttribute("value") != null)
//			{
//				System.out.println("aaa"+from_tf.getAttribute("value"));
//				from_tf.click();
//				from_tf.clear();
//				Thread.sleep(2000);
//				from_tf.sendKeys("kkk"+ Keys.ARROW_DOWN);
//				from_tf.sendKeys(Keys.ENTER);
//				//System.out.println("bbb"+from_tf.getAttribute("value"));
//				//from_tf.sendKeys(Keys.ENTER);
//			}else {
//				System.out.println("else");
//				from_tf.sendKeys("delhi"+Keys.ARROW_DOWN);
//				from_tf.sendKeys(Keys.ENTER);
//			}
	}

	public void to() 
	{
		to_tf.click();
//		to_tf.sendKeys("mumbai");	
//		to_tf.sendKeys(Keys.ARROW_DOWN);
//		to_tf.sendKeys(Keys.ENTER);
	}
	public Homepage_Makemytrip(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
