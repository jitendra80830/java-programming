//encapsulation
//A class with method
class Point{
	int x,y;
	
	void setPoint(){
		x=10;
		y=20;
	}
	double addVal(){
		int sum;
		sum=x+y;
		return sum;
	}
}
class ClassMethod{
	public static void main(String args[]){
		Point p1=new Point();
		p1.setPoint();
		
		System.out.println("X="+p1.x);
		System.out.println("Y="+p1.y);
		System.out.println("sum="+p1.addVal());
	}
}