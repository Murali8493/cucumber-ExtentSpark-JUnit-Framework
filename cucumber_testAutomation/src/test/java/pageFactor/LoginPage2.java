package pageFactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	 @FindBy(how = How.XPATH, using = "//input[@id='hrone-username']")
	    WebElement username_TxtBox;
	
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'NEXT')]")
	    WebElement next_Btn;
	 
	    WebDriver driver;

	
	 public LoginPage2(WebDriver driver) 
	    {
	        this.driver=driver;
	        PageFactory.initElements( driver, this);
	    }
	 
	 public void enterUserName(String userName)
	 {
		 username_TxtBox.sendKeys(userName);
	 }
	 public void clickLoginBtn()
	 {
		 next_Btn.click();
	 }
}
