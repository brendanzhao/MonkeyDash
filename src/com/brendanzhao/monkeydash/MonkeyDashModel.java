package com.brendanzhao.monkeydash;

public class MonkeyDashModel extends AbstractModel {

	public MonkeyDashModel(AbstractController controller)
	{
		super();
		controller.addModel(this);
	}
}
