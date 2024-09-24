package airlines.Project2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.DDT;

public class PaymentsPage_Makemytrip 
{
	ChromeDriver driver;
	@FindBy(xpath="//button[@class='lato-black button buttonPrimary extraPadBtn fontSize16 appendTop20']")
	WebElement proceedtopay_button;
	@FindBy(xpath="//input[@id='cardNumber']")
	WebElement cardnumber_tf;
	@FindBy(xpath="//input[@id='nameOnCard']")
	WebElement nameoncard_tf;
	@FindBy(name="expiryMonth")
	WebElement month_dropdown;
	@FindBy(name="Year")
	WebElement year_dropdown;
	@FindBy(xpath="//input[@id='cardCvv']")
	WebElement cvv_tf;
	@FindBy(name="billingCountry")
	WebElement billing_country_tf;
	@FindBy(xpath="//input[@id='billingState']")
	WebElement billing_state_tf;
	@FindBy(xpath="//input[@id='billingAddress']")
	WebElement billing_address_tf;
	@FindBy(xpath="//input[@id='billingCity']")
	WebElement billing_city_tf;
	@FindBy(xpath="//input[@id='billingPinCode']")
	WebElement pincode_tf;
	@FindBy(xpath="//button[@class='prime__btn   paynow__btn font16']")
	WebElement paynow_button;

	
	public void paynow()
	{
		paynow_button.click();
	}
	
	public void pincode()
	{
		pincode_tf.sendKeys("68154"+Keys.TAB);
	}
	
	public void billing_city()
	{
		billing_city_tf.sendKeys("Omaha"+Keys.TAB);
	}
	
	public void billing_address()
	{
		billing_address_tf.sendKeys("Papailian Parkway"+Keys.TAB);
	}
	
	public void billing_state()
	{
		billing_state_tf.sendKeys("NE"+Keys.TAB);
	}
	
	public void billing_county()
	{
		Select s1 = new Select(billing_country_tf);
		s1.selectByVisibleText("American Samoa");
	}
	public void cvv(String sheet, int row ,int cell) throws EncryptedDocumentException, IOException
	{
		String cvvnum = DDT.cvvnumber(sheet, row, cell);
		cvv_tf.sendKeys(cvvnum);
		cvv_tf.sendKeys(Keys.TAB);
	}
	public void yearselection()
	{
		Select s1 = new Select(year_dropdown);
		s1.selectByVisibleText("2027");
	}
	
	public void monthselection()
	{
		Select s1 = new Select(month_dropdown);
		s1.selectByVisibleText("March (03)");
	}
	public void nameoncard()
	{
		nameoncard_tf.sendKeys("Mona"+Keys.TAB);
	}
	
	public void cardnumber(String sheet, int row ,int cell) throws InterruptedException, EncryptedDocumentException, IOException
	{
		String cnum = DDT.cardnumber(sheet,row,cell);
		cardnumber_tf.sendKeys(cnum);
		Thread.sleep(2000);
		cardnumber_tf.sendKeys(Keys.TAB);
	}
	public void proceedto_pay()
	{
		proceedtopay_button.click();
	}
	
	public PaymentsPage_Makemytrip(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
