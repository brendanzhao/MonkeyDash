package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class BananaBunch extends AbstractConsumable {
	
	public BananaBunch(int x, int y, BufferedImage image) {
		super(x, y, image);
	}

	@Override
	public int consume() {
		return Constants.BANANA_BUNCH_POINTS;
	}
}