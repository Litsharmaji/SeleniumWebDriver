package OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMHomePage {

	WebDriver driver;

    By MyAccountName = By.xpath("//span[contains(text(),'csr complex')]");

public OHRMHomePage(WebDriver driver){

    this.driver = driver;}

    //Get the User name from Home Page

public String getHomePageDashboardUserName(){

         return driver.findElement(homePageUserName).getText();

        }
	
	
}
