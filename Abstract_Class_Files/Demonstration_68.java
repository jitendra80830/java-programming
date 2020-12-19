/*Example of abstract class with abstract method*/
abstract class Base{
	abstract void fun();
}
class Derived extends Base{
	void fun(){
		System.out.println("Derived fun() is called");
	}
}
class Demonstration_68{
	public static void main(String[] args){
		//Base b=new Base(); //Error
		
		//We can have reference of Base type
		Base b1=new Derived();
		b1.fun();
	}
}