package com.vybhav.innerClasses;

/**
 * illustration of member inner classes.. Tire is a member of Car class..
 * 
 * @author vybhavk
 *
 */
public class Car {

	public Car(int year) {
		super();
		this.year = year;
	}

	private int year;
	
	public int getYear() {
		return year;
	}

	public class Tire {
		public Tire(int radius) {
			super();
			this.radius = radius;
		}

		private int radius;

		public int getRadius() {
			return radius;
		}
		
	}
}
