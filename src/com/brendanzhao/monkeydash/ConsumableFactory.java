package com.brendanzhao.monkeydash;

public class ConsumableFactory extends AbstractConsumableFactory {
	
	private static ConsumableFactory instance;
	
	private ConsumableFactory() {
	}
	
	// unneccessary since this isn't multi-threaded
	public static ConsumableFactory getInstance() {
		if (instance == null) {
			synchronized (ConsumableFactory.class) {
				if (instance == null) {
					instance = new ConsumableFactory();
				}			
			}
		}
		
		return instance;
	}

	@Override
	public AbstractConsumable createBanana() {
		// TODO Auto-generated method stub
		return null;
	}
}