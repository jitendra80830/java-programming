//Scope program
class Scope2{
	public static void main(String args[]){
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
		//error:out of scope i
		//System.out.println(i);
	}
}