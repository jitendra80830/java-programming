//importing myInterFace pack
import myInterface.*;

public class Demonstration_91 implements anInterface{
	public void display(){
		System.out.println("Fine");
	}
	public static void main(String[] args){
		Demonstration_91 t=new Demonstration_91();
		t.display();
		
		System.out.println("The fine value of a= "+a);
	}
}