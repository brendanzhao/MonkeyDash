package com.brendanzhao.monkeydash;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class MonkeyDashFactory extends AbstractFactory {
	
	private static Random random;
	private static BufferedImage monkeyRunOneImage;
	private static BufferedImage monkeyRunTwoImage;
	private static BufferedImage monkeyJumpImage;
	private static BufferedImage smallBlockImage;
	private static BufferedImage mediumBlockImage;
	private static BufferedImage largeBlockImage;
	private static BufferedImage bananaImage;
	private static BufferedImage bananaBunchImage;
	private static BufferedImage canteenImage;
	private static BufferedImage pineappleImage;
	private static MonkeyDashFactory instance;
	
	private MonkeyDashFactory() {
		random = new Random();
	}
	
	// unneccessary since this isn't multi-threaded
	public static MonkeyDashFactory getInstance() {
		if (instance == null) {
			synchronized (MonkeyDashFactory.class) {
				if (instance == null) {
					instance = new MonkeyDashFactory();
				}			
			}
		}
		
		return instance;
	}
	
	@Override
	public Monkey createMonkey(int x, int y) {	
		try {
			if (monkeyRunOneImage == null) {
				monkeyRunOneImage = ImageIO.read(new File(Constants.MONKEY_RUN_ONE_IMAGE_URL));
			}		
			if (monkeyRunTwoImage == null ) {
				monkeyRunTwoImage = ImageIO.read(new File(Constants.MONKEY_RUN_TWO_IMAGE_URL));
			}
			if (monkeyJumpImage == null) {
				monkeyJumpImage = ImageIO.read(new File(Constants.MONKEY_JUMP_IMAGE_URL));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new Monkey(x, y, monkeyRunOneImage, monkeyRunTwoImage, monkeyJumpImage);	
	}
	
	@Override
	public BasicBlock createSmallBlock(int x, int y) {
		if (smallBlockImage == null) {
			try {
				smallBlockImage = ImageIO.read(new File(Constants.BLOCK_SMALL_IMAGE_URL));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return new BasicBlock(x, y, smallBlockImage);
	}
	
	@Override
	public BasicBlock createMediumBlock(int x, int y) {
		if (mediumBlockImage == null) {
			try {
				mediumBlockImage = ImageIO.read(new File(Constants.BLOCK_MEDIUM_IMAGE_URL));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return new BasicBlock(x, y, mediumBlockImage);
	}

	@Override
	public BasicBlock createLargeBlock(int x, int y) {
		if (largeBlockImage == null) {
			try {
				largeBlockImage = ImageIO.read(new File(Constants.BLOCK_LARGE_IMAGE_URL));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return new BasicBlock(x, y, largeBlockImage);
	}
	
	@Override
	public BasicBlock createRandomBlock(int x, int y) {
		return createRandomBlock(x, y, 1);
	}
	
	@Override
	public BasicBlock createRandomBlock(int x, int y, int horizontalRandom) {
		switch (random.nextInt(3))
		{
			case 0:
				return createSmallBlock(x + random.nextInt(horizontalRandom), y);
			case 1:
				return createMediumBlock(x + random.nextInt(horizontalRandom), y);
			case 2:
				return createLargeBlock(x + random.nextInt(horizontalRandom), y);
			default:
				return createMediumBlock(x + random.nextInt(horizontalRandom), y);
		}
	}
	
	@Override
	public AbstractConsumable createBanana(int x, int y) {
		if (bananaImage == null) {
			try {
				bananaImage = ImageIO.read(new File(Constants.BANANA_IMAGE_URL));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return new Banana(x, y, bananaImage);
	}
	
	@Override
	public AbstractConsumable createBananaBunch(int x, int y) {
		if (bananaBunchImage == null) {
			try {
				bananaBunchImage = ImageIO.read(new File(Constants.BANANA_BUNCH_IMAGE_URL));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return new BananaBunch(x, y, bananaBunchImage);
	}
	
	@Override
	public AbstractConsumable createCanteen(int x, int y) {
		if (canteenImage == null) {
			try {
				canteenImage = ImageIO.read(new File(Constants.CANTEEN_IMAGE_URL));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return new Canteen(x, y, canteenImage);
	}
	
	@Override
	public AbstractConsumable createPineapple(int x, int y) {
		if (pineappleImage == null) {
			try {
				pineappleImage = ImageIO.read(new File(Constants.PINEAPPLE_IMAGE_URL));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return new Pineapple(x, y, pineappleImage);
	}
	
	@Override
	public AbstractConsumable createRandomConsumable(int x, int y) {
		return createRandomConsumable(x, y, 1);
	}
	
	@Override
	public AbstractConsumable createRandomConsumable(int x, int y, int horizontalRandom) {
		
		switch (random.nextInt(4))
		{
			case 0:
				return createBanana(x + random.nextInt(horizontalRandom), y);
			case 1:
				return createBananaBunch(x + random.nextInt(horizontalRandom), y);
			case 2:
				return createCanteen(x + random.nextInt(horizontalRandom), y);
			case 3:
				return createPineapple(x + random.nextInt(horizontalRandom), y);
			default:
				return createBanana(x + random.nextInt(horizontalRandom), y);
		}
	}
}