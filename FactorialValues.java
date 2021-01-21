//Factotial programming
import java.util.Scanner;

public class FactorialValues{
	public static int n;
	
	public static int factorial(int n){
		if(n==0)
			return(1);
		else
			return (n*factorial(n-1));
	}
	public static void main(String[] args){
		FactorialValues x=new FactorialValues();
		x.n=Integer.parseInt(args[0]);
		System.out.print("Factorial of "+n+" is "+factorial(x.n));
	}
}