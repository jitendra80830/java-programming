//Defining package mypackage1
package mypackage1;

public class X{
	int n=1;
	private int p=2;
	protected int q=3;
	public int r=4;
	
	//A Constructor of the class protection
	public X(){
		System.out.println(" iam Constructor from class X");
		System.out.println("n ="+n);
		System.out.println("p= "+p);
		System.out.println("q= "+q);
		System.out.println("r= "+r);
	}
}