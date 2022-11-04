package AutomationPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	String driverPath = "C:\\Users\\HemanSharma\\Desktop\\Selenium\\Selenium Jars\\geckodriver-v0.32.0-win64\\geckodriver.exe";
	
	 WebDriver driver;

	 AutomationTestIndexPage objindexpage;
	 AutomationTestLoginPage objloginpage;
	 AutomationTestMyProfile objmyprofile;
	 
	 @BeforeTest

	    public void setup(){

		System.setProperty("webdriver.gecko.driver", driverPath);
	        
	        driver = new FirefoxDriver();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	        driver.get("http://automationpractice.com/index.php");}
	        
     @Test
     
     public void validateSuccessfulLogin() throws InterruptedException {
    	
    	 
    	 objindexpage=new AutomationTestIndexPage(driver);
    	 objindexpage.clickindexPageSignIn();
    	 
    	 
    	 objloginpage=new AutomationTestLoginPage(driver);
    	 objloginpage.loginToAutomationTest("csr@gmail.com","complex");
    	 
    	 objmyprofile=new AutomationTestMyProfile(driver);
    	 objmyprofile.getMyProfileDashboardUserName();
    	 
    	 Assert.assertTrue(objmyprofile.getMyProfileDashboardUserName().matches(".*"));
    	 driver.close();
	        
}
}