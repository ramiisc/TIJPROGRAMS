/*Create a class with a String field that is initialized at the point of definition,
 *and another one that is initialized by the constructor.
 *What is the difference between the two approaches
 */
package com.potluru.tij.initialise;

class dummyString1 {
	String str1 = "RAMAKRISHNA";
	String str2;
	dummyString1(String s) {
		this.str2 = s;
	}
}

public class EX2 {

	public static void main(String[] args) {
		dummyString1 ds = new dummyString1("POTLURU");
		System.out.println(ds.str1);
		System.out.println(ds.str2);

	}

}
