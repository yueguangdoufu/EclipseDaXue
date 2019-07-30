/**
 * 主参数
 * @author 月光豆腐
 *
 */
public class MyConponent {
	private int left;
	private int top;
	private int width;
	private int height;
	public MyConponent(int x,int y, int w, int h) {
		this.setLeft(x);
		this.setTop(y);
		this.setWidth(w);
		this.setHeight(h);
	}
	
	public void paint() {
		System.out.println("\t左："+left+"\t上："+top+"\t宽："+width+"\t高："+height);
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
