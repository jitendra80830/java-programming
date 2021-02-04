//
public class Nested_loop{
	public static void main(String[] args){
		int p,q;
		System.out.print("The right angle triangle of *");
		for(p=0;p<=9;p++)
		{
			for(q=1;q<=p;q++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}