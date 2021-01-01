//Save this file in mypackage1
package mypackage1;
import mypackage1.X;
public class A{ //Default protection
	public A(){ //Default access constructor
		X x=new X();
		System.out.println("Same package Constructor.....");
		
		System.out.println("n fron A "+x.n); //Default variable accessable in the same package
		//System.out.println("p fron A"x.p); //Error(private)
		//System.out.println("q from A"+x.q); //Error
		System.out.println("r from A"+x.r);
	}
}
		