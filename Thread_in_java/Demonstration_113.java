/*Thread class Methods geId()*/
class ThreadId extends Thread{
	public void run(){
		try{
			//Displaying the thread that is running
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e){
			//Threaing an Exception
			System.out.println("Exception is Caught ");
		}
	}
}
public class Demonstration_113{
	public static void main(String[] args){
		int n=8; //no of Threading
		for(int i=0;i<8;i++){
			ThreadId object=new ThreadId();
			object.start();
		}
	}
}