//fibonacci series
import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of term ");
		int term=sc.nextInt();
		int number1=0;
		int number2=1;
		System.out.print(number1+" "+number2);
		
		for(int i=2;i<term;i++){
			int number3=number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
		}
	}
}
		