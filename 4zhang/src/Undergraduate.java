/**
 * 本科生类
 * @author 月光豆腐
 *
 */
public class Undergraduate extends Student{
	private String degree = "大学生";
	
	public Undergraduate() {
		super();
	}
	
	public Undergraduate(String name, int age, String degree) {
		super(name , age);
		this.degree = degree;
	}
	
	public void show() {
		System.out.printf("Degree:%s\n",degree);
	}
	/*
	public static void main(String [] args) {
		Undergraduate u1 = new Undergraduate();
		Undergraduate u2 = new Undergraduate("nj",83,"研究生");
		
		u1.Show();
		u1.show();
		u2.Show();
		u2.show();
		
		
		
	}
	*/
}
