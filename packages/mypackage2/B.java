//save thsi file in mypackage2
package mypackage2;

class B{ //Default protection
	B(){ //Default Constructor
		mypackage1.X x=new mypackage1.X(); //Create an object of class X
		
		System.out.println("i am Constructor fron class B of mypackage2")(;
		//System.out.println("n from B of package2"+x.n);//Default variable is not Accesable in this package (Error)
		//System.out.println("p from B of package2"+x.p); //Error
		//System.out.println("q from B of package2"+x.q); //Error protected
		System.out.println("r from B of package2"+x.r);
	}
}
		