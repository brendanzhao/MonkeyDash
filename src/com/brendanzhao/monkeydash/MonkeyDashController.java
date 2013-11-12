package com.brendanzhao.monkeydash;

public class MonkeyDashController {
	
	private MonkeyDashModel model;
	private MonkeyDashView view;
	
	public MonkeyDashController(MonkeyDashModel model, MonkeyDashView view) {
		this.model = model;
		this.view = view;
	}
}
