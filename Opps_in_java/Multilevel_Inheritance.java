//Multilevel inheritance

class Box{
	private double width;
	private double height;
	private double depth;
	
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	//Compute and return volume
	double volume(){
		return width*height*depth;
	}
}
class BoxWeight extends Box{
	double weight;
	
	BoxWeight(double w,double h,double d,double m){
		super(w,h,d); //call superlass  constructor
		weight=m;
	}
}
class Shipment extends BoxWeight{
	double cost;
	
	Shipment(double w,double h,double d,double m,double c){
		super(w,h,d,m);
		cost=c;
	}
}
class Multilevel_Inheritance{
	public static void main(String[] argss){
		Shipment shipment1=new Shipment(2,3,5,10,8.1);
		Shipment shipment2=new Shipment(6,3,11,3,9.1);
		
		double vol;
		vol=shipment1.volume();
		System.out.println("volume of shipment1: "+vol);
		System.out.println("weight of shipment1: "+shipment1.weight);
		System.out.println("shiping cost of shipment1: "+shipment1.cost);
		System.out.println();
		
		vol=shipment2.volume();
		System.out.println("volume of shipment2: "+vol);
		System.out.println("Weight of shipment2: "+shipment2.weight);
		System.out.println("shiping cost of shipment2: "+shipment2.cost);
	}
}
		
		