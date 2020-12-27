/*protected Modifier Example
without onheritace not allows protected fiels ans method and constructor*/
class A{
	protected int i=10;
	void msg(){
		System.out.println("Class A: hello");
	}
}
class B{
	public static void main(String[] args){
		A obj=new A();
		System.out.println(obj.i); 
	}
}