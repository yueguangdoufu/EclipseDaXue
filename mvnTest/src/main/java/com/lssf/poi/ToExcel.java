package com.lssf.poi;

import java.io.FileOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.lssf.model.Course;
import com.lssf.model.Student;

public class ToExcel {

	public static void CourseToExcel(List<Course> loc) throws ParseException {

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("课程表");
		HSSFRow row = sheet.createRow((int) 0);
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); 
		
		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue("课程号");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("教师号");
		cell.setCellStyle(style);
		cell = row.createCell((short) 2);
		cell.setCellValue("课程名称");
		cell.setCellStyle(style);

		for (int i = 0; i < loc.size(); i++) {
			row = sheet.createRow((int) i + 1);
			Course c = (Course) loc.get(i);
			// 第四步，创建单元格，并设置值
			row.createCell((short) 0).setCellValue(c.getCno());
			row.createCell((short) 1).setCellValue(c.getTno());
			row.createCell((short) 2).setCellValue(c.getCname());
		}
		// 第六步，将文件存到指定位置
		try {
			FileOutputStream fout = new FileOutputStream("Course.xls");
			wb.write(fout);
			fout.close();
			System.err.println("excel 创建完成！");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static void CreateExcelDemo1() throws ParseException {
		List list = new ArrayList();
		Student user1 = new Student(1, "张三");
		Student user2 = new Student(2, "李四");
		Student user3 = new Student(3, "王五");
		list.add(user1);
		list.add(user2);
		list.add(user3);

		// 第一步，创建一个webbook，对应一个Excel文件
		HSSFWorkbook wb = new HSSFWorkbook();
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
		HSSFSheet sheet = wb.createSheet("学生表一");
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
		HSSFRow row = sheet.createRow((int) 0);
		// 第四步，创建单元格，并设置值表头 设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue("学号");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("姓名");
		cell.setCellStyle(style);

		// 第五步，写入实体数据 实际应用中这些数据从数据库得到，

		for (int i = 0; i < list.size(); i++) {
			row = sheet.createRow((int) i + 1);
			Student stu = (Student) list.get(i);
			// 第四步，创建单元格，并设置值
			row.createCell((short) 0).setCellValue((double) stu.getId());
			row.createCell((short) 1).setCellValue(stu.getName());
		}
		// 第六步，将文件存到指定位置
		try {
			FileOutputStream fout = new FileOutputStream("students.xls");
			wb.write(fout);
			fout.close();
			System.err.println("excel 创建完成！");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
