package com.brendanzhao.monkeydash;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MonkeyDashView extends AbstractView {

	private BufferedImage background;
	private MonkeyDashController controller;
	
	public MonkeyDashView(MonkeyDashController controller) {			
		this.initializeComponents();
		this.controller = controller;
		this.controller.addView(this);
		this.repaint();
	}
	
	public void initializeComponents() {		
		this.setPreferredSize(new Dimension(Constants.CLIENT_WIDTH, Constants.CLIENT_HEIGHT));
		
		try {
			this.background = ImageIO.read(new File(Constants.BACKGROUND_IMAGE_URL));
		} catch (IOException e) {
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.background, 0, 0, null);
	}
	
	@Override
	public void modelPropertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub	
	}
}