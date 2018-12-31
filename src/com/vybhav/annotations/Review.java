package com.vybhav.annotations;

public @interface Review {
	ReviewStatus status() default ReviewStatus.PENDING;
	String comments() default "";
	
	public enum ReviewStatus {PENDING, PASS, FAILED, PASSEDWITHCHANGES}
}
