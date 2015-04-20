package com.creational.singleton.example1;

import java.awt.*;
import javax.swing.*;

public class mySingleton extends JFrame{
	
	private static mySingleton uniqueInstance;
	private static JPanel panel;
	private static JLabel label;
	private static String str="";
	
	public mySingleton(){
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setPreferredSize(new Dimension(200,100));
		pack();
		setLocation(750,280);
		java.util.Date  now = new java.util.Date();
		str = now.toString();
		label = new JLabel(str);
		add(label);
		setVisible(true);
		
	}
	
	public static mySingleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new mySingleton();
		}
		return uniqueInstance;
	}

}
