package day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	
	
public static void main(String[] args) throws IOException  {
	File excelFile = new File("./src/test/resources/data.xlsx");
	System.out.println(excelFile.exists());
	FileInputStream fis = new FileInputStream(excelFile);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	 int noOfRows  = sheet.getPhysicalNumberOfRows();
	 int noOfCol = sheet.getRow(0).getLastCellNum();
	 
	 String [][] data = new String [noOfRows-1][noOfCol];
	for (int i=1;i<noOfRows-1;i++) {
		for (int j=1;j<noOfCol;j++) {
			DataFormatter df = new DataFormatter();
			 data [i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));
		}
	}
	workbook.close();
	fis.close();
}

}
