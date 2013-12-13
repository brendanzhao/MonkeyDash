package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class Canteen extends AbstractConsumable {
	
	public Canteen(int x, int y, BufferedImage image) {
		super(x, y, image);
	}

	@Override
	public int consume() {
		return Constants.CANTEEN_POINTS;
	}
}