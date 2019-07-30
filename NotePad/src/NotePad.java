import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.*;

public class NotePad extends JFrame implements ActionListener {
	String path;
	JTextArea t = new JTextArea();
			
	public NotePad() {
		//	设置主面板
		JFrame frame = new JFrame();
		//frame.setLayout(new BorderLayout());
		frame.setTitle("记事本");
		frame.setSize(600,600);
		frame.setLocationRelativeTo(null);
				
		//	添加菜单
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu file = new JMenu("文件");
		JMenu edit = new JMenu("编辑");
		JMenu format = new JMenu("格式");
		JMenu view = new JMenu("查看");
		JMenu help = new JMenu("帮助");
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(format);
		menuBar.add(view);
		menuBar.add(help);
		
		//	文件
		String [] f = {"新建","打开...","保存","另存为...","页面设置...","打印...","退出"};
		
		for(int i = 0; i < 7; i ++) {
			JMenuItem menuItem = new JMenuItem(f[i]);
			file.add(menuItem);
			menuItem.addActionListener(this);
		}
		
		//	编辑
		String [] e = {"撤销","剪切","复制","粘贴","删除",
				"查找...","查找下一个","替换...","转到...",
				"全选","时间/日期"};
		
		for( int i = 0; i < 11 ;i ++) {
			edit.add(new JMenuItem(e[i]));
		}
		
		//	格式
		String [] fo = {"自动换行","字体..."};
		
		for(int i = 0 ; i < 2 ; i++) {
			format.add(new JMenuItem(fo[i]));
		}
		
		//	查看
		view.add(new JMenuItem("状态栏"));
		
		//	帮助
		help.add(new JMenuItem("查看帮助"));
		help.add(new JMenuItem("关于记事本"));
		
		JPanel p = new JPanel(new BorderLayout());
		p.add(t);
		frame.add(p);
		
		// 滚动条
		JScrollPane sp = new JScrollPane(t);
		sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		p.add(sp);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	//	保存
	public void save() {
		if(path == null) {
			saveAs();
		}else {
		String text = t.getText();
		try {
			FileWriter fw = new FileWriter(new File(path));
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println(text);
			fw.write(text);
			fw.close();
			bw.close();
			this.setTitle(path);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	//  另存为
	
	public void saveAs() {
		String text;
		
		FileDialog fd = new FileDialog(NotePad.this,"另存为...",FileDialog.SAVE);
		fd.setFile("*.txt");
		fd.setVisible(true);
		
		path = fd.getDirectory();
		text = fd.getFile();
		
		try {
			FileWriter fw = new FileWriter(path + text);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(t.getText());
			pw.flush();
			pw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//	打开
	public void open() {
		JFileChooser jfc = new JFileChooser();
		
		int returnVal = jfc.showOpenDialog(null);
		
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			path = file.getAbsolutePath();
			this.setTitle(path);
			try {
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String s1 = null;
				String s2 = new String();
				while((s1 = bufferedReader.readLine())!= null) {
					System.out.println(s1);
					s2 = s2 + s1 + "\r\n" ;
				}
				t.setText(s2);
				fileReader.close();
				bufferedReader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if("退出".equals(cmd)) {
			System.exit(0);
		}
		if("打开...".equals(cmd)) {
			open();
		}
		if("保存".equals(cmd)) {
			save();
		}
		if("另存为...".equals(cmd)) {
			saveAs();
		}
		
	}
	
	public static void main(String [] args) {
		new NotePad();
	}
}
