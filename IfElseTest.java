//Even or Odd

public class IfElseTest{
	public static void main(String[] args){
		int number[]={11,22,33,44,12,23,11};
		int even=0;
		int odd=0;
		for(int i=0;i<number.length;i++){
			if(number[i] % 2==0){
				even+=1;
			}
			else{
				odd+=1;
			}
		}
		System.out.println("Even Number : "+even+" odd Number : "+odd);
	}
}