package day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	
	
public static void main(String[] args) throws IOException  {
	File excelFile = new File("./src/test/resources/data.xlsx");
	FileInputStream fis = new FileInputStream(excelFile);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	System.out.println(sheet.getPhysicalNumberOfRows());
	workbook.close();
	fis.close();
	
}
}
