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
class CircleDemo2{
	public static void main(String args[]){
		Circle c1=new Circle();
		Circle c2=new Circle();
		
		c1.x=3.0;
		c1.y=4.0;
		c1.r=5.0;
		c2.x=4.0;
		c2.y=8.0;
		c2.r=10.0;
		
		System.out.println("Circumference1="+c1.circumference());
		System.out.println("Area1="+c1.area());
		System.out.println("Circumference2="+c2.circumference());
		System.out.println("Area2="+c2.area());
	}
}