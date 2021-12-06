package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logout 
{
ChromeDriver cd;
Properties pr;
public logout(ChromeDriver cd,Properties pr)
{
	this.cd=cd;
	this.pr=pr;
}
public void signout() throws InterruptedException
{
	WebElement icon=cd.findElement(By.xpath(pr.getProperty("icon")));
    icon.click();
    Thread.sleep(3000);
    WebElement signout=cd.findElement(By.xpath(pr.getProperty("signout")));
    signout.click();
    Thread.sleep(2000);
}
}
