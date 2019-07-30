package geiDingShiJian;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;

public class jiDate {
	
	
	
	public static void shuRu() {
		//Date date = new Date();
		//System.out.println(date);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入时间(yyyy-MM-dd):");
		String inTime = scanner.nextLine();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;
		try {
			date1 = dateFormat.parse(inTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date = new Date();
		
		//System.out.println(date);
		Long days = (date1.getTime()-date.getTime())/(24*60*60*1000);
		Long d = (date1.getTime()-date.getTime())%(24*60*60*1000);
		
		if(d != 0 && days > 0) {
			days++;
		}
		
		System.out.println("相差："+days+"天");
	}
	
	public static void main(String [] args) {
		shuRu();
	}
}
