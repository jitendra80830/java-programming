/*Abstract class with constructors*/
abstract class Base{
	Base(){
		System.out.println("Base constructor is called");
	}
}
class Derived extends Base{
	Derived(){
		super();
		System.out.println("Derived constructor is called");
		
	}
}
class Demonstration_69{
	public static void main(String[] args){
		Derived d=new Derived();
		
	}
}
