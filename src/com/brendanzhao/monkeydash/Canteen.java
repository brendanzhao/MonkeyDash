package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class Canteen extends AbstractConsumable {
	
	public Canteen(int x, int y, BufferedImage image) {
		super(x, y, image);
	}

	@Override
	public void consume(MonkeyDashModel model) {
		model.setScore(model.getScore() + Constants.CANTEEN_POINTS);
	}
}