package com.potluru.tij.initialise;

class Rock {
	Rock() { // This is the constructor
		System.out.print("Rock ");
	}
}

public class SimpleConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			new Rock();
	}
}