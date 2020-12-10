//Exception program
import java.lang.*;
class Demonstration_107{
	public static void main(String[] args){
		try{
			int i=args.length;
			String myString[]=new String[i];
			
			if(myString[0].equals("java")){
				System.out.println("first word in java :");
			}
			System.out.println("Number of arguments="+i);
			
			int x=12/i;
			int y[]={555,999}; //y is the an array of size 2 with index o,1
			y[i]=x; // out of range index
		}
		catch (ArithmeticException e){
			System.out.println("Div by zero "+e);
		}
		catch (NullPointerException e){
			System.out.println("a null pointer Exception: "+e);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Error"+e);
		}
	}
}