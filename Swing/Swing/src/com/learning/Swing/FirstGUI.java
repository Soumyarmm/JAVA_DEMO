package com.learning.Swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Abc extends  JFrame{
	public Abc() {
		setLayout(new FlowLayout());
		JLabel l=new JLabel("Hello world :");
		JLabel l1=new JLabel("Welcome somu");
		
		add(l1);
		add(l);
		
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class FirstGUI {

	public static void main(String[] args) {
		Abc o=new Abc();
		

	}

}
