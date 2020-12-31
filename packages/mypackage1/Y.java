//save this file in mypackage1
package mypackage1;
import mypackage1.X;

public class Y extends X{
	public Y(){
		System.out.println(" i am Constructor from class Y");
		System.out.println("n= "+n);
		//System.out.println("p= "+p); //Eroor is private member
		System.out.println("q= "+q); //Accesable
		System.out.println("r= "+r);
	}
}