/*Example of Super to overcome name hiding*/
class A{
	int i;
}
class B extends A{
	int i; //this i hides in theb A
	
	B(int a,int b){
		super.i=a; //i in A
		i=b;//i in b
	}
	void show(){
		System.out.println("i in supercalss: "+super.i);
		System.out.println("i in subcalss: "+i);
	}
}
class Demonstration_65{
	public static void main(String[] args){
		B b=new B(1,3);
		b.show();
	}
}