package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base 
{
public ChromeDriver cd;
public Properties pr;

@BeforeMethod
public void before() throws InterruptedException, IOException
{
	System.setProperty("Webdriver.Chrome.Driver", "../Youtube_Final4/chromedriver.exe");
	cd=new ChromeDriver();
	File f=new File("../Youtube_Final4/object.properties");
	FileReader fr=new FileReader(f);
	pr=new Properties();
	pr.load(fr);
	cd.get("https://www.youtube.com/");
	cd.manage().window().maximize();
	Thread.sleep(2000);
}
@AfterMethod
public void close() 
{
	cd.close();
}
}
