package com.potluru.tij.initialise;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch sw = new Switch(true);
		sw.on = false;
		new Switch(true);
		System.gc();
		System.out.println("Done");

	}

}
