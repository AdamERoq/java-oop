package com.credersi.javaoop;

public class Racecar {
	protected int fuel;
	private boolean racing;
	private int tyres;
	
	public boolean wear() {
		this.tyres -= 1;
		if (this.tyres == 0) {
			this.breakdown();
		}
		return this.isRacing();
	}
	
	protected void breakdown() {
		this.racing = false;
	}
	
	public Racecar() {
	}
	
	protected void reset() {
		this.fuel = 100;
		this.racing = true;
		this.tyres = 10;
	}
	
	
	public boolean refuel() {
		this.fuel += 30;
		if (this.fuel > 170) {
			this.breakdown();
		}
		return this.isRacing();
	}
		
	public boolean races() {
		this.fuel -= 20;
		if (this.fuel == 0) {
			this.breakdown();
		}
		return this.isRacing();
	}
	
	public boolean isRacing() {
		return this.racing;
	}
	
}

