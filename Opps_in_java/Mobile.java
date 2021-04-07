//Interfac
interface Game{
	public static final int i = 100;
	public static final double   b = 2.3;
	
	void run();
}
class Mobile1 implements Game{
	
	int c = 10;
	
	public void run(){
			System.out.println(c);
			System.out.println(i);
			System.out.println(b);
	}
}
public class Mobile{
	public static void main(String[] args){
		Mobile1 m = new Mobile1();
		m.run();
	}
}