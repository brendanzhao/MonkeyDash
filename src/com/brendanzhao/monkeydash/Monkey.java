package com.brendanzhao.monkeydash;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Monkey {
	
	private int x;
	private int y;
	private int verticalVelocity;
	private Rectangle hitBox;
	private MonkeyState state;
	private static BufferedImage runningImageOne;
	private static BufferedImage runningImageTwo;
	private static BufferedImage jumpingImage;
	
	public Monkey(int x, int y) {
		this.x = x;
		this.y = y;
		state = MonkeyState.Falling;
		hitBox = new Rectangle(x, y, runningImageOne.getWidth(), runningImageOne.getHeight());
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

	public int getVerticalVelocity() {
		return verticalVelocity;
	}

	public void setVerticalVelocity(int verticalVelocity) {
		this.verticalVelocity = verticalVelocity;
	}

	public Rectangle getHitBox() {
		return hitBox;
	}

	public MonkeyState getState() {
		return state;
	}

	public void setState(MonkeyState state) {
		this.state = state;
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
		switch (state) {
			case FirstRun:
			case Falling:
				return runningImageOne;
			case SecondRun:
				return runningImageTwo;
			case FirstJump:
			case SecondJump:
				return jumpingImage;
			default:
				return runningImageOne;
		}
	}
}