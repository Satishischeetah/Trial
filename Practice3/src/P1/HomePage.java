package P1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//p[@class='emergencyMsgContent']//span")
	WebElement image ;

	WebDriver driver = new ChromeDriver();
   //HomePage hp= PageFactory.initElements(driver, HomePage.class);
	 // or 
	public HomePage(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}

}
