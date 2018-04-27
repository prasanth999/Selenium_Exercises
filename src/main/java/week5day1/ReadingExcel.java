package week5day1;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public Object[][] readExcel() throws IOException {

		// a)open the excel from the path
		XSSFWorkbook wbook = new XSSFWorkbook("./data/TC001.xlsx");
		// b)Go to the sheet (ie) first sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		// c)Find the number of rows in the sheet
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		// d)Go to header row
		XSSFRow row = sheet.getRow(0);
		// e)finds the number of columns
		int columnCount = row.getLastCellNum();
		System.out.println(columnCount);
		Object[][] data = new Object[rowCount][columnCount];
		// f)Go to first data row

		for (int j = 1; j <= rowCount; j++) {
			XSSFRow row2 = sheet.getRow(j);
			for (int i = 0; i < columnCount; i++) {
				XSSFCell cell = row2.getCell(i);
				String stringCellValue = cell.getStringCellValue();
				data[j - 1][i] = stringCellValue;
				//System.out.println(stringCellValue);
			}
		}

		return data;

	}

}
