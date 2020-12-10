//Static variable
class CircleStatic{
	static int Circlecount=0; //class variable
	public double x,y,r; //intance variable
	
	public CircleStatic(double x, double y,double r){
		this.x=x;
		this.y=y;
		this.r=r;
		Circlecount++;
	}
	public CircleStatic(double r){
		this(0.0,0.0,r);
		Circlecount++;
	}
	public CircleStatic(CircleStatic c){
		this(c.x,c.y,c.r);
		Circlecount++;
	}
	public CircleStatic(){
		 this(0.0,0.0,0.1);
		 Circlecount++;
	}
	public double circumference(){
		return (2*3.14159*r);
	}
	public double area(){
		return (3.14159*r*r);
	}
		
public static void main(String args[]){
	
			
	CircleStatic c1=new CircleStatic();
	CircleStatic c2=new CircleStatic(5.0);
	CircleStatic c3=new CircleStatic(c1);
	
	System.out.println("c1# "+c1.Circlecount+"c2# "+c2.Circlecount+"c3# "+c3.Circlecount);
		}
}
	