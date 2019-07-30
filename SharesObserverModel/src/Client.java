
public class Client {
	public static void main(String[] args) {
		Shares petroChina = new PetroChina();
		Stock s1 = new StockA();
		Stock s2 = new StockB();
		
		petroChina.attach(s1);
		petroChina.attach(s2);
		
		petroChina.ntify();
	}
}
