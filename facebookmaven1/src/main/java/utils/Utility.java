package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void captureScreen(int testID,WebDriver drive) throws IOException  
	{
		//name:Test-testID Date&Time
		//e.g:Test-123 31-10-2022 08 23 12
		//for random number will print on screenshot
		int c=ThreadLocalRandom.current().nextInt();
		System.out.println(c);
		//for system date and time will print on screen shot
		SimpleDateFormat date=new SimpleDateFormat("dd.MM.yyyy.HH.mm.SS");
		Date d=new Date();
		String a=date.format(d);
		
		File src=((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\screenshot\\test"+testID+a+".jpeg");
		FileHandler.copy(src, dest);	
		
	
}

	//sheet name ,rowno,cell no variables
	public static String getDataFromExcelSheet(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		//excel code
				String data="";
		String path="F:\\screenshot\\test\\excel11.xlsx";
		FileInputStream file=new FileInputStream(path);
		//method chaining break
		Workbook book=WorkbookFactory.create(file);
		Sheet sh=book.getSheet(sheet);
	    Row rw=	sh.getRow(row);
		Cell cl=rw.getCell(cell);
		
		try {
			data=cl.getStringCellValue();
			
		}
		catch(IllegalStateException e)
		{
			double value=cl.getNumericCellValue();
			//how to convert double to String
			//how to convert int to Sting
			//data=double to String;
			data=value+"";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
		return data;
		
	}
	}
	
	


