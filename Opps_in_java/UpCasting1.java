// ex of up casting
class A{
	void callMe(){
		System.out.println("i am from A");
	}
}
class B extends A{
	void callMe(){
		System.out.println("i am from B");
	}
}
class UpCasting1{
	public static void main(String args[]){
		A a=new B();
		a.callMe();
		
		B b=new B();
		b.callMe();
	}
}
		