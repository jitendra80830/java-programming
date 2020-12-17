// ex  of up casting

class Bike{
	void run(){
		System.out.println("running");
	}
}
class Splender extends Bike{
	void run(){
		System.out.println("running saffety with 60km/h");
	}
}
class UpCasting{
	public static void main(String args[]){
		Splender b1=new Splender();
		b1.run();
		Bike b2 =new Bike();
		b2.run();
		
		Bike b3=new Splender(); //up casting
		b3.run();
	}
}  