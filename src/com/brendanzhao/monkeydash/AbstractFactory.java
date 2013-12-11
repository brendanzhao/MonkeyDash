package com.brendanzhao.monkeydash;

public abstract class AbstractFactory {	
	public abstract Monkey createMonkey(int x, int y);
	public abstract BasicBlock createMediumBlock(int x, int y);
	public abstract AbstractConsumable createBanana(int x, int y);
}
