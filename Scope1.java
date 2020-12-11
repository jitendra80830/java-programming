/*A variable declared inside pair of brackets are in a sigle method has scope within the brackect only*/

public class Scope1{
	public static void main(String args[]){
		//The variable x has scope within brackets
		int x=10;
		System.out.println(x);
	}
	//error since variable x is out of scope
	//System.out.println(x);//error
}