/*Accessing a package from java build_In API*/
import java.lang.*;

class Cal{
	
	double i;
	double x;
	
	void p(){
		x=Math.sqrt(i);
	}
}
class Calculater1{
	public static void main(String[] args){
		Cal a=new Cal();
		a.i=10;
		a.p();
		System.out.println("Square root of: "+a.i+" is "+a.x);
	}
}