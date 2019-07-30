package date100;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Demo {
	
	public static void main(String [] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE,100);
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(df.format(calendar.getTime()));
	}
	
}
