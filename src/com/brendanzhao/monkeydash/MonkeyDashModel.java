package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class MonkeyDashModel {

	private Monkey monkey;
	private List<Block> blocks;
	private BufferedImage backgroundImage;
	
	public MonkeyDashModel()
	{
		super();
		this.setBlocks(new ArrayList<Block>());	
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