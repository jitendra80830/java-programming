//
import java.util.Scanner;

public class FactorialVal{
	public static void main(String[] args){
		int fact=1;
		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
}	