/*Create a class containing an uninitialized String reference. 
 * Demonstrate that this reference is initialized by Java to null.
 * 
*/

package com.potluru.tij.initialise;
class dummyString {
	String str;
}
public class EX1 {

	public static void main(String[] args) {
		dummyString ds = new dummyString();
		System.out.print(ds.str);
	}

}
