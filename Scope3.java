/*Example of scope of variable in a block*/

class Scope3{
	public static void main(String args[]){
		int x;
		x=10;
		if(x==10){
			int y=20;
			System.out.println("x and y: "+x+"   "+y);
			x=y*2;
		}
		//y=10; //error: out of scope
		System.out.println("x is "+x);
	}
}
		