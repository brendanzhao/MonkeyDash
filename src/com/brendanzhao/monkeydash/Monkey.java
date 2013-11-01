package com.brendanzhao.monkeydash;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class Monkey {
	
	private static final int GRAVITY = 10;
	private int verticalVelocity;
	private BufferedImage bufferedImage;
	private Point location;
	
	public Monkey() {		
	}

	private int getVerticalVelocity() {
		return verticalVelocity;
	}

	private void setVerticalVelocity(int verticalVelocity) {
		this.verticalVelocity = verticalVelocity;
	}

	private BufferedImage getBufferedImage() {
		return bufferedImage;
	}

	private void setBufferedImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}

	private Point getLocation() {
		return location;
	}

	private void setLocation(Point location) {
		this.location = location;
	}
}