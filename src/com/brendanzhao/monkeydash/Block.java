package com.brendanzhao.monkeydash;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class Block {

	private int width;
	private int height;
	private Point location;
	private BufferedImage image;
	
	public Block(int width, int height, Point location, BufferedImage image) {
		this.setWidth(width);
		this.setHeight(height);
		this.setLocation(location);
		this.setImage(image);
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

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
}