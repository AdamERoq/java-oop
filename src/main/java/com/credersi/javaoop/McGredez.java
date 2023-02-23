package com.credersi.javaoop;

public class McGredez extends Racecar implements Pitstop {
	private int tyres;
	
	public int pitstop() {
		return 0;
	}
	
	@Override
	public boolean wear() {
		this.tyres -= 3;
		if (this.tyres == 0) {
			super.breakdown();
		} 
		return this.isRacing();
	}
	
	public McGredez() {
		this.tyres = 6;
	}
}
