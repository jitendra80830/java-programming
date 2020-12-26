/* private field Example*/
public class A2{
	private int data=10;
	public void msg(){
		System.out.println("i am from class A2");
	}
}
public class B2{
	public static void main(String[] args){
		A2 obj=new A2();
		//System.out.println(obj.data); //Error data is private
		obj.msg(); //Accessable
	}
}
