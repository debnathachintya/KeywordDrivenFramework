package executionEngine;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	
	public static void setExcelFile(String path, String sheetName) throws Exception {
		FileInputStream fs = new FileInputStream(path);
		workbook = new XSSFWorkbook(fs);
		sheet = workbook.getSheet(sheetName);
	}
	
	public static String getCellData(int rowNum, int colNum) throws Exception {
		cell = sheet.getRow(rowNum).getCell(colNum);
		String cellData = cell.getStringCellValue();
		return cellData;
	}
}