package com.cosmic.cubes.utils.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetData {
	
	public static void toExcel(String fileName, String sName, int rIndex, int cIndex, String data) {
		
		try {
			
				File f = new File("./test-data/"+fileName+".xls");
				FileInputStream fis = new FileInputStream(f);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sh = wb.getSheet(sName);
				Row r = sh.getRow(rIndex);
				Cell c = r.createCell(cIndex);
				c.setCellValue(data);
				FileOutputStream fos = new FileOutputStream(f);
				wb.write(fos);
				
		} catch (Exception e) {
			
		}
	}

}
