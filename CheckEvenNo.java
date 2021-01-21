//Check even no or not
import java.util.Scanner;
public class CheckEvenNo{
	public static void main(String[] args){
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number! check even or not ");
		number=sc.nextInt();
		if(number%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}
		