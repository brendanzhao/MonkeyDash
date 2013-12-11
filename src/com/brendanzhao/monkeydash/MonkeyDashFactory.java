package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MonkeyDashFactory extends AbstractFactory {
	
	private static BufferedImage bananaImage;
	private static MonkeyDashFactory instance;
	
	private MonkeyDashFactory() {
	}
	
	// unneccessary since this isn't multi-threaded
	public static MonkeyDashFactory getInstance() {
		if (instance == null) {
			synchronized (MonkeyDashFactory.class) {
				if (instance == null) {
					instance = new MonkeyDashFactory();
				}			
			}
		}
		
		return instance;
	}

	@Override
	public AbstractConsumable createBanana(int x, int y) {
		if (bananaImage == null) {
			try {
				bananaImage = ImageIO.read(new File(Constants.BANANA_IMAGE_URL));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return new Banana(x, y, bananaImage);
	}
}