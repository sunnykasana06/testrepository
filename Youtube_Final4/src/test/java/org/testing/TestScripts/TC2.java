package org.testing.TestScripts;

import org.openqa.selenium.By.ByXPath;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.base;
import org.testing.Pages.login;
import org.testing.Pages.logout;
import org.testing.utilities.Logs;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC2 extends base
{
	@Test
	public void TC2() throws InterruptedException, IOException
	{
		Logs.takelogs("TC2", "Test Case 2 Started");
		login l=new login(cd,pr);
		l.signin("sunyt0306@gmail.com", "Sunyt12!@");
	    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\firstTC2.PNG");
	    WebElement history=cd.findElement(By.xpath(pr.getProperty("history")));
	    history.click();
	    Thread.sleep(3000);
	    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\finalTC2.PNG");
	    WebElement icon=cd.findElement(By.xpath(pr.getProperty("icon")));
	    icon.click();
	    Thread.sleep(3000);
	    logout l1=new logout(cd,pr);
	    l1.signout();
	    Logs.takelogs("TC2", "Test Case 2 Passed");
	}
}
