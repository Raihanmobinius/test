package Genercis;

import java.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelData  implements AutoConstant
{

	public static String getData(String sheetName,int rn,int cn)
	{
		try
		{
			System.out.println("Inside Getdata");
			FileInputStream fis =new FileInputStream(filepath);
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
			String data = sh.getRow(rn).getCell(cn).getStringCellValue();
			System.out.println(data);
			return data;	
		}
		catch (Exception e) 
		{
		return"";	
		}
	}
	public static int getRowCount(String File_path, String sheetName)
	{
		try
		{
			FileInputStream fis =new FileInputStream(File_path);
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
			int rc = sh.getLastRowNum();
			return rc;
		}
		catch (Exception e) 
		{
		return 0;	
		}
	}
	public static int getCellCount(String File_path, String sheetName, int rn)
	{
		try
		{
			FileInputStream fis =new FileInputStream(File_path);
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
			int cc = sh.getRow(rn).getLastCellNum();
			return cc;
		}	
		catch (Exception e) 
		{
		return 0;	
		}
		
	}	

		
}
