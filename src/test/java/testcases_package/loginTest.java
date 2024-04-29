package testcases_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import testcases_package.Base_class;

public class loginTest extends Base_class {

	

	@Test()
	void test001() throws InterruptedException {
	
		for(int i=1; i<=20; i++) {
			//driver.get(url2);
Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
			WebElement logina = driver.findElement(By.xpath("//input[@name='email']"));
			logina.sendKeys("satish.gaware@grovetech.in");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
			WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
			pass.sendKeys("Satu@321");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='loginButton']"));
		button.click();
		
		Thread.sleep(3000);
		//button.click();
		driver.navigate().refresh();
		Thread.sleep(2000);
//		Thread.sleep(50000000);			
			
		}
		}
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='login']")));
//		WebElement loginq = driver.findElement(By.xpath("//a[@id='login']"));
//		loginq.click();

	
	}	

