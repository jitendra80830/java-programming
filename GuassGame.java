//Guase Game
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class GuassGame{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		int jackpote=(int)(Math.random()*100);cmd
		System.out.println("Guass the Number");
		
		int guass=input.nextInt();
		int counter=1;
		
		while(guass!=jackpote){
			if(guass>jackpote){
				System.out.println("Guass lower ");
				guass=input.nextInt();
			}else{
				System.out.println("Guass higher");
				guass=input.nextInt();
			}
			counter++;
		}
		System.out.println("Currect Guass");
		System.out.print("you took ");
		System.out.print(counter);
		System.out.print(" attemts");
	}
}
		