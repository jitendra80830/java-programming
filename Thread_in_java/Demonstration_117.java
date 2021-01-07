/*Setting priority to Thread*/
class ThreadM extends Thread{
	public void run(){
		
		System.out.println("Start ThreadM....");
		for(int i=1;i<=5;i++){
			System.out.println("From ThreadM i= "+i);
		}
		System.out.println("Exit ThreadM......");
	}
}
class ThreadN extends Thread{
	public void run(){
		System.out.println("Start ThreadN.....");
		for(int j=1;j<=10;j++){
			System.out.println("From ThreadN j= "+(2*j-1));
		}
		System.out.println("Exit ThreadN......");
	}
}
class ThreadP extends Thread{
	public void run(){
		System.out.println("Start ThreadP....");
		for(int k=1;k<=10;k++){
			System.out.println("From ThreadP k= "+2*k);
		}
		System.out.println("Exit ThreadP......");
	}
}
public class Demonstration_117{
	public static void main(String[] args){
		ThreadM t1=new ThreadM();
		ThreadN t2=new ThreadN();
		ThreadP t3=new ThreadP();
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(t2.getPriority()+1);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("......End of Execution.......");
	}
}
		