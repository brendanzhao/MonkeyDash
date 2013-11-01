package com.brendanzhao.monkeydash;

import java.awt.Dimension;
import java.beans.PropertyChangeEvent;

public class MonkeyDashView extends AbstractView {

	MonkeyDashController controller;
	
	public MonkeyDashView(MonkeyDashController controller) {
		this.setPreferredSize(new Dimension(800, 600));
		this.controller = controller;
		controller.addView(this);
	}
	
	@Override
	public void modelPropertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub	
	}
}