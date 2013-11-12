package com.brendanzhao.monkeydash;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class Block {

	private int width;
	private int height;
	private Point location;
	private static BufferedImage image;
	
	public Block(int width, int height, Point location) {
		this.setWidth(width);
		this.setHeight(height);
		this.setLocation(location);
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

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public static BufferedImage getImage() {
		return image;
	}

	public static void setImage(BufferedImage image) {
		Block.image = image;
	}
}