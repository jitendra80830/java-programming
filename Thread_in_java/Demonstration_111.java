//Example of Threading
//creating three Thread using the class Thread

class ThreadA extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("From ThreadA with i= "+-1*i);
		}
		System.out.println("Existing from ThreadA......");
	}
}
class ThreadB extends Thread{
	public void run(){
		for(int j=1;j<=5;j++){
			System.out.println("From ThreadB with j= "+2*j);
		}
		System.out.println("Existing from ThreadB......");
	}
}
class ThreadC extends Thread{
	public void run(){
		for(int k=1;k<=5;k++){
			System.out.println("From ThreadC with k= "+(2*k-1));
		}
		System.out.println("Existing from ThreadC.......");
	}
}
public class Demonstration_111{
	public static void main(String[] args){
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		ThreadC c=new ThreadC();
		a.start();
		b.start();
		c.start();
		System.out.println(".....MultiThreading is over.....");
	}
}
			
		 