//protected ex
class A1{
	protected int rollNo=555;
	protected void msg(){
		
		System.out.println("Class A :Hello"+rollNo);
	}
}
class Demonstration_710{
	public static void main(String[] args){
		A1 obj=new A1();
		obj.msg();
		System.out.println("Class A :Hello"+obj.rollNo);
	}
}
		