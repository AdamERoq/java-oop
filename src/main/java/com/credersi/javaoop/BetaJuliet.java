package com.credersi.javaoop;

public class BetaJuliet extends Racecar {
private int laps;
	
	private BetaJuliet() {
		 this.laps = 29;
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
