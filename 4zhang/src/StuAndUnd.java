/**
 * 输出学生和本科生
 * @author 月光豆腐
 *
 */
public class StuAndUnd {
	public static void main(String [] args) {
		Undergraduate u1 = new Undergraduate();
		Undergraduate u2 = new Undergraduate("何俊杰",76,"大学生");
		Student s1 = new Student();
		Student s2 = new Student("唐佳瑶",99);
		u1.Show();
		u1.show();
		u2.Show();
		u2.show();
		s1.Show();
		s2.Show();
	}
}
