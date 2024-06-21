package oculus.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(oculus.utilities.listeners.class)

public class justTest extends BaseClass2 {
	

	@Test(priority =37)
	void verify_price_get_changed_after_selected_larger_plan() throws Exception {
		driver.get(url2);
		WebElement price =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
		price.click();

		WebElement dropdown =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='select-box']")));
		Select abcSelect= new Select(dropdown);
		abcSelect.selectByValue("83");
		
		WebElement titlePrice =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='size ng-star-inserted']")));
		String actualTxt = titlePrice.getText();
		try {
			Assert.assertEquals(actualTxt, "$0.25/GB");
		} catch (Exception e) {
			System.out.println("price does not get changed "+e);
		}
		
		
		
		
	
				
}	
    
}
