package com.learning.Swing;
import java.awt.FlowLayout;

import javax.swing.*;

public class SwingDemo {

	public static void main(String[] args) {
		JFrame f= new JFrame("user form");
		f.setVisible(true);
		f.setSize(600,300);
		
		f.setLayout(new FlowLayout());
		JLabel l=new JLabel("user name:");
		f.add(l);
		JTextField t=new JTextField(20);
		f.add(t);
		
		JLabel l1=new JLabel("password:");
		f.add(l1);
		JTextField t1=new JTextField(20);
		f.add(t1);
		
		JButton b=new JButton("submit");
		f.add(b);

	}

}
