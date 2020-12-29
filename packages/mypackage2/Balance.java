/*Save this file in mypackage1*/
package mypackage2;

public class Balance{
	public String name;
	public double bal;
	
	public Balance(String n,double b){
		name=n;
		bal=b;
	}
	protected void show(){
		if(bal<0){
			System.out.println("Soory! Negative balance");
		}
		System.out.println(name+":$"+bal);
	}
}