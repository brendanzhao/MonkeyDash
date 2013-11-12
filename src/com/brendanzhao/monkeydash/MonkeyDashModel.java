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
			Block.setImage(ImageIO.read(new File(Constants.BACKGROUND_IMAGE_URL)));
		} catch (IOException e) {

			e.printStackTrace();
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