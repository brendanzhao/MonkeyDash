package com.brendanzhao.monkeydash;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class MonkeyDashController implements ActionListener {
	
	private MonkeyDashModel model;
	private MonkeyDashView view;
	private Timer timer;
	
	public MonkeyDashController(MonkeyDashModel model, MonkeyDashView view) {
		this.model = model;
		this.view = view;
		
		this.timer = new Timer(Constants.TIMER_TICK_MILLISECONDS, this);
		this.timer.setInitialDelay(Constants.INITIAL_TIMER_DELAY);
		this.timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		moveBlocks();
		view.repaint();
		
	}
	
	public void moveBlocks() {
		for (Block b : this.model.getBlocks()) {
			if (b.getX() <= b.getWidth() * -1) {
				b.setX(Constants.SPACE_BETWEEN_BLOCKS * 3 + b.getWidth() * 2);
			}
			
			b.setX(b.getX() - Constants.PIXEL_SPEED_PER_TICK);
		}
	}
}
