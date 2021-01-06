//Example of MutiThreading with Runnable Interface
class ThreadId1 implements Runnable{
	public void run(){
		try{
			//Diplaying the thread that is running
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}catch(Exception e){
			System.out.println("Exception is caught");
		}
	}
}
public class RunnableInterface{
	public static void main(String[] args){
		int n=10; //no of threads
		for(int i=0;i<10;i++){
			ThreadId1 t=new ThreadId1();
			Thread t2=new Thread(t);
			t2.start();
		}
	}
}