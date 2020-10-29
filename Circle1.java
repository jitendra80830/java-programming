//culculate the radius and area of circle
import java.util.Scanner;
class Circle1{
	public static void main(String args[]){
		System.out.println("Enter the radius: ");
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		double area=3.14159*radius*radius;
		
		System.out.println("Area is "+area);
	}
}
