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
	private List<Block> blocks;
	private BufferedImage backgroundImage;
	
	public MonkeyDashModel() {
		initializeImages();
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

	public List<Block> getBlocks() {
		return blocks;
	}

	public BufferedImage getBackgroundImage() {
		return backgroundImage;
	}
	
	public void initializeImages() {
		try {
			backgroundImage = ImageIO.read(new File(Constants.BACKGROUND_IMAGE_URL));
			Monkey.setRunningImageOne(ImageIO.read(new File(Constants.MONKEY_RUN_ONE_IMAGE_URL)));
			Monkey.setRunningImageTwo(ImageIO.read(new File(Constants.MONKEY_RUN_TWO_IMAGE_URL)));
			Monkey.setJumpingImage(ImageIO.read(new File(Constants.MONKEY_JUMP_IMAGE_URL)));
			Block.setImage(ImageIO.read(new File(Constants.BLOCK_IMAGE_URL)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void reset() {
		score = 0;
		monkey = new Monkey(Constants.MONKEY_HORIZONTAL_POSITION, 0);
		blocks = new ArrayList<Block>();
			
		for (int i = 0; i < Constants.INITIAL_NUMBER_BLOCKS; i++) {
			blocks.add(new Block(i * Block.getImage().getWidth() + i * Constants.SPACE_BETWEEN_BLOCKS + Constants.INITIAL_BLOCK_X, Constants.BLOCK_LEVITATION_HEIGHT));
		}
	}
}