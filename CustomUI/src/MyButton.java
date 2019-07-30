/**
 * 按钮
 * @author 月光豆腐
 *
 */
public class MyButton extends MyConponent implements Clickable{
	
	private String title = "NULL";
	private boolean enable = true;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public MyButton(String title, boolean enable,int x, int y, int w, int h) {
		super(x, y, w, h);
		this.title = title;
		this.enable = enable;
	}

	public void click() {
		System.out.println("\t点击.");
		
	}
	
	public void paint() {
		super.paint();
		System.out.println("\t标题："+title+"\t可用："+enable);
		this.click();
	}
	

}
