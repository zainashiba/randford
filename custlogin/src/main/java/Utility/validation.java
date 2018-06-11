package Utility;

import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Toolkit;
//import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
//import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
//import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Reporter;

public class validation {

	
	
	public static  boolean isTextPresent(WebDriver driver,String exp)
	{
		 //String s = driver.findElement(By.tagName("tbody")).getText();
	return driver.findElement(By.tagName("tbody")).getText().contains(exp);
	
    }
	
	
//	public static   boolean isTitlePresent(WebDriver driver,String expected)
//	{
//		return driver.getTitle().contains(expected);
//	}
//	
	public static   boolean alertPresent(WebDriver driver,String expect)
	{
		return driver.switchTo().alert().getText().contains(expect);
		
	}



	public static void takeScreenShot(WebDriver driver,String screenshotname)
	{
		
		
		
		try {
			BufferedImage image1 = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			 
			 ImageIO.write(image1, "png", new File("C://Users//Asif//workspace//Javajdk//training//custlogin//target//"+screenshotname+".png"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
	  }
	
    	
	
	/*public static void captureScreenshot(WebDriver driver, String screenshotName)
	{
		 try{
			
		 
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("C://Users//Asif//workspace//Javajdk//training//custlogin//target//"+screenshotName+".png"));
			
			
			System.out.println("Screenshot taken");
		 }
		 catch(Exception e){
			System.out.println("Exception while taking screenshot"+ e.getMessage());
			
		 }
				
	}*/
	public static void emailSending(WebDriver driver,String screenshotname) 
	{    
		  //captureScreenshot(driver, screenshotName);
		
	     takeScreenShot(driver, screenshotname);	
		
		 //Create the attachment
		 EmailAttachment attachment = new EmailAttachment();
		 attachment.setPath("C://Users//Asif//workspace//Javajdk//training//custlogin//target//"+screenshotname+".png");
		 attachment.setDisposition(EmailAttachment.ATTACHMENT);
		 attachment.setDescription("failed test screenshot");
		 attachment.setName("screenshot");

		 // Create the email message
		 MultiPartEmail email = new MultiPartEmail();
		 
		//Email email = new SimpleEmail();
		try {
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(993);
			email.setAuthenticator(new DefaultAuthenticator("zainashiba@gmail.com", ""));
			email.setSSLOnConnect(true);
			email.setFrom("zainashiba@gmail.com");
			email.setSubject("selenium test report");
			email.setMsg("This is a test mail from selenium");
			email.addTo("shibaasif27@gmail.com");
			
			
			// add the attachment
			email.attach(attachment);
			
			email.send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	

	

		 
	
	
    
	

