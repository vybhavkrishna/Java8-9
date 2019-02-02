package com.vybhav.innerClasses;

public class RandomLocal {
	public RandomInteger getRandomInteger() {
		class RandomIntegerLocal extends RandomInteger {

			@Override
			public int getValue() {
				long n1 = rand.nextInt();
				long n2 = rand.nextInt();
				return (int) ((n1 + n2) / 2);
			}

		}
		return new RandomIntegerLocal();
	}
}
