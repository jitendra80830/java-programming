/*Example with multiple constructor using super keyword*/
class Point2D{
	double x,y;
	Point2D(){ //Default initializing
	x=0.0;
	y=0.0;
	}
	Point2D(double x,double y){
		this.x=x;
		this.y=y;
	}
}
class Point3D extends Point2D{
	double z;
	Point3D(){ //Default initializing
	super();
	z=0.0;
	}
	Point3D(double x,double y,double z){
		super(x,y);
		this.z=z;
		double sum;
		sum=x+y+z;
		System.out.println("sum :"+sum);
	}
}
class TestSuper4{
	public static void main(String args[]){
		Point3D d=new Point3D(2.0,3.0,4.0);
	}
}