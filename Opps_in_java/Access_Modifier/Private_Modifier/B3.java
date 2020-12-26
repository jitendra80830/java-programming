/*private Constructor Example*/
public class A3{
	private A3(){ //private Constructor
	}
	void msg(){
		System.out.println("i am from class A3");
	}
}
public class B3{
	public static void main(String[] args){
		A3 obj =new A3(); //compilr time Error 
	}
}