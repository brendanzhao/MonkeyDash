package com.brendanzhao.monkeydash;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Monkey {
	
	private int x;
	private int y;
	private int verticalVelocity;
	private Rectangle hitBox;
	private MonkeyState state;
	private BufferedImage runningImageOne;
	private BufferedImage runningImageTwo;
	private BufferedImage jumpingImage;
	
	public Monkey(int x, int y, BufferedImage runningImageOne,
			BufferedImage runningImageTwo, BufferedImage jumpingImage) {
		this.x = x;
		this.y = y;
		this.runningImageOne = runningImageOne;
		this.runningImageTwo = runningImageTwo;
		this.jumpingImage = jumpingImage;
		state = MonkeyState.Falling;
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

	public int getWidth() {
		return getCurrentImageFrame().getWidth();
	}

	public int getHeight() {
		return getCurrentImageFrame().getHeight();
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
	
	public void updateHitBox() {
		hitBox = new Rectangle(x, y, getWidth(), getHeight());
	}

	public MonkeyState getState() {
		return state;
	}

	public void setState(MonkeyState state) {
		this.state = state;
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