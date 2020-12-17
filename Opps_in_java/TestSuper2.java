/*Super:Invoking parent class method*/
class Animal{
	void eat(){
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	void eat(){
		System.out.println("eating bread....");
	}
	void work(){
		super.eat(); //from parent class animals
		eat(); //from sublcass Dog
	}
}
class TestSuper2{
	public static void main(String args[]){
		Dog d=new Dog();
		d.work();
	}
}