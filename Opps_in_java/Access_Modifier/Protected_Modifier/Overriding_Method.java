/*Example with method override*/
class A{
	
	protected void msg(){
		System.out.println("Class A :Hello java");
	}
}
class Overriding_Method extends A{
	
	void msg(){
		System.out.println("Class Overriding_Method :Hello java");
	}
	
	public static void main(String[] args){
		Overriding_Method obj=new Overriding_Method();
		obj.msg();
	}
}