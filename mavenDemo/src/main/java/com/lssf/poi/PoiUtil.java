package com.lssf.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class PoiUtil {

	public static void main(String[] args) throws Exception, IOException {
	    Workbook wb = new HSSFWorkbook();
	    File f = new File("workbook.xls");
	    if(!f.exists()) {
	    	f.createNewFile();
	    }
	    
	    Sheet sheet1 = wb.createSheet("new sheet");
	    Row row = sheet1.createRow(1);
	    Cell cell = row.createCell(1);
	    cell.setCellValue("是个单元格");

	    sheet1.autoSizeColumn(1);
	
	    try  (OutputStream fileOut = new FileOutputStream(f)) {
	        wb.write(fileOut);
	    }
	    
	    System.out.println("创建成功");
	    
	    wb.close();
	}
}
