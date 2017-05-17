package Cleartrip.Trip;

import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ExcelLib 
{
	
	public static String getData(String path,String sheetNum,int rowNum,int cellNum )
	{
		try
		{
		FileInputStream fis=new FileInputStream(path);
		Workbook w1=WorkbookFactory.create(fis);
		String data=w1.getSheet(sheetNum).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
		}
		
		catch(Exception ev)
		{
			return"";
		}
		
	}
	
	public static void setData(String path,int rowNum,int cellNum ,String sheetNum,String data)
	{
		try
		{
		FileInputStream fis=new FileInputStream(path);
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet(sheetNum).getRow(rowNum).createCell(cellNum).setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(path);
		w1.write(fos);
		
		}
		
		catch(Exception ev)
		{
			Reporter.log("data not set properly");
		}
		
	}

}
