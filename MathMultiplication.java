//static eXample
class MathOperation{
	static float mul(float x,float y)
	{
		return x*y;
	}
	static float divide(float x,float y){
		return x/y;
	}
}
public class MathMultiplication{
	public static void main(String[] args){
		float a=MathOperation.mul(4.0f,5.0f);
		float b=MathOperation.divide(8f,2.0f);
		System.out.println("a= "+a+"b= "+b);
	}
}