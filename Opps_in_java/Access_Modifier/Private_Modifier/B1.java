/*private class Example*/
private class A1{
	int data=10;
	void msg(){
		System.out.println("i am from class A");
	}
}
public class B{
	public static void main(String[] args){
		A1 obj=new A1();//Error class is private
		obj.msg();//msg is also private
		System.out.println(obj.data); //data is private
	}
}