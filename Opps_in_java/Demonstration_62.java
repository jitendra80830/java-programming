/*Inheritance example: Initializing through constructor*/
class Box{
	double width;
	double height;
	double depth;
	
	Box(){
		width=0.0;
		height=0.0;
		depth=0.0;
	}
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	double volume(){ //computr and return value
		return width*height*depth;
	}
}
class BoxWeight extends Box{
	double weight; //weight of box
	
	BoxWeight(double w,double h,double d,double m){
		width=w;
		height=h;
		depth=d;
		weight=m;
	}
}
class Demonstration_62{
	public static void main(String[] args){
		Box mybox1=new Box(3,2.0,5.0);
		BoxWeight mybox2=new BoxWeight(2,3,2.0,6);
		double vol;
		vol=mybox1.volume();
		System.out.println("Volume of mybox1: "+vol);
		
		vol=mybox2.volume();
		System.out.println("Volume of mybox2: "+vol);
		System.out.println("weight of mybox2: "+mybox2.weight);
	}
}
	