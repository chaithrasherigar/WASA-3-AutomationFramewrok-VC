package vtiger.GenericUtilityPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import vtiger.GenericUtility.IConstantsUtility;

public class ExcelFileUtilityPractice 
{
	public String readDataFromExcelFileUtilityPractice(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fise=new FileInputStream(IConstantsUtilityPractice.excelFilePath);
Workbook wb=WorkbookFactory.create(fise);
Sheet sh=wb.getSheet(sheet);
Row rw=sh.getRow(row);
Cell ce=rw.getCell(cell);
String value=ce.getStringCellValue();
return value;
	}

public void writeDataToExcel(String sheet, int row,int cell, String value) throws EncryptedDocumentException, IOException
{
	FileInputStream fise=new FileInputStream(IConstantsUtilityPractice.excelFilePath);
	Workbook wb=WorkbookFactory.create(fise);
	Sheet sh=wb.getSheet(sheet);
Row rw=sh.getRow(row);
rw.createCell(cell).setCellValue(value);
FileOutputStream fos=new FileOutputStream(IConstantsUtility.excelFilePath);
wb.write(fos);
System.out.println("data added");
wb.close();
}

public int getRowCount(String sheet) throws EncryptedDocumentException, IOException
{
	FileInputStream fise=new FileInputStream(IConstantsUtilityPractice.excelFilePath);
	Workbook wb=WorkbookFactory.create(fise);
	Sheet sh=wb.getSheet(sheet);
	int rowCount=sh.getLastRowNum();
	return rowCount;
}

}
