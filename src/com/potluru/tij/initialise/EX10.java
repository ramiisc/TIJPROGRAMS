package com.potluru.tij.initialise;

class Switch {
	protected boolean on;
	Switch(boolean on) {
		this.on = on;
	}
	protected void finalize() {
		if(on) {
			System.out.println("ERROR: Switch is on");
		}
	}
}
public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch sw = new Switch(true);
		sw.on = false;
		new Switch(true);
//		System.gc();
		System.out.println("Done");

	}

}
