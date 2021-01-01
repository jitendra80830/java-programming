//Save this file in mypackage2
package mypackage2;
import mypackage1.*;
class Z extends mypackage1.X{
	Z(){
		System.out.println("i am Constructor from class Z");
		//System.out.println("n from Z= "+n); //Default variable not accesable in its package
		//System.out.println("p from z="+p); //Error p is private of X500Principal
		//System.out.println("q from z="+q); //protroted variable is accesable by inheritance
		System.out.println("r from Z"+r); //Accesable publoic
	}
}