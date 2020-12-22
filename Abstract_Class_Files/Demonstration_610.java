/*An Constructor class without any abstract method*/

abstract class Base{
	void fun(){
		System.out.println("Base fun is called");
	}
}
class Derived extends Base{
	Derived(){
		System.out.println("Derived constructor is called");
	}
	void fun(){
		System.out.println("Derived fun is called");
	}
}
class Demonstration_610{
	public static void main(String[] args){
		Derived d=new Derived();
		d.fun();
	}
}