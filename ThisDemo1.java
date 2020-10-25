//'This keyword
class Circle{
	double x,y;
	double r;
	
	double circumference(){
		return 2*3.14159*r;
	}
	double area(){
		return (22/7)*r*r;
	}
	Circle(double x,double y,double r){
		this.x=x;
		this.y=y;
		this.r=r;
	}
}
class ThisDemo1{
	public static void main(String args[]){
		Circle c1=new Circle(3.0,4.0,5.0);
		Circle c2=new Circle(4.0,8.0,12.0);
		
		System.out.println("circumference1="+c1.circumference());
		System.out.println("Area1="+c1.area());
		
		System.out.println("circumference12="+c2.circumference());
		
		System.out.println("Area1="+c2.area());
	}
}
		
		