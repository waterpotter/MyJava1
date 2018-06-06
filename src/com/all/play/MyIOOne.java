package com.all.play;

import java.util.Random;

class Die {
	private int value;

	protected void roll() {
		Random random = new Random();
		value = random.nextInt(6) + 1;

	}
	
	protected int getFaceValue() {
		return value;
	}
}


class DieGame{
	
	
	protected void runGame() {
		
		Die die = new Die();
		Die die2 = new Die();
		
		die.roll();
		die2.roll();
		
		int faceValue = die.getFaceValue();
		int faceValue2 = die2.getFaceValue();
		System.out.println("faceValue:"+faceValue);
		System.out.println("faceValue2:"+faceValue2);
		if(faceValue+faceValue2==7) {
			System.out.println("你是哈士奇");
		}else {
			System.out.println("你是萨摩耶");
		}
	}
}

public class MyIOOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DieGame dieGame = new DieGame();
		dieGame.runGame();

	}

}
