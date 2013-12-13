package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class Pineapple extends AbstractConsumable {
	
	public Pineapple(int x, int y, BufferedImage image) {
		super(x, y, image);
	}

	@Override
	public int consume() {
		return Constants.PINEAPPLE_POINTS;
	}
}