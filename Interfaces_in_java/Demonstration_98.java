//Example which implementa two inteface
interface I1{
	int i=10;
	void print1();
}
interface I2{
	public static int j=20;
	void print2();
}
class A implements I1,I2{
	public int value=30;
	public void print1(){
		System.out.println("I am from I1 i= "+i);
	}
	public void print2(){
		System.out.println("I am from I2 j= "+j);
	}
	public void printA(){
		System.out.println("I am from A "+value);
	}
	public void printA1(){
		System.out.println("Sum of i and j= "+(i+j));
	}
}
class Demonstration_98{
	public static void main(String[] args){
		A a=new A();
		a.print1();
		a.print2();
		a.printA();
		a.printA1();
	}
}