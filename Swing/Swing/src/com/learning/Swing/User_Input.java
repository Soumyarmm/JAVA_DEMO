package com.learning.Swing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class RadioDemo extends JFrame
{
	
		JTextField t1;
		JButton b;
		JRadioButton r1,r2;
		JLabel l;
		JCheckBox c1,c2;
		public RadioDemo()
		{
			t1=new JTextField(15);
			b=new JButton("ok");
			r1=new JRadioButton("Male");
			r2=new JRadioButton("Female");
			l=new JLabel("Greeting");
			c1=new JCheckBox("Dancing");
			c2=new JCheckBox("Singing");
			
			
			ButtonGroup bg=new ButtonGroup();
			bg.add(r1);
			bg.add(r2);
			
			add(t1);
		
			add(r1);
			add(r2);
			add(c1);
			add(c2);
			add(b);
			add(l);
			
			c1.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e) 
				{
					System.out.println("Dancer");
					
				}
				
			});
			
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					String name=t1.getText();
					if(r1.isSelected())
					{
						name="mr." + name;
				
					}
					else
					{
						name="ms." + name;
					}
					if(c1.isSelected())
					{
						name=name + "Dancer";
					}
					if(c2.isSelected())
					{
						name=name + "Singer";
					}
					l.setText(name);
					
				}
			});
			
			
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
	}


public class User_Input {

	public static void main(String[] args) {
		RadioDemo r= new RadioDemo();

	}

}
