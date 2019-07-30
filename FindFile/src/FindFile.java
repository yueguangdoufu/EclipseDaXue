import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.concurrent.BrokenBarrierException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class FindFile extends JFrame implements ActionListener{
	
	JFrame f = new JFrame();
	//Container cp = getContentPane();
	JTextArea t = new JTextArea();
	JTextArea t1 = new JTextArea();
	JPanel jpanel = new JPanel();
	JButton button = new JButton("查找");
	
	int len = 0;
	
	public void UI(){
		f.setLayout(new BorderLayout());
		jpanel.setLayout(new BorderLayout());
		f.add(jpanel,BorderLayout.NORTH);
		jpanel.add(t,BorderLayout.CENTER);
		jpanel.add(button,BorderLayout.EAST);
		button.addActionListener(this);
		//f.add(t1);
		JScrollPane jsp = new JScrollPane(t1);
		jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		f.add(jsp);
		
	}
	
	public FindFile(){
		super();
		this.UI();
		f.setSize(600, 600);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		String path = t.getText();
		File file = new File(path);
		if("查找".equals(cmd)) {
			t1.setText(null);
			len = 0;
			fileDir(file);
		}
		
	}
	
	public void fileDir(File dir){
		if(dir.isDirectory()) {
			File[] files = dir.listFiles();
			len++;
			for(File file : files) {
				String s1 = new String();
				String s;
				String s2;
				for(int i = 0 ;i < len ; i++) {
					s1 = "  " + s1;
				}
				s = file.getName();
				s2 = s1 + s + "\r\n";
				t1.setText(t1.getText() + s2);
				if(file.isDirectory()) {
					fileDir(file);
					len--;
				}
			}
		}else {
			t1.setText("文件不存在!");
		}
	}
	
	public static void main(String [] args){
		new FindFile();
	}
}
