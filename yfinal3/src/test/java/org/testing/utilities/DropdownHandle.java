package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle 
{
public static void dropdownbyIndex(WebElement el, int index)
{
	Select s=new Select(el);
	s.selectByIndex(index);
}

public static void dropdownbyVisibletext(WebElement el, String visibletext)
{
	Select s=new Select(el);
	s.selectByVisibleText(visibletext);
}

public static void dorpdownbyValue(WebElement el, String value)
{
	Select s=new Select(el);
	s.selectByValue(value);
}
}
