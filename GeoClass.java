/*java static scpe rule*/
class Box{
	double x=10.0;
	double y=20.0;
	double w=15.0;
	
	double area(){
		return (2*(x*y+y*w+w*x));
	}
}
class Circle{
	double x=0.0;
	double y=0.0;
	double r=5.0;
}
class GeoClass{
	double x=50;
	double y=60;
	
	public static void main(String args[]){
		Box b=new Box();
		Circle c=new Circle();
		
		//System.out.println("Geoclass data:x= "+x);
		System.out.println("Box data= "+b.x);
		System.out.println("Box area : = "+b.area());
		System.out.println("Circle data:x= "+c.x);
		//System.out.println("Circle area = "+c.area());
	}
}