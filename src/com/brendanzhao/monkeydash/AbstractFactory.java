package com.brendanzhao.monkeydash;

public abstract class AbstractFactory {	
	public abstract Monkey createMonkey(int x, int y);
	public abstract BasicBlock createSmallBlock(int x, int y);
	public abstract BasicBlock createMediumBlock(int x, int y);
	public abstract BasicBlock createLargeBlock(int x, int y);
	public abstract BasicBlock createRandomBlock(int x, int y);
	public abstract BasicBlock createRandomBlock(int x, int y, int horizontalShift);
	public abstract AbstractConsumable createBanana(int x, int y);
}
