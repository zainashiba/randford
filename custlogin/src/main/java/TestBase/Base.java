package TestBase;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class Base {
	
	static Properties p;
	
	public static void loadproperty()
	{
		try {
			File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\config.properties");
			
			FileReader fr=new FileReader(f);
			
			p=new Properties();
			
			p.load(fr);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}
	
	public static String   config(String key)
	{
		loadproperty();
		String x=p.getProperty(key);
		return x;
	}
	
	

	public static void loadproperty1()
	{
		try {
			File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\OR.properties");
			
			FileReader fr=new FileReader(f);
			
			p=new Properties();
			
			p.load(fr);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}
	
	/*public static String   OR1(String key)
	{
		loadproperty1();
		String x=p.getProperty(key);
		return x;
	}
*/
	
	public static By getlocator(String key)
	{
		loadproperty1();
		
		By loc =null;
		String elename =p.getProperty(key);
		String loctype = elename.split(":")[0];
		String locval= elename.split(":")[1];
		
		switch(loctype)
		{
		case "id":
			
			loc= By.id(locval);
			break;
			
		case "name":
			
			loc = By.name(locval);
			
			break;
			
		case "xpath":
			
			loc = By.xpath(locval);
			break;
			
		case "linkText":
			
			loc= By.linkText(locval);
			break;
		}
		
		
		return loc;
	}
	
}
