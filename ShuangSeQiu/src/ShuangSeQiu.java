
import java.util.Random;

public class ShuangSeQiu{
	
	public static  void run() {
		
		Random random = new Random();
		String s = new String();
		for(int i = 0;i < 6;i++) {
			int num = random.nextInt(32);
			num++;
			if(num >= 1&& num <= 9) {
				s = s + " 0" + num;
			}else {
				s = s + " " + num;
			}
		}
		
		int num2 = random.nextInt(16);
		num2++;
		if(num2 >= 1&& num2 <= 9) {
			s = s + " 0" + num2;
		}else {
			s = s + " " + num2;
		}
		
		System.out.println(s);
	}
	
	public static void main(String [] args) {
		run();
	}
}