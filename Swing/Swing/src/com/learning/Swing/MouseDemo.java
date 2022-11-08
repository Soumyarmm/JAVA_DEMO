package com.learning.Swing;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class Xyz extends JFrame
{
	public Xyz()
	{
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e)
			{
				int x=e.getX();
				int y=e.getY();
				System.out.println(x+ " " + y);
			}
		});
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class MouseDemo {

	public static void main(String[] args) {
		Xyz o= new Xyz();

	}
	

}
