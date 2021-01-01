//Exampple
interface I1{
	public static final double pi=3.1413434; //okk
	static final double lamda=0.04; //okk public
	
	//int x; //Declaration of any istant variable is Not allowed
	
	int x=100; //Initialization  of variable is necessary
	//private static final int p=444; //private and protected is not allowed
	
	//abstract public static void methodI1(); //static method is not allowed
	
	void methodI2();//public abstract by default
}
class A1 implements I1{
	public int a=556;
	public void methodI1(){
		System.out.println("From I1 "+pi);
	}
	public void methodI2(){
		System.out.println("Again from I1 "+lamda);
	}
}
public class Demonstration_93{
	public static void main(String[] args){
		A1 a=new A1();
		a.methodI1();
		a.methodI2();
	}
}
	