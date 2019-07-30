
public class String2 {
	
	public static void zhuanhuan() {
		String  s1 = "Hello World";
		StringBuffer s = new StringBuffer("");
		for(int i = s1.length()-1; i >= 0; i --) {
			char ch = s1.charAt(i);
			if(ch >= 'A'&&ch <= 'Z') {
				String s2 = String.valueOf(ch);
				s2 = s2.toLowerCase();
				s.append(s2);
			}else if(ch >= 'a'&& ch <= 'z') {
				String s2 = String.valueOf(ch);
				s2 = s2.toUpperCase();
				s.append(s2);
			}else {
				String s2 = String.valueOf(ch);
				s.append(s2);
			}
		}
		System.out.println(s.toString());
	}
	
	public static void main(String [] args) {
		zhuanhuan();
	}
}
