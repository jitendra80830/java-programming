/*importing mypackage1*/
import mypackage1.*;

class Demonstration_810{
	public static void main(String[] args){
		Balance current[]=new Balance[3];
		current[0]=new Balance("Ram kumar",200.12);
		current[1]=new Balance("Rahul k",281.1);
		current[2]=new Balance("Manoj k",-172.2);
		
		for(int i=0;i<3;i++){
			current[i].show();
		}
	}
}