package com.potluru.tij.initialise;


class Fruit {
	int id;
	String name;
	Fruit(int id) {
		this.id = id;
		System.out.println("1arg cons id:"+id);
	}
	Fruit(int id, String name) {
		this(id);
		this.name = name;
		System.out.println("2arg cons name:"+name);
	}
	Fruit() {
		this(1,"Mango");
		System.out.println("no arg cons");
	}
	void getFruit() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
	}
}
public class EX9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fr = new Fruit();
		fr.getFruit();

	}

}
