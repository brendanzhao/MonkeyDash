package com.brendanzhao.monkeydash;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class Monkey {
	
	private int verticalVelocity;
	private Point location;
	private BufferedImage runningImageOne;
	private BufferedImage runningImageTwo;
	private BufferedImage jumpingImage;
	
	public Monkey() {		
	}

	public int getVerticalVelocity() {
		return verticalVelocity;
	}

	public void setVerticalVelocity(int verticalVelocity) {
		this.verticalVelocity = verticalVelocity;
	}
	
	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public BufferedImage getRunningImageOne() {
		return runningImageOne;
	}

	public void setRunningImageOne(BufferedImage runningImageOne) {
		this.runningImageOne = runningImageOne;
	}

	public BufferedImage getRunningImageTwo() {
		return runningImageTwo;
	}

	public void setRunningImageTwo(BufferedImage runningImageTwo) {
		this.runningImageTwo = runningImageTwo;
	}

	public BufferedImage getJumpingImage() {
		return jumpingImage;
	}

	public void setJumpingImage(BufferedImage jumpingImage) {
		this.jumpingImage = jumpingImage;
	}
}