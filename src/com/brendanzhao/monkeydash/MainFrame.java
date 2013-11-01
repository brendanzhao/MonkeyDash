package com.brendanzhao.monkeydash;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
	
	MonkeyDashModel model;
	MonkeyDashController controller;
	MonkeyDashView view;
	
	public MainFrame() {
		super("Monkey Dash");
		controller = new MonkeyDashController();
		model = new MonkeyDashModel(controller);
		view = new MonkeyDashView(controller);
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.add(view, BorderLayout.CENTER);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();	
	}
}
