package com.brendanzhao.monkeydash;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MonkeyDashController {
	
	private MonkeyDashModel model;
	private MonkeyDashView view;
	
	public MonkeyDashController(MonkeyDashModel model, MonkeyDashView view) {
		this.model = model;
		this.view = view;
		
		loadImages();
	}
	
	public void loadImages() {
		try {
			this.model.setBackgroundImage(ImageIO.read(new File(Constants.BACKGROUND_IMAGE_URL)));
		} catch (IOException e) {
			System.out.println("An image did not load properly.");
		}
	}
}
