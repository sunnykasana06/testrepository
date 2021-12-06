package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.base;
import org.testing.Pages.login;
import org.testing.Pages.logout;
import org.testing.Pages.videoplay;
import org.testing.utilities.Logs;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC5 extends base 
{
	@Test
	public void TC5() throws InterruptedException, IOException
	{
		Logs.takelogs("TC5", "Test Case 5 Started");
		login l=new login(cd,pr);
		l.signin("sunyt0306@gmail.com", "Sunyt12!@");
	    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\firstTC5.PNG");
	    videoplay v=new videoplay(cd,pr);
	    v.play();
	    cd.findElement(By.xpath(pr.getProperty("subscribe"))).click();
	    Thread.sleep(2000);
	    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\finalTC5.PNG");
	    WebElement icon=cd.findElement(By.xpath(pr.getProperty("icon")));
	    icon.click();
	    Thread.sleep(3000);
	    logout l1=new logout(cd,pr);
	    l1.signout();
	    Logs.takelogs("TC5", "Test Case 5 Passed");
	    
	}
}
