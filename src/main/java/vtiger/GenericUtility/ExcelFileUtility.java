package vtiger.GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	public String readDataFromExcel(String sheet, int row,int cel) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IConstantsUtility.excelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		Row rw=sh.getRow(row);
		Cell ce=rw.getCell(cel);
		String value=ce.getStringCellValue();
		return value;
		
		}
	public int getRowCount(String sheet) throws IOException
	{
		FileInputStream fis=new FileInputStream(IConstantsUtility.excelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		int rowCount=sh.getLastRowNum();
		wb.close();
		return rowCount;
	}

public void writeDataIntoExcel(String sheet, int row, int cel, String value) throws IOException
{
	FileInputStream fis=new FileInputStream(IConstantsUtility.excelFilePath);
	Workbook wb=WorkbookFactory.create(fis);
	Row rw=wb.getSheet(sheet).getRow(row);
	rw.createCell(cel).setCellValue(value);
	FileOutputStream fos=new FileOutputStream(IConstantsUtility.excelFilePath);
	wb.write(fos);
	System.out.println(value+" -->data added");
	wb.close();
	
}





}
