import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class Text extends JFrame  {
	
	JCheckBox ym = new JCheckBox("羽毛球");
	JCheckBox pp = new JCheckBox("乒乓球");
	JCheckBox cg = new JCheckBox("唱歌");
	
		
	JRadioButton na = new JRadioButton("男");
	JRadioButton nv = new JRadioButton("女");
	
	JTextArea t = new JTextArea();


		public Text (){
			JFrame f = new JFrame();
			f.setLayout(new BorderLayout());
			f.setSize(600, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
			f.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			JPanel p1 = new JPanel();
			p1.setLayout(new FlowLayout());
			f.add(p1,BorderLayout.NORTH);
			
			ButtonGroup group = new ButtonGroup();
			JLabel xq = new JLabel("兴趣");
			p1.add(xq);
			p1.add(ym);
			p1.add(pp);
			p1.add(cg);
			JLabel xb = new JLabel("性别");
			group.add(na);
			group.add(nv);
			p1.add(xb);
			p1.add(na);
			p1.add(nv);
			
			ym.addActionListener(my);
			pp.addActionListener(my);
			cg.addActionListener(my);
			na.addActionListener(my);
			nv.addActionListener(my);
			
			JScrollPane sp = new JScrollPane(t);
			sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			f.add(sp,BorderLayout.CENTER);
			
		}
		
		MyListener my = new MyListener();
		public class MyListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str1 = "你的兴趣是：";
				String str2 = "你的性别是：";
				if(ym.isSelected()){
					str1 = str1 + ym.getText()+" ";
					t.setText(str1);
				}
				if(pp.isSelected()){
					str1 = str1 + pp.getText()+" ";
					t.setText(str1);
				}
				if(cg.isSelected()){
					str1 = str1 + cg.getText()+" ";
					t.setText(str1);
				}
				if(e.getSource().equals(na)){
					str2 = str1 + str2 + na.getText();
					t.setText(str2);
				}else if(e.getSource().equals(nv)){
					str2 =str1 + str2 + nv.getText();
					t.setText(str2);
				}
				
				//str1 = "你的兴趣是：";
				//str2 = "你的性别是：";
				
			}
		}
		
		public static void main(String [] args){
			new Text();
			
		}
		
}
