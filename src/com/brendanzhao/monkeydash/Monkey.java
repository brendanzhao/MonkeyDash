package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class Monkey {
	
	private boolean isOnBlock;
	private int verticalVelocity;
	private int x;
	private int y;
	private BufferedImage currentImageFrame;
	private static BufferedImage runningImageOne;
	private static BufferedImage runningImageTwo;
	private static BufferedImage jumpingImage;
	
	public Monkey() {	
		currentImageFrame = runningImageOne;
	}

	public boolean isOnBlock() {
		return isOnBlock;
	}

	public void setIsOnBlock(boolean isOnBlock) {
		this.isOnBlock = isOnBlock;
	}

	public int getVerticalVelocity() {
		return verticalVelocity;
	}

	public void setVerticalVelocity(int verticalVelocity) {
		this.verticalVelocity = verticalVelocity;
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

	public static void setRunningImageOne(BufferedImage runningImageOne) {
		Monkey.runningImageOne = runningImageOne;
	}

	public static void setRunningImageTwo(BufferedImage runningImageTwo) {
		Monkey.runningImageTwo = runningImageTwo;
	}

	public static void setJumpingImage(BufferedImage jumpingImage) {
		Monkey.jumpingImage = jumpingImage;
	}

	public BufferedImage getCurrentImageFrame() {
		return currentImageFrame;
	}

	public void setCurrentImageFrame(BufferedImage currentImageFrame) {
		this.currentImageFrame = currentImageFrame;
	}
}