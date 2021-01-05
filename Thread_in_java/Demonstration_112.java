/*Creating three Threading using Runnable inteface and then running them concurrently*/
class ThreadX implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("ThreadX with i= "+-1*i);
		}
		System.out.println("Existing ThreadX.....");
	}
}
class ThreadY implements Runnable{
	public void run(){
		for(int j=1;j<=5;j++){
			System.out.println("ThreadY with j= "+2*j);
		}
		System.out.println("Existing ThreadY.....");
	}
}
class ThreadZ implements Runnable{
	public void run(){
		for(int k=1;k<=5;k++){
			System.out.println("ThreadZ with k= "+(2*k-1));
		}
		System.out.println("Existing ThreadZ......");
	}
}
public class Demonstration_112{
	public static void main(String[] args){
		ThreadX x=new ThreadX();
		Thread t1=new Thread(x);
		
		ThreadY y=new ThreadY();
		Thread t2=new Thread(y);
		
		ThreadZ z=new ThreadZ();
		Thread t3=new Thread(z);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("......MultiThreading is over.......");
	}
}
		 