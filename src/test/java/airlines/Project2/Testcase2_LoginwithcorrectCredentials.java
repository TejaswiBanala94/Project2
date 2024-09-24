package airlines.Project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility.Listeners.class)
public class Testcase2_LoginwithcorrectCredentials extends Lauch_Quit_Makemytrip 
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void login()
	{
		Loginpage_Makemytrip l1 = new Loginpage_Makemytrip(driver);
		l1.loginorcreate();
		l1.login_with_mobileno();
		l1.checkbox_continue();
	}
	

}
