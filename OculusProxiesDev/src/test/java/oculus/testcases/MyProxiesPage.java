package oculus.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyProxiesPage extends BaseClass {

	
//	@Test(priority = 1)
	@Test(enabled = false)
	void verify_price_get_changed_after_selected_larger_plan() throws Exception {
		driver.get(url2);
		WebElement myproxiespage =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()=' Try now '])[1]")));
		myproxiespage.click();
		
		WebElement config =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Configure '])[1]")));
		config.click();
		
		WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Detect my IP ']")));
		detectMyIP.click();
		Thread.sleep(1000);
		WebElement add =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Add ']")));
		add.click();
		
		WebElement getIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' 49.36.81.181 ']")));
		String actString = getIP.getText();

		try {
			AssertJUnit.assertEquals(actString, "49.36.81.181");
		} catch (Exception e) {
			System.out.println(e);
}	
		driver.navigate().back();
}	
	

	@Test(priority = 2)
	void verify_Try_Our_Document_Link_isFunctional() throws Exception {
		driver.get(MyPxoxiesPageurl);
		WebElement config =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Configure '])[1]")));
		config.click();
		String orgWindow = driver.getWindowHandle();
		WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='try our documentation']")));
		detectMyIP.click();
		for(String wind:driver.getWindowHandles()) {
			
			if(!wind.equals(orgWindow)) {
			driver.switchTo().window(wind);
			}
		}
		String curentURL = driver.getCurrentUrl();
		try {
			AssertJUnit.assertEquals(curentURL, "https://support.oculusproxies.com/hc/en-us/articles/23101526359835-Integrate-your-proxies-into-any-browser");
			driver.close();
			driver.switchTo().window(orgWindow);
		} catch (Exception e) {
			System.out.println(e);
		}			
}	
	@Test(priority = 3)
	void verify_NavigateToISPfronMyProxiesPageDropdoen() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement Add_Proxies =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add Proxies']")));
		Add_Proxies.click();	
		WebElement Static_Residential =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Static Residential']")));
		Static_Residential.click();	
				String curentURL =  driver.getCurrentUrl();				
				try {
					AssertJUnit.assertEquals(curentURL, "https://dev.oculusproxies.com/pricing/premium?planType=isp_proxy");							
				} catch (Exception e) {			
		}
	}
	@Test(priority = 4)
	void verify_NavigateToISPplusfronMyProxiesPageDropdoen() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement Add_Proxies =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add Proxies']")));
		Add_Proxies.click();	
		WebElement Static_Residential =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Static Residential Plus']")));
		Static_Residential.click();	
				String curentURL =  driver.getCurrentUrl();				
				try {
					AssertJUnit.assertEquals(curentURL, "https://dev.oculusproxies.com/pricing/premium?planType=isp_plus_proxy");					
				} catch (Exception e) {			
		}
	}
	@Test(priority = 5)
	void verify_NavigateToSharedDcfronMyProxiesPageDropdoen() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement Add_Proxies =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add Proxies']")));
		Add_Proxies.click();	
		WebElement Static_Residential =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/pricing/sharedDC?planType=shared_dc']")));
		Static_Residential.click();	
				String curentURL =  driver.getCurrentUrl();				
				try {
					AssertJUnit.assertEquals(curentURL, "https://dev.oculusproxies.com/pricing/sharedDC?planType=shared_dc");					
				} catch (Exception e) {			
		}
	}	
	@Test(priority = 6)
	void verify_NavigateToDedicatedDcfronMyProxiesPageDropdoen() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement Add_Proxies =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add Proxies']")));
		Add_Proxies.click();	
		WebElement Static_Residential =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/pricing/sharedDC?planType=dedicated_dc']")));
		Static_Residential.click();	
				String curentURL =  driver.getCurrentUrl();				
				try {
					AssertJUnit.assertEquals(curentURL, "https://dev.oculusproxies.com/pricing/sharedDC?planType=dedicated_dc");					
				} catch (Exception e) {			
		}
	}			
	@Test(priority = 7)
	void verify_PriceDropdown_valuesAndPrices_At_Time_Renew_sharedDC() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement SharedDC =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Shared Datacenter ']]//a[@id='tabaction'])[1]")));
		SharedDC.click();	
		WebElement renew =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Renew Now']")));
		renew.click();	
		WebElement SharedDCCard =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='plan-name']")));
		String actualTXT = SharedDCCard.getText();			
				try {
					AssertJUnit.assertEquals(actualTXT, "Shared Datacenter");					
				} catch (Exception e) {			
		}
	}			
	@Test(priority = 8)
	void verify_PriceDropdown_valuesAndPrices_At_Time_Renew_DedicatedDC() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement SharedDC =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Dedicated Datacenter ']]//a[@id='tabaction'])[1]")));
		SharedDC.click();	
		WebElement renew =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Renew Now']")));
		renew.click();	
		WebElement SharedDCCard =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='plan-name']")));
		String actualTXT = SharedDCCard.getText();			
				try {
					AssertJUnit.assertEquals(actualTXT, "Dedicated Datacenter");					
				} catch (Exception e) {			
		}
	}			
	@Test(priority = 9)
	void verify_PriceDropdown_valuesAndPrices_At_Time_Renew_ISP() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP) ']]//a[@id='tabaction'])[1]")));
		ISP.click();	
		WebElement renew =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Renew Now']")));
		renew.click();	
		WebElement SharedDCCard =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='plan-name']")));
		String actualTXT = SharedDCCard.getText();			
				try {
					AssertJUnit.assertEquals(actualTXT, "Static Residential (ISP)");					
				} catch (Exception e) {			
		}
	}		
	@Test(priority = 9)
	void verify_PriceDropdown_valuesAndPrices_At_Time_Renew_ISPplus() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement ISPplus =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP+) ']]//a[@id='tabaction'])[1]")));
		ISPplus.click();	
		WebElement renew =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Renew Now']")));
		renew.click();	
		WebElement SharedDCCard =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='plan-name']")));
		String actualTXT = SharedDCCard.getText();			
				try {
					AssertJUnit.assertEquals(actualTXT, "Static Residential (ISP+)");					
				} catch (Exception e) {			
		}
	}		
	@Test(priority = 10)
	void verify_samePageOpnedAfterClickingOnAdd_ISP() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP) ']]//a[@id='tabaction'])[1]")));
		ISP.click();	
		WebElement ADD =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Add']")));
		ADD.click();	
		String currentURL=	driver.getCurrentUrl();
				try {
					AssertJUnit.assertEquals(currentURL, "https://dev.oculusproxies.com/pricing/premium?planType=isp_proxy");					
				} catch (Exception e) {			
		}
	}
	@Test(priority = 11)
	void verify_samePageOpnedAfterClickingOnAdd_ISPplus() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement ISPplus =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP+) ']]//a[@id='tabaction'])[1]")));
		ISPplus.click();	
		WebElement ADD =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Add']")));
		ADD.click();	
		String currentURL=	driver.getCurrentUrl();
				try {
					AssertJUnit.assertEquals(currentURL, "https://dev.oculusproxies.com/pricing/premium?planType=isp_plus_proxy");					
				} catch (Exception e) {			
		}
	}	
	@Test(priority = 12)
	void verify_samePageOpnedAfterClickingOnAdd_SharedDc() throws Exception {
		driver.get(MyPxoxiesPageurl);
		
		WebElement SharedDc =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Shared Datacenter ']]//a[@id='tabaction'])[1]")));
		SharedDc.click();	
		WebElement ADD =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Add']")));
		ADD.click();	
		String currentURL=	driver.getCurrentUrl();
				try {
					AssertJUnit.assertEquals(currentURL, "https://dev.oculusproxies.com/pricing/sharedDC?planType=shared_dc");					
				} catch (Exception e) {			
		}
	}		
	@Test(priority = 13)
	void verify_samePageOpnedAfterClickingOnAdd_DedicatedDC() throws Exception {
		driver.get(MyPxoxiesPageurl);		
		WebElement DedicatedDC =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Dedicated Datacenter ']]//a[@id='tabaction'])[1]")));
		DedicatedDC.click();	
		WebElement ADD =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Add']")));
		ADD.click();	
		String currentURL=	driver.getCurrentUrl();
				try {
					AssertJUnit.assertEquals(currentURL, "https://dev.oculusproxies.com/pricing/sharedDC?planType=dedicated_dc");					
				} catch (Exception e) {			
		}
	}		
	@Test(priority = 14)
	void verify_configurePageIsOpninf_ISP() throws Exception {
		driver.get(MyPxoxiesPageurl);
		WebElement config =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP) ']]//td//span[text()=' Configure '])[1]")));
		config.click();
		WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='Configure Proxies']")));
		String currentTXT = detectMyIP.getText();
		try {
			AssertJUnit.assertEquals(currentTXT, "Configure Proxies");

		} catch (Exception e) {
			System.out.println(e);
		}			
}		
	@Test(priority = 15)
	void verify_configurePageIsOpninf_ISPplus() throws Exception {
		driver.get(MyPxoxiesPageurl);
		WebElement config =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP+) ']]//td//span[text()=' Configure '])[1]")));
		config.click();
		WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='Configure Proxies']")));
		String currentTXT = detectMyIP.getText();
		try {
			AssertJUnit.assertEquals(currentTXT, "Configure Proxies");

		} catch (Exception e) {
			System.out.println(e);
		}			
}	
	@Test(priority = 16)
	void verify_configurePageIsOpninf_SharedDc() throws Exception {
		driver.get(MyPxoxiesPageurl);
		WebElement config =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Shared Datacenter ']]//td//span[text()=' Configure '])[1]")));
		config.click();
		WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='Configure Proxies']")));
		String currentTXT = detectMyIP.getText();
		try {
			AssertJUnit.assertEquals(currentTXT, "Configure Proxies");

		} catch (Exception e) {
			System.out.println(e);
		}			
}	
	@Test(priority = 16)
	void verify_configurePageIsOpninf_DedicatedDc() throws Exception {
		driver.get(MyPxoxiesPageurl);
		WebElement config =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Dedicated Datacenter ']]//td//span[text()=' Configure '])[1]")));
		config.click();
		WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='Configure Proxies']")));
		String currentTXT = detectMyIP.getText();
		try {
			AssertJUnit.assertEquals(currentTXT, "Configure Proxies");

		} catch (Exception e) {
			System.out.println(e);
		}			
}	
	@Test(priority = 17)
	void verify_PaymentSetting_CTA_is_Functional() throws Exception {
		driver.get(MyPxoxiesPageurl);
		WebElement config =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Payment setting']")));
		config.click();
		WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Payment Methods']")));
		String currentTXT = detectMyIP.getText();
		try {
			AssertJUnit.assertEquals(currentTXT, "Payment Methods");
		} catch (Exception e) {
			System.out.println(e);
		}	
		WebElement CardName1 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-accordian//div//h5[contains(text(),'Card Name:')]")));
		String CardName = CardName1.getText();
		try {
			AssertJUnit.assertTrue(CardName.contains("Card Name"));
		} catch (Exception e) {
			System.out.println(e);
		}	
}		
	@Test(priority = 18)
	void verify_HistoryPageISPplus() throws Exception {
		driver.get(MyPxoxiesPageurl);
		WebElement ISPplus =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP+) ']]//a[@id='tabaction'])[1]")));
		ISPplus.click();
		WebElement MyHistory =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdow"
				+ "n-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Payment History']")));
		MyHistory.click();
	
		WebElement PaymentDate1 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//th[normalize-space()='Payment Date']")));
		String PaymentDate = PaymentDate1.getText();
		try {
			AssertJUnit.assertTrue(PaymentDate.contains("Payment Date"));
		} catch (Exception e) {
			System.out.println(e);
		}		
}		
	@Test(priority = 19)
	void verify_HistoryPageISP() throws Exception {
		driver.get(MyPxoxiesPageurl);
		WebElement ISPplus =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP) ']]//a[@id='tabaction'])[1]")));
		ISPplus.click();
		WebElement MyHistory =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdow"
				+ "n-menu dropdown-border show']//a[@class='submenu-color d-flex justify-content-between'][normalize-space()='Payment History']")));
		MyHistory.click();
	
		WebElement PaymentDate1 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//th[normalize-space()='Payment Date']")));
		String PaymentDate = PaymentDate1.getText();
		try {
			AssertJUnit.assertTrue(PaymentDate.contains("Payment Date"));
		} catch (Exception e) {
			System.out.println(e);
		}		
}			
	@Test(priority = 20)
    void verify_sameProductOnStripeAfterRenewISP() {
        try {
            driver.get(MyPxoxiesPageurl);
            WebElement ISPplus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP) ']]//a[@id='tabaction'])[1]")));
        ISPplus.click();

        WebElement renewOption = null;
        WebElement retryPaymentOption = null;

        try {
            retryPaymentOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[text()='Retry Failed Payment']")));
        } catch (NoSuchElementException e) {
            renewOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[text()='Renew Now']")));
        }

        if (retryPaymentOption != null) {
            retryPaymentOption.click();
            WebElement update2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div //button[text()=' Continue with previous incomplete payment ']")));
            update2.click();
        } else {
            renewOption.click();
            WebElement buyNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Buy now']")));
            buyNow.click();
            WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Pay Now']")));
            payNow.click();
        }

        WebElement update = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h5[contains(text(),' Static Residential (ISP) Proxies ')]")));
        String paymentDate = update.getText();

        AssertJUnit.assertEquals(paymentDate, "Static Residential (ISP) Proxies", "Payment date text mismatch");
    } catch (Exception e) {
        e.printStackTrace();
        AssertJUnit.fail("Exception occurred: " + e.getMessage());
    }
}
    @Test(priority = 21)
    void verify_sameProductOnStripeAfterRenewISPplus() {
        try {
            driver.get(MyPxoxiesPageurl);
            WebElement ISPplus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Static Residential (ISP+) ']]//a[@id='tabaction'])[1]")));
            ISPplus.click();

            WebElement renewOption = null;
            WebElement retryPaymentOption = null;

            try {
                retryPaymentOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[text()='Retry Failed Payment']")));
            } catch (NoSuchElementException e) {
                renewOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[text()='Renew Now']")));
            }

            if (retryPaymentOption != null) {
                retryPaymentOption.click();
                WebElement update2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div //button[text()=' Continue with previous incomplete payment ']")));
                update2.click();
            } else {
                renewOption.click();
                WebElement buyNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Buy now']")));
                buyNow.click();
                WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Pay Now']")));
                payNow.click();
            }

            WebElement update = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h5[contains(text(),' Static Residential (ISP+) Proxies ')]")));
            String paymentDate = update.getText();

            AssertJUnit.assertEquals(paymentDate, "Static Residential (ISP+) Proxies", "Payment Type text mismatch");
        } catch (Exception e) {
            e.printStackTrace();
            AssertJUnit.fail("Exception occurred: " + e.getMessage());
        }
    }    
    @Test(priority = 22)
    void verify_sameProductOnStripeAfterRenewSharedDc() {
        try {
            driver.get(MyPxoxiesPageurl);
            WebElement ISPplus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Shared Datacenter ']]//a[@id='tabaction'])[1]")));
            ISPplus.click();
            Thread.sleep(1000);
            WebElement renewOption = null;
            WebElement retryPaymentOption = null;

            try {
                retryPaymentOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[text()='Retry Failed Payment']")));
            } catch (NoSuchElementException e) {
                renewOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[text()='Renew Now']")));
            }

            if (retryPaymentOption != null) {
                retryPaymentOption.click();
                WebElement update2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div //button[text()=' Continue with previous incomplete payment ']")));
                update2.click();
            } else {
                renewOption.click();
                WebElement buyNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Buy now']")));
                buyNow.click();
                WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Pay Now']")));
                payNow.click();
            }

            WebElement update = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//span[contains(text(),'Plan name: Shared DC')]")));
            String paymentDate = update.getText();

            AssertJUnit.assertEquals(paymentDate, "Plan name: Shared DC(100GB),", "Payment date text mismatch");
        } catch (Exception e) {
            e.printStackTrace();
            AssertJUnit.fail("Exception occurred: " + e.getMessage());
        }
    }    
    @Test(priority = 23)
    void verify_sameProductOnStripeAfterRenewDedicatedDc() {
        try {
            driver.get(MyPxoxiesPageurl);
            WebElement ISPplus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table//tr[td[text()=' Dedicated Datacenter ']]//a[@id='tabaction'])[1]")));
            ISPplus.click();
            Thread.sleep(1000);
            WebElement renewOption = null;
            WebElement retryPaymentOption = null;

            try {
                retryPaymentOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[text()='Retry Failed Payment']")));
            } catch (NoSuchElementException e) {
                renewOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-shadow dropdown-menu dropdown-border show']//a[text()='Renew Now']")));
            }

            if (retryPaymentOption != null) {
                retryPaymentOption.click();
                WebElement update2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div //button[text()=' Continue with previous incomplete payment ']")));
                update2.click();
            } else {
                renewOption.click();
                WebElement buyNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Buy now']")));
                buyNow.click();
                WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Pay Now']")));
                payNow.click();
            }

            WebElement update = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//span[contains(text(),'Plan name: Dedicated DC')]")));
            String paymentDate = update.getText();

            AssertJUnit.assertEquals(paymentDate, "Plan name: Dedicated DC,", "Payment date text mismatch");
        } catch (Exception e) {
            e.printStackTrace();
            AssertJUnit.fail("Exception occurred: " + e.getMessage());
        }
	
    }
}
