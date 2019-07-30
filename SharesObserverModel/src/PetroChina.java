
public class PetroChina extends Shares{

	@Override
	public void ntify() {
		System.out.println("中国石油股票跌落超过5%");
		System.out.println("-----------------");
		
		for(Object object:stocks) {
			((Stock)object).response();
		}
		
	}
	
}
