package PageLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Reporter;

import TestBase.Base;

public class GenericPage extends Base{
	
	
	public static Select dropDownSelection(WebDriver driver, By prop)
	{
		Select x = new Select(driver.findElement(prop));
		return x;	
		//dropdown
	}
	
	public static Select ComparedropDownValues(WebDriver driver, By prop, String expectedVal)
	{
		Select x = new Select(driver.findElement(prop));
		
		List<WebElement> allOptions = x.getOptions();
		
		for(WebElement option:allOptions)
		{
			String actualVal = option.getText();
			
			if(actualVal.contains(expectedVal))
			{
				x.selectByVisibleText(expectedVal);
				break;
			}
		}
		return x;		
		
	}
    
	
	

}
