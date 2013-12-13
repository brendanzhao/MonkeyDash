package com.brendanzhao.monkeydash;

public abstract class AbstractFactory {	
	public abstract Monkey createMonkey(int x, int y);
	public abstract BasicBlock createSmallBlock(int x, int y);
	public abstract BasicBlock createMediumBlock(int x, int y);
	public abstract BasicBlock createLargeBlock(int x, int y);
	public abstract BasicBlock createRandomBlock(int x, int y);
	public abstract BasicBlock createRandomBlock(int x, int y, int horizontalShift);
	public abstract AbstractConsumable createBanana(int x, int y);
	public abstract AbstractConsumable createBananaBunch(int x, int y);
	public abstract AbstractConsumable createCanteen(int x, int y);
	public abstract AbstractConsumable createPineapple(int x, int y);
	public abstract AbstractConsumable createRandomConsumable(int x, int y);
	public abstract AbstractConsumable createRandomConsumable(int x, int y, int horizontalShift);
}
