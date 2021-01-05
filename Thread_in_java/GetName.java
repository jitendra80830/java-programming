/*Thread class Methods geId()*/
class ThreadName extends Thread{
	public void run(){
		try{
			//Displaying the thread that is running
			System.out.println("Thread "+Thread.currentThread().getName()+" is running");
		}
		catch(Exception e){
			//Threaing an Exception
			System.out.println("Exception is Caught ");
		}
	}
}
public class GetName{
	
	public static void main(String[] args){
		int n=8; //no of Threading
		for(int i=0;i<8;i++){
			ThreadName object=new ThreadName();
			object.start();
		}
	}
}