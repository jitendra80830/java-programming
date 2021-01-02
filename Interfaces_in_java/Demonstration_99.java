// extends with implements
class A1{
	protected int j=10;
	void printA(){
		System.out.println("i am from A j= "+j);
	}
}
interface I{
	public static int  i=221;
	void printInterface();
}
class B extends A1 implements I{
	public int value=90;
	
	public void printInterface(){
		System.out.println("I am from I i= "+i);
	}
	public void printB(){
		super.printA();
		printInterface();
		
		System.out.println("sum of j and i= "+(j+i));
	}
}
public class Demonstration_99{
	public static void main(String[] args){
		B b=new B();
		b.printB();
	}
}