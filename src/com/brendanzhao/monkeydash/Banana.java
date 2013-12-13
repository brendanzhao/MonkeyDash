package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class Banana extends AbstractConsumable {
	
	public Banana(int x, int y, BufferedImage image) {
		super(x, y, image);
	}

	@Override
	public int consume() {
		return Constants.BANANA_POINTS;
	}
}