//uses of |"SUPER" keyword
class Animals{
	String color="white";
}
class Dog extends Animals{
	String color="black";
	
	void printColor(){
		System.out.println(color);
		System.out.println(super.color);
	}
}
class TestSuper1{
	public static void main(String[] args){
		Dog d=new Dog();
		d.printColor();
	}
}