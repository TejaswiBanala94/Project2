package airlines.Project2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchresultspage_Makemytrip 
{
	ChromeDriver driver;
	@FindBy(xpath="(//button[@class='lato-black button buttonPrimary corp-btn fontSize13 text-uppercase  clusterBtn'])[1]")
	WebElement booknow_button;
	
	@FindBy(xpath="(//button[@class='lato-black button buttonPrimary buttonBig fontSize14'])[2]")
	WebElement booknow_confirm_button;
	
	@FindBy(xpath="//button[@class='addTravellerBtn'][1]") //button[@class='addTravellerBtn']
	WebElement add_adult_button;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement adult1_checkbox;
	
	@FindBy(xpath="(//input[@placeholder=\"First & Middle Name\"])[1]")
	WebElement firstname_textfeild;
	@FindBy(xpath="(//input[@placeholder=\"First & Middle Name\"])[2]")
	WebElement firstname1_textfeild;
	
	@FindBy(xpath="(//input[@placeholder='Last Name'])[1]")
	WebElement lastname_textfeild;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[2]")
	WebElement lastname1_textfeild;
	
	@FindBy(xpath="(//label[@tabindex=\"1\"])[1]")
	WebElement gender_check;
	@FindBy(xpath="(//label[@tabindex=\"1\"])[2]")
	WebElement gender2_check;
	
	@FindBy(xpath="//div[@class='dropdown__single-value css-1uccc91-singleValue']") 
	WebElement countrycode_dropdown;
	
	@FindBy(xpath="//input[@placeholder='Mobile No']")
	WebElement mobilenumber_textfeild;
	@FindBy(xpath="//input[@placeholder=\'Email\']")
	WebElement email_textfeild;
	
	@FindBy(xpath="//button[.='Continue']")
	WebElement continue_button;
	@FindBy(xpath="//button[.='CONFIRM']")
	WebElement confirm_button;
	
	@FindBy(xpath="(//div[@class='seatBlock pointer'])[36]")
	WebElement seat1_select;
	@FindBy(xpath="(//div[@class='seatBlock pointer'])[37]")
	WebElement seat2_select;
	@FindBy(xpath="//button[.='Continue']")
	WebElement contiueseat_button;
	@FindBy(xpath="//span[@class='linkText']")
	WebElement skip_addons_button;
	
	public void skip_add_ons() throws InterruptedException
	{
		Thread.sleep(3000);
		skip_addons_button.click();
	}
	
	public void continue_seat() throws InterruptedException
	{
		Thread.sleep(3000);
		contiueseat_button.click();
	}
	
	public void seat2() throws InterruptedException
	{
		Thread.sleep(3000);
		seat2_select.click();
	}
	public void seat1() throws InterruptedException
	{
		Thread.sleep(3000);
		seat1_select.click();
	}
	
	public void confirm_select()
	{
		confirm_button.sendKeys(Keys.ENTER);
	}
	
	public void continue_select()
	{
		continue_button.sendKeys(Keys.ENTER);
	}
	
	public void mobilenumber()
	{
		mobilenumber_textfeild.sendKeys("3462389005"+Keys.TAB);
	}
	public void emailid()
	{
		email_textfeild.sendKeys("abc@gmail.com");
	}
	
	public void countrycode() throws InterruptedException  
	{
		countrycode_dropdown.click();
		Thread.sleep(4000);
		//countrycode_dropdown.sendKeys("India(91)");
		Thread.sleep(2000);
		countrycode_dropdown.sendKeys(Keys.ARROW_DOWN);
		countrycode_dropdown.sendKeys(Keys.ARROW_DOWN);
		countrycode_dropdown.sendKeys(Keys.ENTER);
		
	}
	
	public void gender1()  
	{
		gender_check.click();
	}
	public void gender2()  
	{
		gender2_check.click();
	}
	
	public void lastname()  
	{
		lastname_textfeild.sendKeys("AAlu"+Keys.TAB);
	}
	public void lastname1()  
	{
		lastname1_textfeild.sendKeys("Aabb"+Keys.TAB);
	}
	
	public void firstname() 
	{
		firstname_textfeild.sendKeys("Mona"+Keys.TAB);
	}
	public void firstname1() 
	{
		firstname1_textfeild.sendKeys("Rama"+Keys.TAB);
	}
	
	public void adult1() 
	{
		adult1_checkbox.click();
	}
	
	public void addingadultdetails() throws InterruptedException 
	{
		Thread.sleep(3000);
		add_adult_button.click();
	}
	
	public void booknowconfirm() throws InterruptedException
	{
		Thread.sleep(4000);
		booknow_confirm_button.click();
	}
	
	public void booknow() throws InterruptedException
	{
		Thread.sleep(4000);
		booknow_button.click(); 
	}
	
	public Searchresultspage_Makemytrip(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
