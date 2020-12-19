//*A Simple Example of inherutance class*/
class A{
	int i,j;
	void showij(){
		System.out.println("i and j="+i+" "+j);
	}
}
class B extends A{
	int k;
	void showk(){
		System.out.println("k="+k);
	}
	void sum(){
		System.out.println("i+j+k= "+(i+j+k));
	}
}
class Demonstration_61{
	public static void main(String[] args){
		A superob=new A();
		B subob=new B();
		superob.i=10;
		superob.j=20;
		System.out.println("content of superob: ");
		superob.showij();
		subob.k=21;
		subob.i=11;
		subob.j=9;
		System.out.println("content of subob: ");
		subob.showk();
		subob.showij();
		System.out.println("Sum of i,j and k in subob: ");
		subob.sum();
	}
}
		