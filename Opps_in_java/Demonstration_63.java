/*Exanple of a superclass variable refereing to a subclass object*/
class Box{
	double width;
	double height;
	double depth;
	
	Box(){ //default constructor
	}
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	double volume(){//compute and return value
		return width*height*depth;
	}
}
class BoxWeight extends Box{
	double weight;
	
	BoxWeight(double w,double h,double d,double m){
		width=w;
		height=h;
		depth=d;
		weight=m;
	}
}
class Demonstration_63{
	public static void main(String[] args){
		BoxWeight boxweight=new BoxWeight(3,5,6,2);
		Box box=new Box();
		double vol;
		vol=boxweight.volume();
		System.out.println("Volume of boxweight: "+vol);
		
		System.out.println("weight of boxweight: "+boxweight.weight);
		System.out.println();
		
		//assign boxweight refereing to Box reference
		box=boxweight;
		vol=box.volume(); //define in box
		System.out.println("Volume of Box: "+vol);
		
		//the following statement is invalid because box does not define a weight member
		//System.out.println("Weight of box: "+box.weight);
	}
}
		
		
	
	
		
	
		