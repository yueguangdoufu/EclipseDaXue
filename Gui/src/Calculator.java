
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;

import java.awt.*;

@SuppressWarnings("serial")
public class Calculator extends JFrame{
	
  //设置版面
  	Container m = this.getContentPane();
  	JPanel p1 = new JPanel(new BorderLayout());
  	JPanel p2 = new JPanel(new BorderLayout());
  	JPanel p3 = new JPanel(new GridLayout(4,4,10,10));
  	JButton b = new JButton("clear");
  	JButton btn [] = new JButton[16];
  	JTextField t = new JTextField();

	public Calculator () {
		//总大小
		this.setTitle("计算器");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		//面板布局
		m.setLayout(new BorderLayout());
		m.add(p1,BorderLayout.NORTH);
		m.add(p2,BorderLayout.CENTER);
		//显示框和清除建
		p1.add(t,BorderLayout.CENTER);
		p1.add(b,BorderLayout.EAST);
		//按键界面
		p2.add(p3);
		String name [] ={
				"7","8","9","+",
				"4","5","6","-",
				"1","2","3","*",
				"0",".","/","="
		};
		for(int i = 0; i < 16;i++) {
			btn [i] = new JButton(name[i]);
			btn [i].addActionListener(new MyListener());
			p3.add(btn[i]);
		}
		//文本框右对齐
		t.setHorizontalAlignment(JTextField.RIGHT);
		
		b.addActionListener(new MyListener());
		t.addActionListener(new MyListener());
		
	}
	
	//	创建监听器

	public class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = e.getActionCommand();
			handle(s);
		}
		
	}
	
	//	按键处理
	Boolean startNum = true;
	String num1,num2,op;
	public void handle(String s) {
		// 数字
		if("0123456789.".indexOf(s)>=0) {
			if(startNum) {
				String old = t.getText();
				String newValue = old + s;
				t.setText(newValue);
				
			}else {
				startNum = true;
				t.setText(s);
			}
		}
		// 符号
		if("+-*/".indexOf(s)>=0) {
			startNum = false;
			if(op == null) {
				num1 = t.getText();
				op = s;
			}else {
				num2 = t.getText();
				String result = cal(num1,num2,op);
				num1 = result;
				t.setText(result);
				op = s;
			}
		}
		
		// =
		if("=".equals(s)) {
			startNum = false;
			num2 = t.getText();
			String result = cal(num1,num2,op);
			num1 = result;
			t.setText(result);
			op = null;
		}
		// <-
		if("clear".equals(s)) {
			startNum = true;
			num1 =null;
			num2 =null;
			op =null;
			t.setText(num1);
		}
	}
	
	//	运算
	 
	private String cal(String num1, String num2, String op) {
		// TODO Auto-generated method stub
   		double n1 = Double.parseDouble(num1);
   		double n2 = Double.parseDouble(num2);
   		double sum = 0;
   		String m;
   		switch (op) {
		case "+":
			sum = n1 + n2;
			break;
		case "-":
			sum = n1 - n2;
			break;
		case "*":
			sum = n1 * n2;
			break;
		case "/":
			if(n2 == 0) {
				sum = 0;
			}else {
				sum = n1 / n2;
			}
			break;
		}
   		m = String.valueOf(sum);
		return m;
	}


	public static void main(String [] args) {
		Calculator f = new Calculator();
		f.setVisible(true);
	}
}
