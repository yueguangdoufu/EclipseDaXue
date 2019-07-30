/**
 * 标签
 * @author 月光豆腐
 *
 */
public class MyLabe1 extends MyConponent{
	private String caption = "NULL";
	
	public MyLabe1(String caption,int x, int y, int w, int h) {
		super(x, y, w, h);
		this.caption = caption;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public void paint() {
		super.paint();
		System.out.println("\t字幕："+caption);
	}
	
	
	
	
}
