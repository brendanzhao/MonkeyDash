package com.brendanzhao.monkeydash;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class Monkey {
	
	private int verticalVelocity;
	private BufferedImage bufferedImage;
	private Point location;
	
	public Monkey() {		
	}

	public int getVerticalVelocity() {
		return verticalVelocity;
	}

	public void setVerticalVelocity(int verticalVelocity) {
		this.verticalVelocity = verticalVelocity;
	}

	public BufferedImage getBufferedImage() {
		return bufferedImage;
	}

	public void setBufferedImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
}