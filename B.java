class A{
	private int a,b;
	private void get(int x,int y){
		a=x;
		b=y;
	}
	void disp(int x,int y){
		get(x,y);
		System.out.println(a+b);
	}
}
class B{
	public static void main(String[] args){
		A x=new A();
		x.disp(4,6);
	}
}