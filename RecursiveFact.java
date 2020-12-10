//Recursive example
public class RecursiveFact{
	public static int n;
	public static int factorial(int n){
		if(n==0)
			return(1);
		else
			return(n*factorial(n-1));
	}
	public static void main(String args[]){
		RecursiveFact x=new RecursiveFact();
		x.n=Integer.parseInt(args[0]);
		System.out.println("Factorial of :"+factorial(x.n));
	}
}