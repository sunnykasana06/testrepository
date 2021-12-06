package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.base;
import org.testing.Pages.login;
import org.testing.Pages.logout;
import org.testing.Pages.videoplay;
import org.testing.utilities.Logs;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC6 extends base
{
	@Test
	public void TC6() throws InterruptedException, IOException
	{
		Logs.takelogs("TC6", "Test Case 6 Started");
		login l=new login(cd,pr);
		l.signin("sunyt0306@gmail.com", "Sunyt12!@");
	    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\firstTC6.PNG");
	    videoplay v=new videoplay(cd,pr);
	    v.play();
	    Actions ac=new Actions(cd);
    ac.sendKeys(Keys.PAGE_DOWN).build().perform();
    Thread.sleep(4000);
    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\firstTC6.PNG");
    cd.findElement(By.xpath(pr.getProperty("commentbox"))).click();
    Thread.sleep(2000);
    cd.findElement(By.xpath(pr.getProperty("comment"))).sendKeys("testauto");
    Thread.sleep(4000);
    cd.findElement(By.xpath(pr.getProperty("commentbutton"))).click();
    Thread.sleep(3000);
    ScreenshotCapture.takescreenshot(cd, "D:\\screenshots\\finalTC6.PNG");
    WebElement icon=cd.findElement(By.xpath(pr.getProperty("icon")));
    icon.click();
    Thread.sleep(3000);
    logout l1=new logout(cd,pr);
    l1.signout();
    Logs.takelogs("TC1", "Test Case 6 Passed");
	}
}
