package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class Block {

	private int x;
	private int y;
	private static BufferedImage image;
	
	public Block(int x, int y) {
		this.x = x;
		this.y = y;
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

	public static BufferedImage getImage() {
		return image;
	}

	public static void setImage(BufferedImage image) {
		Block.image = image;
	}
}