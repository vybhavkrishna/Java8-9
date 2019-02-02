package com.vybhav.innerClasses;

public class LocalInnerTest {

	public static void main(String[] args) {
		RandomInteger ri = new RandomLocal().getRandomInteger();
		System.out.println(ri.getValue());
	}

}
