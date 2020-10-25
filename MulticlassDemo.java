//multiple classes
class Circle{
	double x,y;
	double r;
	
	double circumference(){
		return 2*3.14159*r;
	}
	double area(){
		return (22/7)*r*r;
	}
}
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
}
		
		//declaring object of types of class Circle and Box
class MulticlassDemo{
	public static void main(String args[]){
		Circle c=new Circle();
		Box b=new Box();
		
		c.x=3.0;
		c.y=4.0;
		c.r=5.0;
		b.width=3.0;
		b.height=4.0;
		b.depth=5.0;
		
		System.out.println("Circumference="+ c.circumference());
		System.out.println("Area of Circle="+ c.area());
		System.out.println("Area of Box="+ b.area());
		System.out.println("Vulime="+ b.volume());
	}
}
