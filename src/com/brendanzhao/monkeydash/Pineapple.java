package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class Pineapple extends AbstractConsumable {
	
	public Pineapple(int x, int y, BufferedImage image) {
		super(x, y, image);
	}

	@Override
	public void consume(MonkeyDashModel model) {
		model.setScore(model.getScore() + Constants.PINEAPPLE_POINTS);
	}
}