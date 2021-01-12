//Array Demo
import java.util.Arrays;

public class ArrayDemo{
	public static void main(String[] args){
		String[] productName={"sumsung","apple","vivo","oneplus"};
		
		System.out.println(Arrays.toString(productName));
		
		//Accessing Item
		System.out.println(productName[0]);
		
		//Edit Item
		
		productName[0]="Realme";
		System.out.println(Arrays.toString(productName));
		
		//Find the length of items
		System.out.println(productName.length);
		
		//travervsing using for loop
		for(int i=0;i<productName.length;i++){
			System.out.println(productName[i]);
		}
		
		//The Foreach loop
		for(String product : productName){
			System.out.println(product);
		}
		
		//2D Array
		int[][] matix={{1,2,3}
					 ,{4,5,6}};
					 
		//print 2D Array
		System.out.println(Arrays.deepToString(matix));
		
		//Accessing Item From 2D Array
		System.out.println(matix[1][1]);
		System.out.println(matix[0][2]);
		
		//Edit Item
		matix[0][1]=200;
		System.out.println(Arrays.deepToString(matix));
		
		//Traversing 2D Array
		for(int[] m:matix){
			for(int j : m){
				System.out.println(j);
			}
		}
					 
			
	}
	
}