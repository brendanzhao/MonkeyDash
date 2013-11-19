package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class MonkeyDashModel {

	private Monkey monkey;
	private List<Block> blocks;
	private BufferedImage backgroundImage;
	
	public MonkeyDashModel() {
		
		this.setBlocks(new ArrayList<Block>());
		this.monkey = new Monkey();
		
		try {
			this.setBackgroundImage(ImageIO.read(new File(Constants.BACKGROUND_IMAGE_URL)));
			this.monkey.setRunningImageOne(ImageIO.read(new File(Constants.MONKEY_RUN_ONE_IMAGE_URL)));
			this.monkey.setRunningImageTwo(ImageIO.read(new File(Constants.MONKEY_RUN_TWO_IMAGE_URL)));
			this.monkey.setJumpingImage(ImageIO.read(new File(Constants.MONKEY_JUMP_IMAGE_URL)));
			Block.setImage(ImageIO.read(new File(Constants.BLOCK_IMAGE_URL)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < Constants.INITIAL_NUMBER_BLOCKS; i++) {
			this.blocks.add(new Block(Constants.BLOCK_WIDTH, Constants.BLOCK_HEIGHT, i * Constants.BLOCK_WIDTH + i * Constants.SPACE_BETWEEN_BLOCKS, Constants.BLOCK_LEVITATION_HEIGHT));
		}
	}

	public Monkey getMonkey() {
		return monkey;
	}

	public void setMonkey(Monkey monkey) {
		this.monkey = monkey;
	}

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	public BufferedImage getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(BufferedImage backgroundImage) {
		this.backgroundImage = backgroundImage;
	}
}