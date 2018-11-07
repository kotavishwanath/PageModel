package utils;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlsFiles {
	public XSSFWorkbook wb;
	public XSSFSheet sh;
	public ReadXlsFiles(String path, String sheetName){
		try {
			if (wb == null){
				String xlPath = path;//"/Users/VishwanathKota/Documents/WorkSpace/TC_001.xlsx";
				File src = new File(xlPath);
				FileInputStream stream = new FileInputStream(src);
				
//				wb = new HSSFWorkbook(stream);
				wb = new XSSFWorkbook(stream);
//			    sh = wb.getSheet(sheetName);
			}	
			 sh = wb.getSheet(sheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTestData(String columnName){
		int cc = findColumnNumber(columnName);
		String value = sh.getRow(1).getCell(cc).getStringCellValue();
		return value;
	}
	
	public String getTestData(String columnName, String row){
		int cc = findColumnNumber(columnName);
		int rn = findRowNumber(row);
		String value = sh.getRow(rn).getCell(cc).getStringCellValue();
		return value;
	}
	
	public int findColumnNumber(String name){
		int columnCount = sh.getRow(0).getLastCellNum();
		String str = "";
		for (int i=0;i<=columnCount;i++){
			str = sh.getRow(0).getCell(i).getStringCellValue();
			if (str.equalsIgnoreCase(name)){
				return i;
			}
		}
		return 0;
	}
	
	public int findRowNumber(String name){
		int columnCount = sh.getLastRowNum();
		String str = "";
		for (int i=0;i<=columnCount;i++){
			str = sh.getRow(i).getCell(0).getStringCellValue();
			if (str.equalsIgnoreCase(name)){
				return i;
			}
		}
		return 0;
	}
	
}
