package com.credersi.animals;

public class Goat extends Animal {
	private int lives;
	
	@Override
	protected void dies() {
		this.lives--;
		if (this.lives == 0) {
			super.dies();
		} else {
			this.reset();
		}
	}
	
	public Goat() {
		this.lives = 1;
	}
}