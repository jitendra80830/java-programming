//example of abstarct class
abstract class Bike{
	
	abstract void run();
}
class Abstract1 extends Bike{
	
	void run(){
		System.out.println("Running safety");
	}
	public static void main(String[] args){
		Bike obj=new Abstract1();
		obj.run();
	}
}