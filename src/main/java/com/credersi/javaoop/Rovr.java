package com.credersi.javaoop;

public class Rovr extends Racecar implements Pitstop, Hover {
	
	private int laps;
	
	private Rovr() {
		 this.laps = 99;
	}
	
	public boolean hover() {
		return true;
	}
	
	
	public int pitstop() {
		return 4;
	}
	
	 public int changeFuel() {
		 if(this.pitstop() < 1) {
			 this.refuel();
		 } 
		 return changeFuel();
	 }
	 
	 
	 @Override
	 public boolean refuel() {
			this.fuel += 40;
			if (this.fuel > 350) {
				this.breakdown();
			}
			return this.isRacing();
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
