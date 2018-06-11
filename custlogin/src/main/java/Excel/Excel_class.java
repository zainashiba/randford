package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.testng.Assert;

//import java.io.IOException;
import TestBase.Base;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
//import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_class extends Base{
	
	
	public static String folderpath=config("excelfolderpath");
	
	static Sheet sh;
	static Workbook wb;
	 static WritableWorkbook wwb;
	 static WritableSheet wsh;
	public static void excelconnection(String filename,String sheetname) 
	{
		try {
			File f=new File(folderpath+filename);
			
			 wb=Workbook.getWorkbook(f);
			
			 sh=wb.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public static  int   rcount()
	{
		int i=sh.getRows();
		return i;
	}
	public static  int   ccount()
	{
		int i=sh.getColumns();
		return i;
	}
	public static String  readdata(int col,int row)
	{
		String x=sh.getCell(col, row).getContents();
		return x;
	}
	
	
	
	public static void outputexcelconnection(String ifilename,String ofilename,String sheetname)
	{
		
		try {
			FileInputStream fis=new FileInputStream(folderpath+ifilename);
			
			 wb=Workbook.getWorkbook(fis);
				
			 sh=wb.getSheet(sheetname);
			 
			 FileOutputStream fos=new FileOutputStream(folderpath+ofilename);
			 
			wwb=Workbook.createWorkbook(fos, wb);
			 
			 wsh=wwb.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	/*public static void writeToExcel() {

	try {
		File file = new File("C:\\Users\\Asif\\workspace\\Javajdk\\training\\custlogin\\folder\\data_write.xls");

		WritableWorkbook wb = Workbook.createWorkbook(file);
		wb.createSheet("Sheet1", 0);
		WritableSheet ws = wb.getSheet(0);
		
		Label data1 = new Label(0, 0, "Result");
		ws.addCell(data1);
		
		Label data2 = new Label(1,0, "Pass");
		ws.addCell(data2);
		
		wb.write();
		wb.close();

		System.out.println("\n File created !");

	} catch (Exception e) {
		// TODO Auto-generated catch block
		
	}
*/
	
	public static void writedata(int col,int row,String data)
	{
		try {
			Label l=new Label(col, row, data);
			wsh.addCell(l);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void saveworkbook()
	{
		try {
			wwb.write();
			
			wwb.close();
			wb.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	

