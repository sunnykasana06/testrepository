package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertion.assertions;
import org.testing.Base.base;
import org.testing.Pages.login;
import org.testing.Pages.logout;
import org.testing.Pages.videoplay;
import org.testing.utilities.Logs;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC4 extends base
{
	@Test
	public void TC5() throws InterruptedException, IOException
	{
		String expectedurl=" ";
		Logs.takelogs("TC4", "Test Case 4 Started");
		login l=new login(cd,pr);
		l.signin("sunyt0306@gmail.com", "Sunyt12!@");
	    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\firstTC4.PNG");
	    videoplay v=new videoplay(cd,pr);
	    v.play();
	    assertions.assertion1(expectedurl, cd.getCurrentUrl());   //Soft Assertion Check
	    cd.findElement(By.xpath(pr.getProperty("like"))).click();
	    Thread.sleep(2000);
	    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\finalTC4.PNG");
	    WebElement icon=cd.findElement(By.xpath(pr.getProperty("icon")));
	    icon.click();
	    Thread.sleep(3000);
	    logout l1=new logout(cd,pr);
	    l1.signout();
	    Logs.takelogs("TC4", "Test Case 4 Passed"); 
	    
	}
}
