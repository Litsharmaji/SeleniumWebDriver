package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationTestMyProfile {

	WebDriver driver;
	
	 By MyProfileUserName = By.xpath("//span[contains(text(),'csr complex')]");

	 public AutomationTestMyProfile(WebDriver driver){

	     this.driver = driver;}
	 

	 public String getMyProfileDashboardUserName(){

	          return driver.findElement(MyProfileUserName).getText();
}
}