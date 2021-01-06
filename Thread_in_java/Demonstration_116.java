/*uses of Suspemd() method and Resume method*/
class Thread1 extends Thread{
	public void run(){
		try{
			System.out.println("First Thread start");
			sleep(10000);
			System.out.println("First Thread is finished");
		}catch(Exception e){}
	}
}
class Thread2 extends Thread{
	public void run(){
		try{
			System.out.println("Second Thread start");
			System.out.println("Second Thread is suspended itself");
			suspend();
			System.out.println("Second Thread is run Again");
		}catch(Exception e){}
	}
}
public class Demonstration_116{
	public static void main(String[] args){
		try{
			Thread1 first=new Thread1();
			Thread2 second=new Thread2();
			first.start();
			second.start();
			System.out.println("Review the second Thread");
			second.resume(); //if it is suspended
			
			System.out.println("Second Thread went for  10 second spleep");
			second.sleep(10000);
			System.out.println("Wake up second Thread and Finishes running");
			
			System.out.println("......Demonstration is finished.....");
		}catch(Exception e){}
	}
}