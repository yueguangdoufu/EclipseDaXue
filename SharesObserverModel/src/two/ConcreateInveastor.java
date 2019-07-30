package two;

public class ConcreateInveastor implements Inveastor {
	
	private String name;
	public ConcreateInveastor(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public void response(Stock stock) {
		System.out.println("提示股民：" + name);
		System.out.println("-------股票" + stock.getStockName());
		System.out.println("价格波动幅度超过5%-------");
		System.out.println("新价格是：" + stock.getPrice() + ".");
	}

}
