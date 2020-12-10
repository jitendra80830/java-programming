//Recursive 
public class RecursiveFib{
	public static int n;
	public static int fibonacci(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return(fibonacci(n-1) + fibonacci(n-2));
	}
	public static void main(String args[]){
		RecursiveFib x=new RecursiveFib();
		x.n=Integer.parseInt(args[0]);
		for(int i=0;i<x.n;i++){
			System.out.println(x.fibonacci(i));
		}
	}
}