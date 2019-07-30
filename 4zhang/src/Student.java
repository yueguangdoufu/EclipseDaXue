/**
 * 学生类
 * @author 月光豆腐
 *
 */
public class Student {
	private String name="郑帅";
	private int age = 89;
	
	public Student() {
	}
	
	public Student(String name, int age) {
		this.name=name;
		this.age = age;
		
	}
	
	public void Show() {
		System.out.printf("Name:%s	Age:%d	",name,age);
	}
	/*
	public static void main(String [] args) {
		Student s1 = new Student();
		Student s2 = new Student("hjj",77);
		
		s1.Show();
		s2.Show();
		
	}
*/
}
