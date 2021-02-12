
class Perimeter{
	int length;
	int breadth;
	
	//default constructor
	Perimeter(){
		length=0;
		breadth=0;
	}
	//parameterized constructor
	Perimeter(int x,int y){
		length=x;
		breadth=y;
	}
	void cal_primeter(){
		int peri;
		peri=2*(length+breadth);
		System.out.println("pertimeter = "+peri);
	}
}
public class Ex_default_c{
	public static void main(String[] args){
		Perimeter p1=new Perimeter();//default constructor
		Perimeter p2=new Perimeter(4,10);//Perimeterized constructor
		
		p1.cal_primeter();
		p2.cal_primeter();
	}
}
	
	