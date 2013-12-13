package com.brendanzhao.monkeydash;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public abstract class AbstractConsumable {

	private int x;
	private int y;
	private Rectangle hitBox;
	private BufferedImage image;
	
	public AbstractConsumable(int x, int y, BufferedImage image) {
		this.x = x;
		this.y = y;
		this.image = image;
		updateHitBox();
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getWidth() {
		return image.getWidth();
	}
	
	public int getHeight() {
		return image.getHeight();
	}
	
	public Rectangle getHitBox() {
		return hitBox;
	}
	
	public void updateHitBox() {
		hitBox = new Rectangle(x, y, getWidth(), getHeight());
	}
		
	public BufferedImage getImage() {
		return image;
	}
	
	public abstract int consume();
}