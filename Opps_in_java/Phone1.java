//Dynamic method dispatch
//runtime polimorphism
class Phone{
	void call(){
		System.out.println("Hello Kon?");
	}
}
class Phone2 extends Phone{
	void call(){
		System.out.println("Hello World");
	}
}
public class Phone1 extends Phone2{
	void call(){
		System.out.println("Hello");
	}
	public static void main(String[] args){
		Phone p = new Phone2();
		p.call();
		Phone2 p1 = new Phone1();
		p1.call();
	}
}