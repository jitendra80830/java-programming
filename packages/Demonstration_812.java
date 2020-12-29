/*.importing mypackage2*/

import mypackage2.Balance;

class Saving extends Balance{
	String branch;
	int customerId;
	
	Saving(String n,double bal,String br,int id){
		super(n,bal);
		branch=br;
		customerId=id;
	}
	public void show(){
		if(bal<0){
			System.out.println("Soory! Negative Balance");
		}
		System.out.println(name+":$"+bal+" "+branch+" "+customerId);
	}
}
class Demonstration_812{
	public static void main(String[] args){
		Saving current[]=new Saving[3];
		current[0]=new Saving("Ram kumar",120.2,"Gaya",1001);
		current[1]=new Saving("Rahul k",-126.2,"Bodhgaya",1002);
		current[2]=new Saving("Jitendra kumar",6261.2,"Bodhgaya",1002);
		
		for(int i=0;i<3;i++){
			current[i].show();
		}
	}
}