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

public class TC1 extends base
{
	@Test
	public void TC1() throws InterruptedException, IOException
	{
		Logs.takelogs("TC1", "Test Case 1 Started");
	login l=new login(cd,pr);
	l.signin("sunyt0306@gmail.com", "Sunyt12!@");
    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\firstTC1.PNG");
    WebElement explore=cd.findElement(By.xpath(pr.getProperty("explore")));
    explore.click();
    Thread.sleep(3000);
    WebElement trending=cd.findElement(By.xpath(pr.getProperty("trending")));
    trending.click();
    Thread.sleep(3000);
    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\finalTC1.PNG");
    logout l1=new logout(cd,pr);
    l1.signout();
    Logs.takelogs("TC1", "Test Case 1 Passed");
	}
}
