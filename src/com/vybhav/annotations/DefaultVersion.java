package com.vybhav.annotations;

public @interface DefaultVersion {
	int major();
	int minor() default 0;
	/**
	 * here minor takes a default value of 0, if not specified during it's usage.
	 * must be a compile time constant..
	 */
}
