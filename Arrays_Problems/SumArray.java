//sum of arrays
public class SumArray{
	public static void main(String[] args){
		int[] numbers={22,11,2,3,4,5,6,10};
		int sum=0;
		
		for(int no : numbers){
			sum=sum+no;
		}
		System.out.println(sum);
	}
}