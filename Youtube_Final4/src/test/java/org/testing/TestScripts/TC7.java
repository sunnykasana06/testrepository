package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.base;
import org.testing.Pages.login;
import org.testing.Pages.logout;
import org.testing.utilities.Logs;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC7 extends base
{
	@Test
	public void login() throws InterruptedException, IOException
	{
		Logs.takelogs("TC7", "Test Case 7 Started");
		login l=new login(cd,pr);
		l.signin("sunyt0306@gmail.com", "Sunyt12!@");
	    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\firstTC7.PNG");
	    cd.findElement(By.xpath(pr.getProperty("watchlater"))).click();
	    Thread.sleep(2000);
	    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\finalTC7.PNG");
	    WebElement icon=cd.findElement(By.xpath(pr.getProperty("icon")));
	    icon.click();
	    Thread.sleep(3000);
	    logout l1=new logout(cd,pr);
	    l1.signout();
	    Logs.takelogs("TC1", "Test Case 7 Passed");
	    
	}
}
