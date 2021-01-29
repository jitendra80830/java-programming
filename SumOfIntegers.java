//Print the sum of n number o(1)TC
import java.util.Scanner;
public class SumOfIntegers{
	public static void main(String[] args){
		int sum=0;
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		number=sc.nextInt();
		
		for(int i=1;i<=number;i++){
			sum+=i;
		}
		System.out.print("Sum of n Integers  "+sum);
	}
}