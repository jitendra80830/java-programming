//Interface Example
interface GeoAnalyzer{
	final static float pi=3.1412F;
	float area();
	float perimeter();
}
class Circle implements GeoAnalyzer{
	float radius;
	Circle(float r){
		radius=r;
	}
	public float area(){
		return(pi*radius*radius);
	}
	public float perimeter(){
		return (2*pi*radius);
	}
}
class Ellipse implements GeoAnalyzer{
	float major;
	float miner;
	
	Ellipse(float m, float n){
		major=m;
		miner=n;
	}
	public float area(){
		return (pi*major*miner);
	}
	public float perimeter(){
		return (pi*(major+miner));
	}
}
class Rectangle implements GeoAnalyzer{
	float length;
	float width;
	
	Rectangle(float l,float w){
		length=l;
		width=w;
	}
	public float area(){
		return (length*width);
	}
	public float perimeter(){
		return (2*(length*width));
	}
}
class Geometry{
	static void display(float x,float y){
		System.out.println("Area= "+x+" "+"Perimeter= "+y);
	}
	public static void main(String[] args){
		Circle c=new Circle(2.3F);
		Ellipse e=new Ellipse(4.5F,2.4F);
		Rectangle r=new Rectangle(4.5F,7.3F);
		
		GeoAnalyzer geoItem;
		geoItem=c;
		display(geoItem.area(),geoItem.perimeter());
		
		geoItem=e;
		display(geoItem.area(),geoItem.perimeter());
		
		geoItem=r;
		display(geoItem.area(),geoItem.perimeter());
	}
}