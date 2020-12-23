/*Am Example of abstract class with a Final Method
error grogram*/
abstract class Base{
	final void fun(){
		System.out.println("final fun is called");
	}
}
class Derived extends Base{
	Derived(){
		System.out.println("Derived constructor is called");
	}
	void fun(){ //error because override method is final
		System.out.println("Derived fun is called");
	}
}
class Final_Keyword1{
	public static void main(String[] args){
		Base b=new Derived();
		b.fun();
	}
}
