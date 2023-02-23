package com.credersi.javaoop;

public class BlueCow extends Racecar {
private int laps;
	
	private BlueCow() {
		 this.laps = 19;
	}
	@Override 
	 protected void breakdown() {
		 this.laps--;
		 if (this.laps == 0) {
			 super.breakdown();
		 } else {
			 this.reset();
		 }
	 }
}
