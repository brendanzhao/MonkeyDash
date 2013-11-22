package com.brendanzhao.monkeydash;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
	
	MonkeyDashModel model;
	MonkeyDashController controller;
	MonkeyDashView view;
	
	public MainFrame() {
		super(Constants.GAME_NAME);
		model = new MonkeyDashModel();
		view = new MonkeyDashView(model);
		controller = new MonkeyDashController(model, view);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		add(view, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	    setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();	
	}
}
