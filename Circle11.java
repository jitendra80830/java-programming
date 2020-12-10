//Declaring static method
public class Circle11{
	public double x,y,r;
	//
	//An instance method return the bigger of two circle
	public Circle11 bigger (circle c){ //imstance method
		if (c.r>r) return c;
		else return this;
	}
	//A class method return the bigger of two classes.
	public static double Circle11 bigger (circle a,circle b){ //class method
		if(a.r>b.r) return a;
		else return b;
	}
	
public static void main(String args[]){
		
	 
	Circle11 a=new Circle11(2.0);
	Circle11 b=new Circle11(3.0);
	Circle11 c= a.bigger(b); //call of the instaance meho
		
	Circle11 d=Circle11.bigger(a,b); //call of the class method
}
}