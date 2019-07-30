
public class Demo {
	public static void main(String [] args) {
		Player p = new Player();
		try {
			p.play(15);
		}catch(Exception e){
			
			System.out.println(e.getMessage()); 
		}
	}
}
