//Find the Prime no
import java.util.Scanner;

public class PrimeNo{
	public static void main(String[] args){
		int n;
		int i=2;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();
		while(i<=n/2){
			if(n%i==0){
				flag=1;
			}
			i++;
		}
		if(flag==1)
			
			System.out.println("Not prime");
		else
			System.out.println("prime");
	}
}