package com.brendanzhao.monkeydash;

import java.util.ArrayList;
import java.util.List;

public class MonkeyDashModel extends AbstractModel {

	private Monkey monkey;
	private List<Block> blocks;
	
	public MonkeyDashModel(AbstractController controller)
	{
		super();
		setBlocks(new ArrayList<Block>());
		controller.addModel(this);
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
}