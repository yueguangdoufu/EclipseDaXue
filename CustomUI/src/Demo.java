
public class Demo {
	public static void main(String [] args) {
		MyLabe1 ml = new MyLabe1("你不该",20,30,50,10);
		MyTextField mt = new MyTextField("你赶快",false,90,78,36,89);
		MyButton mb = new MyButton("节能降耗",true,29, 89, 67, 87);
		
		ml.paint();
		mt.paint();
		mb.paint();
		
		
	}

}
