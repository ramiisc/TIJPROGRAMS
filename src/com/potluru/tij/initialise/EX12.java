package com.potluru.tij.initialise;

class Tank {
	protected boolean filled;
	Tank(boolean filled) {
		this.filled = filled;
	}
	protected void finalize() {
		if(filled) {
			System.out.println("ERROR: Tank is filled. Need to be empty");
		}
	}
}
public class EX12 {

	public static void main(String[] args) {
		Tank tank1 = new Tank(true);
		Tank tank2 = new Tank(true);
		tank2 = null;
		System.gc();
		System.out.println("Done");
  
	}

}
