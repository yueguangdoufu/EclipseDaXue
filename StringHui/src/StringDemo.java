import java.util.Scanner;

public class StringDemo {
	
	public static void hui() {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 ;
		StringBuffer s = new StringBuffer("");
		s.append(s1);
		s.reverse();
		s2 = s.toString();
		scanner.close();
		if(s2.equals(s1)) {
			System.out.println("字符串"+s1+"是回型字符串");
		}else {
			System.out.println("字符串"+s1+"不是回型字符串");
		}
	}
	public static void main(String [] args) {
		hui();
	}
}
