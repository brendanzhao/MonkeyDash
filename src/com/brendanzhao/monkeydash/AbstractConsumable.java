package com.brendanzhao.monkeydash;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public abstract class AbstractConsumable {

	protected int x;
	protected int y;
	protected Rectangle hitBox;
	
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
		return getImage().getWidth();
	}
	
	public int getHeight() {
		return getImage().getHeight();
	}
	
	public Rectangle getHitBox() {
		return hitBox;
	}
	
	public void updateHitBox() {
		hitBox = new Rectangle(x, y, getWidth(), getHeight());
	}
		
	public abstract BufferedImage getImage();
	public abstract int consume();
}