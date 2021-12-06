package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling 
{
	public static void readcell(int r, int c) throws IOException
	{
		File f=new File("../Youtube_Final4/XLSX1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook(fi);
		XSSFSheet ws=wk.getSheetAt(0);
		int row=ws.getPhysicalNumberOfRows();	
		if(r<=row)
		{
		XSSFRow xr=ws.getRow(r-1);
		int column=xr.getPhysicalNumberOfCells();
		   if(c<=column)
		    {
		     XSSFCell xc=xr.getCell(c-1);
		     System.out.println(xc.getStringCellValue());
		   }
		}
	}
	public static void readrow(int row) throws FileNotFoundException 
	{
		File f=new File("../Youtube_Final4/XLSX1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook();
		XSSFSheet ws=wk.getSheetAt(0);
		XSSFRow xr=ws.getRow(row);
		int cl=xr.getPhysicalNumberOfCells();
		int j=0;
		while(j<cl)
		{
			XSSFCell xc=xr.getCell(j);
			System.out.println(xc.getStringCellValue());
		}
	}
	public static void readrange(int r1,int r2) throws IOException
	{
		File f=new File("../Youtube_Final4/XLSX1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xw=new XSSFWorkbook(fi);
		XSSFSheet xs=xw.getSheetAt(0);
		int row=xs.getPhysicalNumberOfRows();
		for(int i=0;i<row;i++)
		{
			XSSFRow xr=xs.getRow(i);
			int column=xr.getPhysicalNumberOfCells();
			for(int j=0;j<column;j++)
			{
				XSSFCell xc=xr.getCell(j);
				
				if(i>=r1 && j<=r2)
					System.out.print(xc.getStringCellValue()+ " ");
				
			}
			System.out.println();
		}
		}	
}
