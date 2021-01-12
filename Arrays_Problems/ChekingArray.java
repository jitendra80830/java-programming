//Array present yes or not
public class ChekingArray{
	public static void main(String[] args){
		int[] numbers={14,23,45,15,8,66,11,40};
		boolean IsinArray=false;
		int num=60;
		for(int n : numbers){
			if(n==num){
				IsinArray=true;
				break;
			}
		}
		if(IsinArray){
			System.out.println("Intem is present in Array:");
		}
		else{
			System.out.println("Item is not present in Array:");
		}
	}
}