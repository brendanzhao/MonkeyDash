package com.brendanzhao.monkeydash;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MonkeyDashView extends JPanel {

	private MonkeyDashModel model;
	
	public MonkeyDashView(MonkeyDashModel model) {
		this.model = model;
		setPreferredSize(new Dimension(Constants.CLIENT_WIDTH, Constants.CLIENT_HEIGHT));
		setDoubleBuffered(true);
		setFocusable(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(model.getBackgroundImage(), 0, 0, null);

		for(Block b : model.getBlocks()) {
			g.drawImage(Block.getImage(), b.getX(), b.getY(), null);
		}
		
		g.drawImage(model.getMonkey().getCurrentImageFrame(), model.getMonkey().getX(), model.getMonkey().getY(), null);
	}
}