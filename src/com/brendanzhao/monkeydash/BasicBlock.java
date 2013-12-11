package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class BasicBlock {

	private int x;
	private int y;
	private BufferedImage image;
	
	public BasicBlock(int x, int y, BufferedImage image) {
		this.x = x;
		this.y = y;
		this.image = image;
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

	public int getWidth() {
		return image.getWidth();
	}

	public int getHeight() {
		return image.getHeight();
	}

	public BufferedImage getImage() {
		return image;
	}
}