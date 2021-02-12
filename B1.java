//OverLoading constructer
class A
{
	int a,b;
	
	A(){
		a=b=10;
	}
	A(int x){
		a=b=x;
	}
	A(int x,int y){
		a=x;
		b=y;
	}
	void disp(){
		System.out.println(a+b);
	}
}
public class B1{
	public static void main(String[] args){
		A m=new A();
		A r=new A(4);
		A p=new A(6,8);
		m.disp();
		r.disp();
		p.disp();
	}
}