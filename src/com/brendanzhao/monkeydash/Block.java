package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class Block {

	private int width;
	private int height;
	private int x;
	private int y;
	private static BufferedImage image;
	
	public Block(int width, int height, int x, int y) {
		this.setWidth(width);
		this.setHeight(height);
		this.setX(x);
		this.setY(y);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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

	public static BufferedImage getImage() {
		return image;
	}

	public static void setImage(BufferedImage image) {
		Block.image = image;
	}
}