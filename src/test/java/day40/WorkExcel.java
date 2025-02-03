package day40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkExcel {
	
	public static void main (String args []) throws IOException
	{
		//opening the excel and sheet working on rows and columns
		FileInputStream file=new FileInputStream (System.getProperty("user.dir")+("\\testdata\\Anannyachecklist.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook (file);
		XSSFSheet sheet=workbook.getSheet("Sheet3");
		int rows=sheet.getLastRowNum();
		int clmn=sheet.getRow(1).getLastCellNum();
		System.out.println("Column"+clmn);
		System.out.println("Rows"+rows);
		System.out.println(System.getProperty("user.dir"));
		for (int r=0; r <= rows; r++)
		{
			XSSFRow crRows=sheet.getRow(r);
			for (int c=0; c< clmn; c++)
			{
				XSSFCell cell=crRows.getCell(c);
				//System.out.println("\t");

				System.out.print(cell.toString()+"\t");
			}
			System.out.println();

		}
		workbook.close();
		file.close();
		
		//Writing into excel sheet with creating a sheet 
		FileOutputStream file2=new FileOutputStream (System.getProperty("user.dir")+("\\testdata\\checklist.xlsx"));
		XSSFWorkbook workbook2=new XSSFWorkbook ();
		XSSFSheet sheet_1=workbook2.createSheet("Data");
		XSSFRow row1=sheet_1.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(123);
		row1.createCell(2).setCellValue("Programing");	
		row1.createCell(3).setCellValue("08/01/2025");
		
		XSSFRow row2=sheet_1.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(321);
		row2.createCell(2).setCellValue("Programing");	
		row2.createCell(3).setCellValue("08/01/2025");
		 
		XSSFRow row3=sheet_1.createRow(2);
		row3.createCell(0).setCellValue("Python");
		row3.createCell(2).setCellValue("Programing");	
		row3.createCell(3).setCellValue("08/01/2025");	
		
		workbook2.write(file2);
		workbook2.close();
		file2.close();
		
		//Writing into excel sheet with creating a sheet with dynamic  
		FileOutputStream file3=new FileOutputStream (System.getProperty("user.dir")+("\\testdata\\checklistdynamic.xlsx"));
		XSSFWorkbook workbook3=new XSSFWorkbook ();
		XSSFSheet sheet_3=workbook3.createSheet("Data2");

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter how many rows");
		int trows=sc.nextInt();
		System.out.println("Enter how many coliumns");
		int tclmn=sc.nextInt();

		for (int r=0; r <= trows; r++)
		{
			XSSFRow crRowsDyn=sheet_3.createRow(r);
			for (int c=0; c< tclmn; c++)
			{
				XSSFCell cell=crRowsDyn.createCell(c);
				cell.setCellValue(sc.next());
			}

		}
       workbook3.write(file3);
       workbook3.close();
		file3.close();
				
	}

}
