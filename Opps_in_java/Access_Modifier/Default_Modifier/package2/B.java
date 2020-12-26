import package1.*;
package package2;

class B{
	public static void main(String[] args){
		A obj=new A();//compile time error 
		obj.mgs(); //compile time error
	}
}