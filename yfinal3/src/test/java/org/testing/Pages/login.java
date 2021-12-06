package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login 
{
ChromeDriver cd;
Properties pr;
public login(ChromeDriver cd,Properties pr)
{
	this.cd=cd;
	this.pr=pr;
}
public void signin(String username, String passwrod) throws InterruptedException
{
	WebElement signin=cd.findElement(By.xpath(pr.getProperty("signin")));
	signin.click();
	Thread.sleep(3000);
	WebElement email=cd.findElement(By.xpath(pr.getProperty("email")));
	email.sendKeys("sunyt0306@gmail.com");
    WebElement next = cd.findElement(By.xpath(pr.getProperty("next")));
    next.click();
    Thread.sleep(3000);
	WebElement password=cd.findElement(By.xpath(pr.getProperty("password")));
    password.sendKeys("Sunyt12!@");
    WebElement next1 = cd.findElement(By.xpath(pr.getProperty("next1")));
    next1.click();
    Thread.sleep(3000);
}
}
