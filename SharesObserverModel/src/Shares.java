import java.util.ArrayList;

public abstract class Shares {
	protected ArrayList stocks = new ArrayList<>();
	
	public void attach(Stock stock) {
		stocks.add(stock);
	}
	
	public void detach(Stock stock) {
		stocks.remove(stock);
	}
	
	public abstract void ntify();
}
