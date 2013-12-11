package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;

public class Banana extends AbstractConsumable {
	
	public Banana(int x, int y, BufferedImage image) {
		setX(x);
		setY(y);
		setImage(image);
		updateHitBox();
	}

	@Override
	public void consume(MonkeyDashModel model) {
		model.setScore(model.getScore() + Constants.BANANA_POINTS);
	}
}