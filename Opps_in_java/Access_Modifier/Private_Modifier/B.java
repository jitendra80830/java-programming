/*private access modifier accessable only within a class*/
class A{
	private int data=40;
	public void msg(){
		System.out.println("from class A");
	}
}
public class B{
	public static void main(String[] args){
		A obj =new A();
		//System.out.println(obj.data);//error data is private
		
		obj.msg();// msg is public
		
	}
}