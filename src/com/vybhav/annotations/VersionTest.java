package com.vybhav.annotations;

@Version(major = 1, minor = 1)
public class VersionTest {
	
	@Version(major = 1, minor = 1)
	public VersionTest() {
		super();
	}

	@Version(major = 1, minor = 1)	
	public VersionTest(int value) {
		super();
		this.value = value;
	}

	@Version(major = 1, minor = 1)
	private int value;

	@Version(major = 1, minor = 1)
	public int getValue() {
		return value;
	}

	@Version(major = 1, minor = 1)
	public void setValue(int value) {
		this.value = value;
	}

	public static void main(String[] args) {

	}

}
