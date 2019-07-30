package two;

import java.util.*;

//股票  观察目标
public  class Stock {
	
	protected ArrayList<Inveastor> inveastors;
	private String stockName;
	private double price;
	public Stock(String stockName,double price) {
		this.stockName = stockName;
		this.price = price;
		inveastors = new ArrayList<Inveastor>();
	}
	public void attach(Inveastor inveastor) {
		inveastors.add(inveastor);
	}
	public void detach(Inveastor inveastor) {
		inveastors.remove(inveastor);
		
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockName() {
		return this.stockName;
	}
	public void setPrice(double price) {
		double range = Math.abs(price-this.price)/this.price;
		this.price = price;
		if(range>=0.05) {
			this.notifyInvestor();
		}
	}
	public double getPrice() {
		return this.price;
	}
	private void notifyInvestor() {
		
		for(Object obj:inveastors) {
			((Inveastor)obj).response(this);
		}
	}

}
