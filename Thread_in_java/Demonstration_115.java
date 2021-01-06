/*Uses of yield(),stop(),sleep() methods*/
class ClassA extends Thread{
	public void run(){
		System.out.println("Start ThreadA");
		for(int i=1;i<=5;i++){
			if(i==1) yield();
			System.out.println("From ThreadA i= "+i);
		}
		System.out.println("Exit ThreadA.....");
	}
}
class ClassB extends Thread{
	public void run(){
		System.out.println("Start ThreadB");
		for(int j=1;j<=5;j++){
			if(j==2) stop();
			System.out.println("From ThreadB j= "+j);
		}
		System.out.println("Exit ThreadB.....");
	}
}
class ClassC extends Thread{
	public void run(){
		System.out.println("Start ThreadC");
		for(int k=1;k<=5;k++){
			if(k==3){
				try{
					sleep(1000);
				}catch(Exception e){}
			}
		}
		System.out.println("Exit ThreadC.....");
	}
}
public class Demonstration_115{
	public static void main(String[] args){
		ClassA c1=new ClassA();
		ClassB c2=new ClassB();
		ClassC c3=new ClassC();
		c1.start();
		c2.start();
		c3.start();
		
		System.out.println("......End of Execution......");
	}
}

					
					