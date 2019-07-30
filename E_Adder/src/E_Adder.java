
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class E_Adder extends JFrame{
	
	Container cp = getContentPane();
	JLabel jlb2 = new JLabel();
	JTextField text1 = new JTextField("",10) ;
	JTextField text2 = new JTextField("",10);
	
	public E_Adder() {
		this.setSize(600,200);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setTitle("加法器");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		UI();
		
		
	}
	
	public void UI() {
		JPanel jp1 = new JPanel();
		jp1.setSize(150, 50);
		text1.setHorizontalAlignment(JTextField.RIGHT);
		jp1.add(text1);
		cp.add(jp1);
		
		JLabel jlb = new JLabel("+");
		jlb.setSize(50,50);
		cp.add(jlb);
		
		JPanel jp2 = new JPanel();
		jp2.setSize(150,50);
		text2.setHorizontalAlignment(JTextField.RIGHT);
		jp2.add(text2);
		cp.add(jp2);
		
		JButton jb = new JButton("=");
		jb.setSize(50,50);
		cp.add(jb);
		
		jlb2.setSize(100,50);
		cp.add(jlb2);
		
		MyListener my = new MyListener();
		jb.addActionListener(my);
		
		this.setVisible(true);
		
	}
	
	public class MyListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = new String();
			String s1 = text1.getText();
			String s2 = text2.getText();
			String b = e.getActionCommand();
			
			if(b.equals("=")) {
				int num = Integer.valueOf(s1) + Integer.valueOf(s2);
				s = String.valueOf(num);
				
				jlb2.setText(s);
				
			}
			//System.out.println(s1);
			//System.out.println(s2);
			//System.out.println(s);
			
		}
	}
	
	public static void main(String [] args) {
		new E_Adder();
		
	}
}
