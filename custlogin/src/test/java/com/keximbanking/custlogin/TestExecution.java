package com.keximbanking.custlogin;

import org.apache.commons.mail.EmailException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Excel.Excel_class;
import Utility.validation;


public class TestExecution extends Reprository{
	
	//@Parameters({"browser"})
	@BeforeTest
	public void verify_launch()
	{
		launch();
	}
	
	
	@Test(priority=1)
	public void verify_login()
	{
		login();
	}
	
	@Test(priority=2)
	public void branch_clicking()
	{
		click_branch();
	}
	
	/*@Test(priority=3)
	public void delete_op()
	{
		del_edit();
	}*/
	
	/*@DataProvider(name="branch")
	public Object[][] verify_excelcontent()
	{
		return excelcontent("data.xls", "Sheet1");
	}
	*/

	
	/*@Test(priority=3,dataProvider="branch")
	public void newbranch_creation(String bname,String address,String zipcode,String country,String state,String city)
	{
		create_newbranch(bname,address,zipcode,country,state,city);
	}*/
	
	/*@Test(priority=3)
	public void write_excel()
	{
		Excel_class.writeToExcel();
	}*/
	
	
	/*@Test
	public void newrole_creation()
	{
		
		create_newrole();
	}*/
	/*	@AfterMethod
	public void tearDown(ITestResult testResult) throws EmailException
	{
		
		if(testResult.getStatus()==ITestResult.FAILURE){
			
			
			
			System.out.println("Test failed and Email sent");
			
		}
		driver.quit();
	}*/
	
	@Test(priority=3)
	public void verify_content()
	{
		Excel_class.excelconnection("data.xls", "Sheet1");
		
		Excel_class.outputexcelconnection("data.xls", "output.xls", "Sheet1");
		
		int j=Excel_class.ccount();
		
		for(int i=1;i<Excel_class.rcount();i++)
		{
			//String bname=Excel_class.readdata(0, i);
			create_newbranch(Excel_class.readdata(0, i), Excel_class.readdata(1, i), Excel_class.readdata(2, i), Excel_class.readdata(3, i), Excel_class.readdata(4, i), Excel_class.readdata(5, i));
			
			String txt = driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			
			if(txt.contains("created Succesufully"))
			{
				Excel_class.writedata(j++, i, "Record created:"+txt);
				j--;
			}
			else if(txt.contains("already Exist"))
			{
				Excel_class.writedata(j++, i, "Record exist:"+txt);
				j--;
			}
			else
			{
				Excel_class.writedata(j++, i, "alert is n/a");
				j--;
			}
			
			
			
		}
		Excel_class.saveworkbook();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
