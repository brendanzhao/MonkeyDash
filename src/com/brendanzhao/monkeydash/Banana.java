package com.brendanzhao.monkeydash;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Banana extends AbstractConsumable {

	private static BufferedImage image;
	
	public Banana(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public BufferedImage getImage() {
		return image;
	}
	
	public static void setImage(BufferedImage image) {
		Banana.image = image;
	}

	@Override
	public int consume() {
		return Constants.BANANA_POINTS;
	}
}