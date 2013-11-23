package com.brendanzhao.monkeydash;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Timer;

public class MonkeyDashController implements ActionListener {
	
	private MonkeyDashModel model;
	private MonkeyDashView view;
	private Timer timer;
	
	public MonkeyDashController(MonkeyDashModel model, MonkeyDashView view) {
		this.model = model;
		this.view = view;
		
		timer = new Timer(Constants.TIMER_TICK_MILLISECONDS, this);
		timer.setInitialDelay(Constants.INITIAL_TIMER_DELAY);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.getMonkey().setIsOnBlock(isMonkeyOnBlock(model.getMonkey(), model.getBlocks()));
		applyMonkeyGravity(model.getMonkey());
		updateMonkeyPosition(model.getMonkey());
		moveBlocks(model.getBlocks());
		view.repaint();
		
	}
	
	public void moveBlocks(List<Block> blocks) {
		for (Block b : blocks) {
			if (b.getX() <= Block.getImage().getWidth() * -1) {
				b.setX(Constants.SPACE_BETWEEN_BLOCKS * 3 + Block.getImage().getWidth() * 2);
			}
			
			b.setX(b.getX() - Constants.PIXEL_SPEED_PER_TICK);
		}
	}
	
	public boolean isMonkeyOnBlock(Monkey monkey, List<Block> blocks) {
		if (monkey.getY() != Constants.BLOCK_LEVITATION_HEIGHT - monkey.getCurrentImageFrame().getHeight())
			return false;
		
		for (Block b : blocks) {
			if (monkey.getX() > b.getX() && monkey.getX() < b.getX() + Block.getImage().getWidth() - monkey.getCurrentImageFrame().getWidth())
				return true;
		}
		
		return false;
	}
	
	public void applyMonkeyGravity(Monkey monkey) {
		if (!monkey.isOnBlock()) {
			monkey.setVerticalVelocity(monkey.getVerticalVelocity() + Constants.GRAVITY);
		} else if (monkey.getVerticalVelocity() > 0) {
			monkey.setVerticalVelocity(0);
		}
	}
	
	public void updateMonkeyPosition(Monkey monkey) {
		monkey.setY(monkey.getY() + monkey.getVerticalVelocity());
	}
}
