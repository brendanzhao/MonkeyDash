package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class MonkeyDashModel {

	private int score;
	private Monkey monkey;
	private List<BasicBlock> blocks;
	private List<AbstractConsumable> consumables;
	private BufferedImage backgroundImage;
	
	public MonkeyDashModel() {
		initializeBackground();
		reset();
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Monkey getMonkey() {
		return monkey;
	}

	public List<BasicBlock> getBlocks() {
		return blocks;
	}

	public List<AbstractConsumable> getConsumables() {
		return consumables;
	}

	public BufferedImage getBackgroundImage() {
		return backgroundImage;
	}
	
	public void initializeBackground() {
		try {
			backgroundImage = ImageIO.read(new File(Constants.BACKGROUND_IMAGE_URL));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void reset() {
		score = 0;
		monkey = MonkeyDashFactory.getInstance().createMonkey(Constants.MONKEY_HORIZONTAL_POSITION, 0);
		blocks = new ArrayList<BasicBlock>();
		consumables = new ArrayList<AbstractConsumable>();
			
		for (int i = 0; i < Constants.INITIAL_NUMBER_BLOCKS; i++) {
			if (blocks.size() == 0) {
				blocks.add(MonkeyDashFactory.getInstance().createMediumBlock(Constants.INITIAL_BLOCK_X, Constants.BLOCK_LEVITATION_HEIGHT));
			} else {
				BasicBlock previous = blocks.get(i - 1);
				blocks.add(MonkeyDashFactory.getInstance().createMediumBlock(previous.getX() + previous.getWidth() + Constants.BLOCK_DISTANCE_MIN, Constants.BLOCK_LEVITATION_HEIGHT));
			}
		}
		
		for (int i = 0; i < Constants.INITIAL_NUMBER_CONSUMABLES; i++) {
			consumables.add(MonkeyDashFactory.getInstance().createBanana(i * Constants.SPACE_BETWEEN_CONSUMABLES, Constants.CONSUMABLE_LEVITATION_HEIGHT));
		}
	}
}