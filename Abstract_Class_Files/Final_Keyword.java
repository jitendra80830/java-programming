/*Am Example class with a Final Method*/

abstract class Base{
	final void fun(){
		System.out.println("Final fun is called");
	}
}
class Derived extends Base{}

class Final_Keyword{
	public static void main(String[] args){
		Base b=new Derived();
		b.fun();
	}
}

	