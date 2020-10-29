//The program How to take input using scanner class
import java.util.Scanner;
class ScannerInput{
	
	public static void main(String args[]){
		
		
		Scanner scnr=new Scanner(System.in);
		//culculate the max value of two numbers
		System.out.println("Enter the two number for find max value: ");
	
		int a=scnr.nextInt();
		int b=scnr.nextInt();
		if (a>b){
			
			System.out.println("maximum is "+a);
		}
		
		else{
			
			
			System.out.println("maximum is "+b);
		}
	}
}
	
	