
public class Demo {
	public static void main(String [] args) {
		double zf;
		double yu;
		Square a = new Square();
		Circle b = new Circle();
		
		zf = a.area(3);
		yu = b.area(2);
		
		System.out.println("正方形面积："+zf+"圆面积："+yu);
	}

}
