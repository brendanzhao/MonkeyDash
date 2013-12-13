package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

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
				blocks.add(MonkeyDashFactory.getInstance().createLargeBlock(Constants.INITIAL_BLOCK_X, Constants.BLOCK_LEVITATION_HEIGHT));
			} else {
				BasicBlock previous = blocks.get(i - 1);
				blocks.add(MonkeyDashFactory.getInstance().createRandomBlock(previous.getX() + previous.getWidth() + Constants.BLOCK_DISTANCE_MIN, Constants.BLOCK_LEVITATION_HEIGHT, Constants.BLOCK_DISTANCE_RANDOM));
			}
		}
		
		for (int i = 0; i < Constants.INITIAL_NUMBER_CONSUMABLES; i++) {
			if (consumables.size() == 0) {
				consumables.add(MonkeyDashFactory.getInstance().createRandomConsumable(Constants.INITIAL_CONSUMABLE_X, Constants.CONSUMABLE_LEVITATION_HEIGHT));
			} else {
				AbstractConsumable previous = consumables.get(i - 1);
				consumables.add(MonkeyDashFactory.getInstance().createRandomConsumable(previous.getX() + previous.getWidth() + Constants.CONSUMABLE_DISTANCE_MIN, Constants.CONSUMABLE_LEVITATION_HEIGHT, Constants.CONSUMABLE_DISTANCE_RANDOM));
			}
		}
	}
}