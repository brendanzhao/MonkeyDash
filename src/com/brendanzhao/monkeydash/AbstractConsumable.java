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
	
	public Rectangle getHitBox() {
		return hitBox;
	}
	
	public void setHitBox(Rectangle hitBox) {
		this.hitBox = hitBox;
	}
	
	public abstract BufferedImage getImage();
	public abstract int consume();
}