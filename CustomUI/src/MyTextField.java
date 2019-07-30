/**
 * 
 * @author 月光豆腐
 *
 */
public class MyTextField extends MyConponent {
	
	public MyTextField(String text,boolean readonly,int x, int y, int w, int h) {
		super(x, y, w, h);
		this.text = text;
		this.readonly = readonly;
	}
	
	private String text = "NULL";
	private boolean readonly = true;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isReadonly() {
		return readonly;
	}
	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}
	
	public void paint() {
		super.paint();
		System.out.println("\t文本："+text+"\t只读："+readonly);
	}
	
	
	

}
