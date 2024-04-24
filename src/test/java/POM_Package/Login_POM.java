package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_POM {
/////
	WebDriver  Localdriver;
	
	public Login_POM(WebDriver remotedriver) 
	{
		Localdriver = remotedriver;
		PageFactory.initElements(remotedriver,this);
		
	}
	
	@FindBy(how = How.XPATH, using="//input[@id='email']")
	private WebElement email;     
	                               
	@FindBy(how=How.XPATH, using  ="//input[@id='password']")
	private WebElement password;  
	//captcha                        
	@FindBy(how= How.XPATH, using ="(//div[@role='presentation'])[1]")
	private WebElement capcha;    
	                              
	@FindBy(how= How.XPATH, using ="//button[@id='loginButton']")
	private WebElement login;     
	                              
	public void setEmail(String EmailID) {
		email.sendKeys(EmailID);
		
	}
	public void setpass(String userPass) {
		password.sendKeys(userPass);
		
	}
	public void Click_capcha() {
		capcha.click();
		
	}
	
	public void loginbutton() {
		login.click();
		
	}
	
	
	
}
