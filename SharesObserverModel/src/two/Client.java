package two;

public class Client {

	public static void main(String args[]) {
		Inveastor inveastor1,inveastor2;
		inveastor1 = new ConcreateInveastor("股民甲");
		inveastor2 = new ConcreateInveastor("股民乙");
		
		Stock haier = new Stock("xxxx",20);
		haier.attach(inveastor1);
		haier.attach(inveastor2);
		
		haier.setPrice(25);
	}

}
