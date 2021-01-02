/* extends with Implements with two more interfaces*/
class Class1{
	protected int i=1000;
	public void print(){
		System.out.println("I am from Class1 i= "+i);
	}
}
interface Interface1{
	public static int j=390;
	void printInterface1();
}
interface Interface2{
	public static int k=200;
	void printInterface2();
}
interface Interface3{
	public static int m=20;
	void printInterface3();
}
class Class2 extends Class1 implements Interface1,Interface2,Interface3{
	public int n=8;
	
	public void printInterface1(){
		System.out.println("I am from Interface1 j= "+j);
	}
	public void printInterface2(){
		System.out.println("I am from Interface2 k= "+k);
	}
	public void printInterface3(){
		System.out.println("I am from Interface3 m= "+m);
	}
	public void printClass2(){
		super.print();
		printInterface1();
		printInterface2();
		printInterface3();
		
		System.out.println("Sum of i , j, k ,m  and n= "+(i+j+k+m+n));
	}
}
public class Demonstration_910{
	public static void main(String[] args){
		Class2 c=new Class2();
		c.printClass2();
	}
}