package com.brendanzhao.monkeydash;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MonkeyDashView extends JPanel {

	private MonkeyDashModel model;
	
	public MonkeyDashView(MonkeyDashModel model) {
		this.model = model;
		this.setPreferredSize(new Dimension(Constants.CLIENT_WIDTH, Constants.CLIENT_HEIGHT));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.model.getBackgroundImage(), 0, 0, null);
	}
}