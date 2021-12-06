package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class videoplay 
{
ChromeDriver cd;
Properties pr;
public videoplay(ChromeDriver cd,Properties pr)
{
	this.cd=cd;
	this.pr=pr;
}
public void play() throws InterruptedException
{
	cd.findElement(By.id(pr.getProperty("play"))).click();
    Thread.sleep(5000);
}
}
