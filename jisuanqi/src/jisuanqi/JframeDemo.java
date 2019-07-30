package jisuanqi;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
public class JframeDemo {
	public static void main(String [] args) {
		JFrame f = new JFrame("计算器");
		f.setLayout(new GridLayout(3,3));
		f.setSize(400,400);
		f.setLocation(300,200);
		for(int i = 1;i <= 9;i++) {
			Button btn = new Button("btn"+i);
			f.add(btn);
		}
		f.setVisible(true);
		
	}

}
