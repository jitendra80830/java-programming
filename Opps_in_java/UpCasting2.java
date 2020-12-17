//ex of upcasting
class Dog{
	void work(){
		System.out.println("Dog is eating");
	}
}
class Cat extends Dog{
	void work(){
		System.out.println("cat is drinking milk");
	}
}
class Rat extends Cat{
	void work(){
		System.out.println("rat is running");
	}
}
class UpCasting2{
	public static void main(String args[]){
		Dog d=new Cat();
		d.work();
		Cat c=new Cat();
		c.work();
		Rat r=new Rat();
		r.work();
		Dog d1=new Cat();
		d1.work();
	}
}