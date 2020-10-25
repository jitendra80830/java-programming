class Box{
	double width;
	double height;
	double depth;
	
	double area(){
		double a;
		a=2*(width*height+height*depth+depth*width);
		return a;
	}
	double volume(){
		double v;
		v=width*height*depth;
		return v;
	}
	Box (double a,double b, double c){
		width=a;
		height=b;
		depth=c;
	}
}
class BoxDemo1{
	public static void main(String args[]){
		Box b1=new Box(3.0,4.0,5.0);
		System.out.println("Area of Box="+b1.area());
		System.out.println("Volume of Box="+b1.volume());
	}
}
		