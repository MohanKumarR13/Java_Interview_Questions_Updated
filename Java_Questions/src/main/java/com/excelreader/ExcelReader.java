package com.excelreader;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
	public static void main(String[] args) {
		String excelFilePath = "path/to/your/excel/file.xlsx"; // Change this to your Excel file path
		try {
			FileInputStream fis = new FileInputStream(new File(excelFilePath));
			Workbook workbook = new XSSFWorkbook(fis); // For .xlsx files

			Sheet sheet = workbook.getSheetAt(0); // Read the first sheet

			for (Row row : sheet) {
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t");
						break;
					default:
						System.out.print("Unknown Type\t");
					}
				}
				System.out.println(); // New line after each row
			}

			workbook.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}